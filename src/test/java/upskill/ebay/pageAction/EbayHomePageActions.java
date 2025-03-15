package upskill.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import upskill.ebay.pageElements.EbayHomePageLocators;
import upskill.utilities.ReadExcelSheet;
import upskill.utilities.SetupDrivers;

public class EbayHomePageActions {
	
	EbayHomePageLocators EbayHomePageLocatorsObj;
	
	public EbayHomePageActions(){
		EbayHomePageLocatorsObj = new EbayHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomePageLocatorsObj);
	}

	public void searchShoes() throws Exception{
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys(Keys.CLEAR);
		Thread.sleep(5000);
		
		//EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Shoes");
		
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys(ReadExcelSheet.getMapData("items"));
		
		Thread.sleep(5000);
		EbayHomePageLocatorsObj.ddCategory.sendKeys(Keys.DOWN);
		Thread.sleep(5000);
		EbayHomePageLocatorsObj.ddCategory.sendKeys(Keys.DOWN);
		Thread.sleep(5000);
		EbayHomePageLocatorsObj.ddCategory.sendKeys(Keys.UP);
		Thread.sleep(5000);
		EbayHomePageLocatorsObj.btnSearch.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
	}
		
//		
//		//Explicit Wait
//		WebDriverWait explicitWait = new WebDriverWait(SetupDrivers.driver, 10);
//		explicitWait.until(ExpectedConditions.elementToBeClickable(EbayHomePageLocatorsObj.btnSearch));
//		
//		EbayHomePageLocatorsObj.btnSearch.click();
//	}
	
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
	
	public void mouseHoverEbay() throws Exception{
		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(EbayHomePageLocatorsObj.linkMyEbay);
		actions.perform();
		Thread.sleep(5000);
	}
	
	public void clickSummary() throws Exception{
		EbayHomePageLocatorsObj.linkSummary.isEnabled();
		EbayHomePageLocatorsObj.linkSummary.click();
		Thread.sleep(5000);
	}
	
	public void keyboardKeys(){
		EbayHomePageLocatorsObj.btnSearch.sendKeys(Keys.ENTER);
		EbayHomePageLocatorsObj.ddCategory.sendKeys(Keys.UP);
		EbayHomePageLocatorsObj.ddCategory.sendKeys(Keys.DOWN);
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys(Keys.CLEAR);
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys(Keys.DELETE);
	}
	
	public void handleAlert(){
		SetupDrivers.driver.switchTo().alert().accept();
		SetupDrivers.driver.switchTo().alert().dismiss();
		SetupDrivers.driver.switchTo().alert().sendKeys("Good Service");
		SetupDrivers.driver.switchTo().alert().getText();
	}
}