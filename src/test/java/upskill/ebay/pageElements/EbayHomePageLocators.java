package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomePageLocators {
	
	//Search Text Box
	@FindBy(xpath="//input[@placeholder='Search for anything']")
	public WebElement txtbxSearch;
	
	//Search Button
	@FindBy(xpath="//button[@value='Search']")
	public WebElement btnSearch;
	
	//Category Dropdown
	@FindBy(xpath="//select[contains(@aria-label, 'category')]")
	public WebElement ddCategory;
}

