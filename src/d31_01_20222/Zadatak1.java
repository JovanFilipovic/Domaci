package d31_01_20222;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://s.bootsnipp.com/iframe/Dq2X");
		driver.manage().window().maximize();

		List<WebElement> elementi = driver.findElements(By.xpath("//*[contains(@class, 'col-md-12')]//button"));

		for (int i = 1; i <= elementi.size(); i++) {

			driver.findElement(By.xpath("//*[contains(@class, 'col-md-12')]//div[last()]/button")).click();
			
			Thread.sleep(1000);
			
			List<WebElement> brisanjaElemenata = driver
					.findElements(By.xpath("//*[contains(@class, 'col-md-12')]//button"));

			if (brisanjaElemenata.size() == elementi.size() - i) {

				System.out.println("Obrisan");
			} else {
				System.out.println("Nije obrisan");
			}
		}

		driver.close();

	}

}
