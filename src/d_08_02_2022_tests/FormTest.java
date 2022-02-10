package d_08_02_2022_tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import d_08_02_2022_pages.FormPage;


public class FormTest {
	WebDriver driver;
	JavascriptExecutor js;
	Actions action;
	FormPage fp;
	SoftAssert softAssert;
	WebDriverWait wait;
	DataFormatter df;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		action = new Actions(driver);
		fp = new FormPage(driver);
		softAssert = new SoftAssert();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		df = new DataFormatter();

		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/anast/Desktop/form.html");
		driver.manage().window().maximize();
	}

	@Test
	public void testMethod() throws IOException, InterruptedException {
		
		File file = new File("data/FormData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheet("form");

		for (int i = 1; i < 8; i++) {
			
			String fullName = sheet.getRow(i).getCell(0).getStringCellValue();
			String gender = sheet.getRow(i).getCell(1).getStringCellValue();
			String birthDate = df.formatCellValue(sheet.getRow(i).getCell(2));
			String email = sheet.getRow(i).getCell(3).getStringCellValue();
			String role = sheet.getRow(i).getCell(4).getStringCellValue();
			String waysOfDev = sheet.getRow(i).getCell(5).getStringCellValue();
			String comment = sheet.getRow(i).getCell(6).getStringCellValue();
			
			fp.getFulName().sendKeys(fullName);
			fp.getGenderButton(gender).click();;
			fp.getDateOfBirth().sendKeys(birthDate);
			fp.getEmail().sendKeys(email);
			Select select = new Select(fp.getRoleDropDown());
			select.selectByVisibleText(role);
			fp.getWYSCheckBox(waysOfDev).click();;
			fp.getCommentSection().sendKeys(comment);
			wait.until(ExpectedConditions.elementToBeClickable(fp.getSubmmitButto()));
			fp.getSubmmitButto().click();
			wait.until(ExpectedConditions.invisibilityOf(fp.getMessage()));
			driver.navigate().refresh();
		}

	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
