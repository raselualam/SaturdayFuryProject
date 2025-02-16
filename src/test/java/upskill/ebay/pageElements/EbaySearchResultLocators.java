package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
	
	//Validate Shoes Items
	@FindBy(xpath="//span[2][contains(text(), 'Shoes')]")
	public WebElement txtShoes;
	
	//Validate Pants Items
	@FindBy(xpath="//span[2][contains(text(), 'Pants')]")
	public WebElement txtPants;
		
	//Validate Shirts Items
	@FindBy(xpath="//span[2][contains(text(), 'Shirts')]")
	public WebElement txtShirts;	
	
	//Checkbox Brand Adidas
	@FindBy(xpath="//input[@aria-label='adidas']")
	public WebElement cbxBrandAdidas;

	//Checkbox Brand Nike
	@FindBy(xpath="//input[@aria-label='Nike']")
	public WebElement cbxBrandNike;

	//Checkbox Brand Unbranded
	@FindBy(xpath="//input[@aria-label='Unbranded']")
	public WebElement cbxBrandUnbranded;
	
	//Validate Starwars Items
	@FindBy(xpath="//span[2][contains(text(), 'Starwars')]")
	public WebElement txtStarwars;
	
	
	//Validate Starwars Items
	@FindBy(xpath="//span[2][contains(text(), 'Billie')]")
	public WebElement txtBillie;
	
	
	//Validate Starwars Items
	@FindBy(xpath="//span[2][contains(text(), 'Hawaii')]")
	public WebElement txtHawaii;
	
}


