package d_07_02_2022_z2_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	// getFlyingNinaProizvod
	// "//*[contains (@class,'product-name')]/a"

	// getQuantity
	// "//input[@id = 'quantity_6203a5945f130']"
	// "//*[@title = 'Qty']"

	// get delete button
	// "//*[contains (@class,'remove')]/a"

	// get empty poruka
	// "//p[contains (@class,'cart-empty woocommerce-info')]"

	// getProductAddeMessage
	// "//*[contains (@class,'woocommerce-message')]/a"

	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFlyingNinaProduct() {
		return driver.findElement(By.xpath("//*[contains (@class,'product-name')]/a"));
	}

	public WebElement getQuantity() {
		return driver.findElement(By.xpath("//*[@title = 'Qty']"));
	}

	public WebElement getDeleteButton() {
		return driver.findElement(By.xpath("//*[contains (@class,'remove')]/a"));
	}

	public WebElement getEmptyMessage() {
		return driver.findElement(By.xpath("//p[contains (@class,'cart-empty woocommerce-info')]"));
	}

}
