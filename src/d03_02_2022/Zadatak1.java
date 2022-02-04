package d03_02_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.navigate().to("https://www.google.com/");

		WebElement body = driver.findElement(By.xpath("/html/body"));

		js.executeScript("arguments[0].style = 'background: ' + arguments[1] + arguments[2] + arguments[3]" , body, "bl", "ac", "k");

		Thread.sleep(3000);
		driver.close();
	}

}
