package upskill.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import upskill.ebay.pageElements.EbayHomePageLocators;
import upskill.utilities.SetupDrivers;

public class EbayHomePageActions {
	
	EbayHomePageLocators EbayHomePageLocatorsObj;
	
	public EbayHomePageActions(){
		EbayHomePageLocatorsObj = new EbayHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomePageLocatorsObj);
	}

	public void searchShoes(){
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Shoes");
		
		//Explicit Wait
		WebDriverWait explicitWait = new WebDriverWait(SetupDrivers.driver, 10);
		explicitWait.until(ExpectedConditions.elementToBeClickable(EbayHomePageLocatorsObj.btnSearch));
		
		EbayHomePageLocatorsObj.btnSearch.click();
	}
	
	public void searchPants(){
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Pants");
		EbayHomePageLocatorsObj.btnSearch.click();
	}
	
	public void searchShirts(){
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Shirts");
		EbayHomePageLocatorsObj.btnSearch.click();
	}
	
	public void searchItems(String items){
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys(items);
		EbayHomePageLocatorsObj.btnSearch.click();
	}
	
	public void synchronization(){
		/*	Selenium Wait : 
				1. Implicit wait(Global), 
				2. Explicit wait(Conditional), 
				3. Fluent wait(intermittent) */
			
		//Implicit Wait
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Explicit Wait
		WebDriverWait explicitWait = new WebDriverWait(SetupDrivers.driver, 10);
		explicitWait.until(ExpectedConditions.elementToBeClickable(EbayHomePageLocatorsObj.btnSearch));
		
		//Fluent Wait
		FluentWait fluentWait = new FluentWait(SetupDrivers.driver);								
		fluentWait.withTimeout(10, TimeUnit.SECONDS);
		fluentWait.pollingEvery(2, TimeUnit.SECONDS);
		fluentWait.until(ExpectedConditions.elementToBeClickable(EbayHomePageLocatorsObj.btnSearch));
	}
	
	public void searchStarwars(){
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Starwars");
	}
	
	public void categoryDropdown() throws Exception{
		Select dropDown = new Select(EbayHomePageLocatorsObj.ddCategory);
		dropDown.selectByVisibleText("Books");
		Thread.sleep(5000);
		
/*Other Options
		dropDown.selectByVisibleText("Books");
		Thread.sleep(5000);
		dropDown.deselectByVisibleText("Books");
		Thread.sleep(5000);
		dropDown.selectByValue("625");
		Thread.sleep(5000);
		dropDown.deselectByValue("625");
		Thread.sleep(5000);
		dropDown.selectByIndex(9);
		Thread.sleep(5000);
		dropDown.deselectByIndex(9);
		Thread.sleep(5000);
	*/	
		
	}
	
	public void clickSearch(){
		EbayHomePageLocatorsObj.btnSearch.click();
	}
	
	public void searchKeyword(String Keyword){
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys(Keyword);
	}
	
	public void categoryDropdown(String category){
		Select dropDown = new Select(EbayHomePageLocatorsObj.ddCategory);
		dropDown.selectByVisibleText(category);
	}
}