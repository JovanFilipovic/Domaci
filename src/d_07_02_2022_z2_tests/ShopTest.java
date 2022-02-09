package d_07_02_2022_z2_tests;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import d_07_02_2022_z2_pages.CartPage;
import d_07_02_2022_z2_pages.NavigationPage;
import d_07_02_2022_z2_pages.ProductPage;
import d_07_02_2022_z2_pages.ProductsPage;

public class ShopTest {
	WebDriver driver;
	JavascriptExecutor js;
	Actions action;
	NavigationPage navPage;
	ProductPage productPage;
	ProductsPage productsPage;
	CartPage cartPage;
	SoftAssert softAssert;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		action = new Actions(driver);
		navPage = new NavigationPage(driver);
		productPage = new ProductPage(driver);
		productsPage = new ProductsPage(driver);
		cartPage = new CartPage(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get("http://cms.demo.katalon.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void testMethod() throws InterruptedException {
		navPage.getShopLink().click();
		Thread.sleep(500);
		productsPage.getFirstProduct().click();
		Thread.sleep(500);
		productPage.getQuantity().clear();
		Thread.sleep(500);
		productPage.getQuantity().sendKeys("2");
		Thread.sleep(500);
		productPage.getAddButton().click();
		Thread.sleep(500);

		boolean tacnaPoruka = false;
		if (productPage.getProductAddeMessage().getText().contains("“Flying Ninja” have been added to your cart.")) {
			tacnaPoruka = true;
		}
		Assert.assertEquals(tacnaPoruka, true, "Nije tacna poruka");

		productPage.getViewCartButton().click();
		Thread.sleep(500);
		boolean nazivProizvodaTacan = false;
		if (cartPage.getFlyingNinaProduct().getText().equals("Flying Ninja")) {
			nazivProizvodaTacan = true;
		}
		Thread.sleep(500);

		Assert.assertEquals(nazivProizvodaTacan, true, "Nije tacan naziv proizvoda");
		Assert.assertEquals(cartPage.getQuantity().getAttribute("value"), "2");

		cartPage.getDeleteButton().click();
		Thread.sleep(500);
		Assert.assertEquals(cartPage.getEmptyMessage().getText(), "Your cart is currently empty.", "Nije dobra poruka");

	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
