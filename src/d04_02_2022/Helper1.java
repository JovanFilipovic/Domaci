package d04_02_2022;

import org.openqa.selenium.WebElement;

public class Helper1 {

	public String getTextfromWebElement(WebElement e) {
		return e.getText();
	}
	
	public boolean isBiggerPrice(String a, String b) {
		return Integer.parseInt(a) < Integer.parseInt(b);
	}
	
}
