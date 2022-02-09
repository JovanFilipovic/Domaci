package d_07_02_2022_z2_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
	// getfirstProduct
	// "//*[contains(@class,'products columns-3')]/li[1]"

	WebDriver driver;

	public ProductsPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstProduct() {
		return driver.findElement(By.xpath("//*[contains(@class,'products columns-3')]/li[1]"));
	}
}
