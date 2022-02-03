package d01_02_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.navigate().to("https://videojs.com/city");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[contains(@class, 'vjs-big-play-button')]")).click();
		
		try {

			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[contains(@class, 'vjs-big-play-button')]")));
			System.out.println("Video se ucitao");
			
		} catch (Exception e) {
			System.out.println("Video se nije ucitao");
		}

	}

}
