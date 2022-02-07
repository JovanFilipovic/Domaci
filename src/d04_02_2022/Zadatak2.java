package d04_02_2022;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Zadatak2 {

	WebDriver driver;
	JavascriptExecutor js;
	Actions action;
	Helper1 helper;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		action = new Actions(driver);
		helper = new Helper1();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.get(
				"https://www.bu.edu/tech/services/cccs/websites/www/wordpress/how-to/sortable-searchable-tables/#:~:text=Adding%20the%20%E2%80%9Csortable%E2%80%9D%20class%20to,cell%20in%20an%20HTML%20table.");
	}

	@Test
	public void testiranjeSorta() throws InterruptedException {

		js.executeScript("arguments[0].scrollIntoView()",
				driver.findElement(By.xpath("//*[contains (@class, 'searchable-header')]")));

		WebElement age = driver.findElement(By.xpath("//*[@id='post-76995']/table[2]/thead/tr/th[2]"));	
		Thread.sleep(1000);
		action.click(age).perform();;
		
		List<WebElement> listaAgeElementa = driver.findElements(By.xpath("//*[contains(@class,'searchable sortable')]//tr/td[2]"));
		assertEquals(helper.compareElementsStringTextSmallestToBigest(listaAgeElementa), true, "Nisu sortirani od najmanjeg do najveceg");
		
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
