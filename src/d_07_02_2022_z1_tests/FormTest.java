package d_07_02_2022_z1_tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import d_07_02_2022_z1_pages.FormPage;

public class FormTest {

	WebDriver driver;
	JavascriptExecutor js;
	Actions action;
	FormPage fp;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		action = new Actions(driver);
		fp = new FormPage(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/anast/Desktop/form.html");
		driver.manage().window().maximize();
	}

	@Test
	public void testMethod() {

		fp.getFulName().sendKeys("Glasko Kruketic");
		fp.getEmail().sendKeys("RokiMarciano@gmail.com");
		fp.getDateOfBirth().sendKeys("02.02.02");

		driver.findElement(By.xpath("//input[@name ='gender'][@value ='female']")).click();
		
		String gender = "male";
		fp.getCheckBoxInput(gender).click();

		fp.getCommentSection().sendKeys("Komentari su suvisni");
		Select select = new Select(fp.getDropDownInput());
		select.selectByVisibleText("QA");
		fp.getCheckBoxInput("checkbox");
		fp.getSubmmitButto().click();
		Assert.assertEquals(fp.isSaved(), true);

	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(5000);
		// driver.quit();
	}
}
