package d04_02_2022;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Zadatak1 {

	WebDriver driver;
	JavascriptExecutor js;
	Actions action;
	Helper1 helper;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		action = new Actions(driver);
		helper = new Helper1();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.get("https://www.kupujemprodajem.com/index.php");
	}

	@Test
	public void proveraSortiranjaCene() throws InterruptedException {

		driver.findElement(By.className("kpBoxCloseButton")).click();
		driver.findElement(By.id("searchKeywordsInput")).sendKeys("iphone", Keys.ENTER);

		js.executeScript("arguments[0].click();",
				driver.findElement(By.xpath("//*[@id='priceSecondSelection']/div/div[1]/div[1]/span[1]")));
		Thread.sleep(500);
		driver.findElement(By.id("has_price_yes")).click();
		driver.findElement(By.id("search_by_price_number_min")).sendKeys("1");

		js.executeScript("arguments[0].click();;", driver.findElement(By.xpath("//*[@id='priceSelection']/input[4]")));
		Thread.sleep(500);

		WebElement sortiraj = driver.findElement(By.xpath("//*[@id='orderSecondSelection']/div/div[1]/div[1]/span"));
		js.executeScript("arguments[0].click();", sortiraj);
		Thread.sleep(1000);

		action.sendKeys(Keys.ARROW_DOWN).perform();
		action.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(500);

		driver.findElement(By.id("searchKeywordsInput")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("searchKeywordsInput")).sendKeys(Keys.ENTER);

		// Uzimanje Elemenata sa prve stranice i njihove cene
		List<WebElement> elementiPrvaStranica = driver.findElements(
				By.xpath("//*[contains (@class, 'clearfix')]//section[contains (@class, 'priceSec')]//span"));
		ArrayList<String> ceneElemenataPrveStranice = new ArrayList<String>();

		for (int i = 0; i < elementiPrvaStranica.size(); i++) {
			ceneElemenataPrveStranice
					.add(helper.getTextfromWebElement(elementiPrvaStranica.get(i)).replaceAll("[^0-9]", ""));
		}

		driver.findElement(By.xpath("//*[contains (@class, 'pageBarHolder clearfix')]//li[position()=last()-1]/a"))
				.click();

		// Uzimanje Elemenata sa zadnje stanice i njihove cene
		List<WebElement> elementiZadnjaStranica = driver.findElements(
				By.xpath("//*[contains (@class, 'clearfix')]//section[contains (@class, 'priceSec')]//span"));
		ArrayList<String> ceneElemenataZadnjaStranice = new ArrayList<String>();

		for (int i = 0; i < elementiZadnjaStranica.size(); i++) {
			ceneElemenataZadnjaStranice
					.add(helper.getTextfromWebElement(elementiZadnjaStranica.get(i)).replaceAll("[^0-9]", ""));
		}

		// Provera cene elemenata
		Assert.assertEquals(
				helper.isBiggerPrice(ceneElemenataPrveStranice.get(0),
						ceneElemenataZadnjaStranice.get(ceneElemenataZadnjaStranice.size() - 1)),
				true, "prvi nije jeftiniji od zadnjeg, Sort ne radi dobro");

	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();

	}
}
