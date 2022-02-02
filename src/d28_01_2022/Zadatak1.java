package d28_01_2022;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj zvezdice koju zelite(1-5): ");
		int i = s.nextInt();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://s.bootsnipp.com/iframe/WaXlr");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("rating-star-" + i)).click();
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
