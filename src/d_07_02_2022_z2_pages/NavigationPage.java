package d_07_02_2022_z2_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationPage {
	// get shop link
	// "//*[contains(@class,'page_item page-item-7')]/a"

	WebDriver driver;

	public NavigationPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getShopLink() {
		return driver.findElement(By.xpath("//*[contains(@class,'page_item page-item-7')]/a"));
	}
}
