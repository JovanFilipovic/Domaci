package d25_01_2022;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://www.imdb.com/name/nm0000129/?nmdp=1&ref_=nm_ql_4#filmography");
		driver.manage().window().maximize();
		
	}

}
