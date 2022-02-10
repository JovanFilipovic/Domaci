package d_08_02_2022_pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormPage {
	
	WebDriver driver;

	public FormPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFulName() {
		return driver.findElement(By.id("first-name"));
	}

	public WebElement getDateOfBirth() {
		return driver.findElement(By.id("dob"));
	}

	public WebElement getEmail() {
		return driver.findElement(By.id("email"));
	}

	public WebElement getCommentSection() {
		return driver.findElement(By.id("comment"));
	}

	public WebElement getRoleDropDown() {
		return driver.findElement(By.id("role"));
	}

	public WebElement getSubmmitButto() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));

		return driver.findElement(By.id("submit"));
	}

	public WebElement getGenderButton(String radioValue) {
		return driver.findElement(By.xpath("//input[@name ='gender'][@value ='" + radioValue + "']"));
	}

	public WebElement getWYSCheckBox(String checkboxValue) {
		return driver.findElement(By.xpath("//*[@type='checkbox' and @value='" + checkboxValue + "']"));
	}

	public boolean isSaved() {
		return driver.findElement(By.xpath("//div[contains (@class, 'message-element poruka')]")).getAttribute("style")
				.contentEquals("visibility: visible;");
	}
	public WebElement getMessage() {
		return driver.findElement(By.xpath("//div[contains (@class, 'message-element poruka')]"));
	}
	public boolean isMessageHidden() {
		return driver.findElement(By.xpath("//div[contains (@class, 'message-element poruka')]")).getAttribute("style")
				.contentEquals("visibility: hidden;");
	}
}
