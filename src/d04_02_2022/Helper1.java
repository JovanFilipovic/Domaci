package d04_02_2022;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Helper1 {

	public String getTextfromWebElement(WebElement e) {
		return e.getText();
	}

	public boolean isBiggerPrice(String a, String b) {
		return Integer.parseInt(a) < Integer.parseInt(b);
	}

	public boolean isSmallerOrEqualString(String a, String b) {
		return Integer.parseInt(a) <= Integer.parseInt(b);
	}

	public boolean isBigerOrEqualString(String a, String b) {
		return Integer.parseInt(a) >= Integer.parseInt(b);
	}

	public boolean compareElementsStringTextSmallestToBigest(List<WebElement> elements) {
		for (int i = 0; i < elements.size()-1; i++) {
			if (!isSmallerOrEqualString(getTextfromWebElement(elements.get(i)),
					getTextfromWebElement(elements.get(i + 1)))) {
				return false;
			}
		}
		return true;
	}

	public boolean compareElementsIntsTextBigestToSmallest(List<WebElement> elements) {
		for (int i = 0; i < elements.size(); i++) {
			if (!isBigerOrEqualString(getTextfromWebElement(elements.get(i)),
					getTextfromWebElement(elements.get(i + 1)))) {
				return false;
			}
		}
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
