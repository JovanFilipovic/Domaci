package d03_02_2022;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.navigate().to("https://www.wikipedia.org/");

		List<WebElement> jezici = driver.findElements(By.xpath("//*[@id='www-wikipedia-org']/div[2]//a"));

		String script = "";
		script += "for (i = 0; i < arguments[0].length; i++) {";
		script += "	window.open(arguments[0][i])";
		script += "}";

		js.executeScript(script, jezici);

		driver.close();

	}

}
