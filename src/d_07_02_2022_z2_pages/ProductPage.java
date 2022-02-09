package d_07_02_2022_z2_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
	// view chart
	// "//*[contains (@class,'button wc-forward')]"

	// add button
	// "//button[@name = 'add-to-cart']"

	// quantity
	// "//input[@id = 'quantity_6203a4b4ed197']"
	// "//*[@title = 'Qty']"   bolje

	WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getViewCartButton() {
		return driver.findElement(By.xpath("//*[contains (@class,'button wc-forward')]"));
	}

	public WebElement getAddButton() {
		return driver.findElement(By.xpath("//button[@name = 'add-to-cart']"));
	}

	public WebElement getQuantity() {
		return driver.findElement(By.xpath("//*[@title = 'Qty']"));
	}

	public WebElement getProductAddeMessage() {
		return driver.findElement(By.xpath("//*[contains (@class,'woocommerce-message')]"));
	}
}
