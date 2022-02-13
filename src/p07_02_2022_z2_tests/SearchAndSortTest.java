package p07_02_2022_z2_tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.opentelemetry.sdk.trace.samplers.SamplingDecision;
import p07_02_2022_z2_pages.SearchableSortablePage;

public class SearchAndSortTest {

	WebDriver driver;
	JavascriptExecutor js;
	Actions action;
	SearchableSortablePage ssp;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		action = new Actions(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();

	}

	@Test(enabled = true)
	public void searchTableTest() throws InterruptedException {

		driver.navigate().to("https://www.bu.edu/tech/services/cccs/websites/www/wordpress/how-to/sortable-searchable-tables/");

		ssp = new SearchableSortablePage(driver, 2);

		String search = "ur";
		ssp.getSearchInput().sendKeys(search);

		for (int i = 0; i < ssp.getAllRows().size(); i++) {

			List<WebElement> tdElementi = ssp.getAllRows().get(i).findElements(By.tagName("td"));
			boolean sadrziTekstElement = false;
			for (int j = 0; j < 4; j++) {
				if (tdElementi.get(j).getText().toLowerCase().contains(search.toLowerCase())) {
					sadrziTekstElement = true;
				}
			}
			assertEquals(sadrziTekstElement, true, "Ne sadrzi svaki red unesenu vrednost");
		}
	}

	@Test(enabled = true)
	public void sortTableTest() throws InterruptedException {

		driver.navigate().to("https://www.bu.edu/tech/services/cccs/websites/www/wordpress/how-to/sortable-searchable-tables/");

		ssp = new SearchableSortablePage(driver, 2);
		js.executeScript("arguments[0].scrollIntoView()", ssp.getTableHeader());

		String columnName = "Age";

		ssp.sortAscendingByColumn(columnName);
		assertEquals(ssp.dobarAscendingSort(columnName), true, "Nije dobar Ascending Sort");

		ssp.sortDescendingByColumn(columnName);
		assertEquals(ssp.dobarDesendingSort(columnName), true, "Nije dobar desending Sort");
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
