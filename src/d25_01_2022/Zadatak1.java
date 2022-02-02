package d25_01_2022;

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
		driver.navigate().to("https://www.wikipedia.org/");
		driver.manage().window().maximize();

		List<WebElement> elementi = driver.findElements(By.className("central-featured-lang"));

		for (int i = 0; i < elementi.size(); i++) {
			System.out.println(i + ": " + elementi.get(i).getAttribute("lang"));
		}

		Thread.sleep(3000);
		driver.close();
	}

}
