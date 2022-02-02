package d28_01_2022;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");
		driver.manage().window().maximize();
		
		
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.className("add-new")).click();
			driver.findElement(By.id("name")).sendKeys("Roki");
			driver.findElement(By.id("department")).sendKeys("Balboa");
			driver.findElement(By.id("phone")).sendKeys("666666");
			driver.findElement(By.xpath("//*[contains(@class, 'table table-bordered')]/tbody//tr[last()]/td[4]/a[1]"))
			.click();
		}
		
		
	}

}
