package d01_02_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.navigate().to("https://www.udemy.com/courses/search/?src=ukw&q=slksd");
		driver.manage().window().maximize();

		driver.findElement(By.xpath(("//button[contains(@class, 'language-selector-button--button--1wgoL')][1]")))
				.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		boolean pokazao;
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath("//*[contains(@class, 'udlite-modal-title udlite-heading-lg')]")));
			pokazao = true;
		} catch (Exception e) {
			pokazao = false;
		}

		if (pokazao) {
			System.out.println("Dijalog se pokazao");
		} else {
			System.out.println("Dijalog se nije pokazao");
		}

		Thread.sleep(3000);
		driver.close();

	}

}
