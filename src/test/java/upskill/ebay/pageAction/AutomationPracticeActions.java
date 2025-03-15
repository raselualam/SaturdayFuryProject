package upskill.ebay.pageAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.AutomationPracticeLocators;
import upskill.ebay.pageElements.EbayHomePageLocators;
import upskill.utilities.SetupDrivers;

public class AutomationPracticeActions {
	
	AutomationPracticeLocators AutomationPracticeLocatorsObj;
	
	public AutomationPracticeActions(){
		AutomationPracticeLocatorsObj = new AutomationPracticeLocators();
		PageFactory.initElements(SetupDrivers.driver, AutomationPracticeLocatorsObj);
	}
	
	public void loadAutomationPage() throws Exception{
		SetupDrivers.driver.get("https://www.upskillconsultancy.com/automation-practice");
		Thread.sleep(5000);
	}
	
	public void switchIframe(){
		SetupDrivers.driver.switchTo().frame("htmlComp-iframe");
	}

	public void writeTextbox() throws Exception{
		AutomationPracticeLocatorsObj.txtbxAutomation.sendKeys("Tesla");
		Thread.sleep(5000);
	}
	
	public void clickIframeHome(){
		
		List<WebElement> framelist = SetupDrivers.driver.findElements(By.name("htmlComp-iframe"));
		
		for(int i = 0; i<framelist.size(); i++){
			SetupDrivers.driver.switchTo().frame(i);
			
			try {
				AutomationPracticeLocatorsObj.txtbxAutomation.sendKeys("Tesla");
			} catch (Exception e){
				System.out.println("Element not found in iframe");
			}
		}
	}
	
	public void handleIframe(){
		
		//i find iframe using iframe tag in DOM or HTML
		//i use switchTo().frame() to switch iframes
		
		//Switch iframe by Index
		SetupDrivers.driver.switchTo().frame(0);
		SetupDrivers.driver.switchTo().frame(1);
		
		//Switch iframe by Name or ID
		SetupDrivers.driver.switchTo().frame("iframe-name");
		SetupDrivers.driver.switchTo().frame("id");
		
		//Switch back to previous iframe
		SetupDrivers.driver.switchTo().defaultContent();
		SetupDrivers.driver.switchTo().parentFrame();
		SetupDrivers.driver.switchTo().frame("parent");
		
		//nested iframe
		SetupDrivers.driver.switchTo().frame("inner");
		SetupDrivers.driver.switchTo().frame("child");
	} 
	
	public void javaScriptExecutor(){
		
		JavascriptExecutor js = (JavascriptExecutor)SetupDrivers.driver;	//Creating JS object
		
		js.executeScript("");
			
		js.executeScript("EbaySearchResultLocatorsObj.cbxBrandNike.click();"); //Clicking on element
		
		js.executeScript("EbayHomePageLocatorsObj.txtbxSearch.value ='shirt';"); //Writing something
		
		js.executeScript("EbaySearchResultLocatorsObj.cbxBrandNike.checked=true;"); //Interect Checkbox
		
		js.executeScript("window.location = 'http://upskill.com';"); // initializing location
		
		js.executeScript("location.reload()"); 						//Refresh browser
		
		js.executeScript("alert('Confirmation');");					//Alert
		
		js.executeScript("window.scrollBy(0,500)", ""); 			//Scroll down to specific pixel
		
		js.executeScript("window.scrollBy(0,-500)", ""); 			//Scroll up to specific pixel
		
		js.executeScript("arguments[0].scrollIntoView();", AutomationPracticeLocatorsObj.txtbxAutomation);  //Scroll to a object
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //Scroll down to bottom of website
	}
}
