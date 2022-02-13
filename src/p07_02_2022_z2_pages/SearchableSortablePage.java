package p07_02_2022_z2_pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SearchableSortablePage {

	private WebDriver driver;
	private WebElement table;
	Actions action;

	public SearchableSortablePage(WebDriver driver, int table) {
		this.driver = driver;
		this.table = driver.findElement(By.xpath("//table[" + table + "]/tbody"));
		action = new Actions(driver);
	}

	public List<WebElement> getAllRows() {
		return this.table.findElements(By.xpath("tr"));
	}
	

	public WebElement getTableHeader() {
		return driver.findElement(By.xpath("//*[contains (@class, 'searchable-header')]"));
	}

	public int getAllCellsFromColumn(String columnName) {
		if (columnName.equals("Age")) {
			return 2;
		} else if (columnName.equals("Athlete")) {
			return 1;
		} else if (columnName.equals("Country")) {
			return 3;
		} else if (columnName.equals("Gold Medals")) {
			return 4;
		}
		return 0;
	}

	public WebElement getSearchInput() {
		return driver.findElement(By.xpath("//input[@class ='search']"));
	}

	private int[] sortiranje = { 0, 0, 0, 0, 0 };

	public void sortAscendingByColumn(String columnName) throws InterruptedException {

		if (sortiranje[getAllCellsFromColumn(columnName)] == 0) {	
			action.click(driver.findElement(By.xpath("//table[2]/thead/tr/th[" + getAllCellsFromColumn(columnName) + "]"))).perform();
			sortiranje[getAllCellsFromColumn(columnName)] = 1;
		
		} else if (sortiranje[getAllCellsFromColumn(columnName)] == -1) {
			action.click(driver.findElement(By.xpath("//table[2]/thead/tr/th[" + getAllCellsFromColumn(columnName) + "]"))).perform();
			sortiranje[getAllCellsFromColumn(columnName)] = 1;

		}
	}

	public void sortDescendingByColumn(String columnName) throws InterruptedException {

		if (sortiranje[getAllCellsFromColumn(columnName)] == 0) {
			action.click(driver.findElement(By.xpath("//table[2]/thead/tr/th[" + getAllCellsFromColumn(columnName) + "]"))).perform();
			action.click(driver.findElement(By.xpath("//table[2]/thead/tr/th[" + getAllCellsFromColumn(columnName) + "]"))).perform();
			sortiranje[getAllCellsFromColumn(columnName)] = -1;
		
		} else if (sortiranje[getAllCellsFromColumn(columnName)] == 1) {
			action.click(driver.findElement(By.xpath("//table[2]/thead/tr/th[" + getAllCellsFromColumn(columnName) + "]"))).perform();
			sortiranje[getAllCellsFromColumn(columnName)] = -1;

		}

	}

	public boolean dobarDesendingSort(String columnName) {
		
		boolean dobarDesendingSort = true;
		for (int i = 0; i < getAllRows().size() - 1; i++) {

			if (getAllRows().get(i).findElement(By.xpath("td[" + getAllCellsFromColumn(columnName) + "]")).getText()
					.compareTo(getAllRows().get(i + 1)
							.findElement(By.xpath("td[" + getAllCellsFromColumn(columnName) + "]")).getText()) < 0) {
				dobarDesendingSort = false;
			}
		}
		return dobarDesendingSort;
	}

	public boolean dobarAscendingSort(String columnName) {
		
		boolean dobarAscendingSort = true;
		for (int i = 0; i < getAllRows().size() - 1; i++) {

			if (getAllRows().get(i).findElement(By.xpath("td[" + getAllCellsFromColumn(columnName) + "]")).getText()
					.compareTo(getAllRows().get(i + 1)
							.findElement(By.xpath("td[" + getAllCellsFromColumn(columnName) + "]")).getText()) > 0) {
				dobarAscendingSort = false;
			}
		}
		return dobarAscendingSort;
	}

}
