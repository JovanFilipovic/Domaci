package d31_01_20222;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zadatak2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.navigate().to("https://geodata.solutions/");
		driver.manage().window().maximize();

		Select dropdownCountry = new Select(driver.findElement(By.name("country")));
		Select dropdownState = new Select(driver.findElement(By.name("state")));
		Select dropdownCity = new Select(driver.findElement(By.name("city")));

		dropdownCountry.selectByVisibleText("Djibouti");
		dropdownState.selectByVisibleText("Obock");
		dropdownCity.selectByVisibleText("Obock");

		Thread.sleep(5000);
		driver.close();

	}

}
