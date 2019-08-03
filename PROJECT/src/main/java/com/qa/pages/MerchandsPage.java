package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import com.qa.base.TestBase;

public class MerchandsPage extends TestBase {
	
	@FindBy(xpath="//h2[@class='page-title']")
	WebElement titleofmerchandspage;
	
	@FindBy(xpath="//i[@class='process-icon-help']")
	WebElement helpmenu;
	
	@FindBy(xpath="//label[contains(text(),'Yes')]")
	WebElement enableyes;
	
	@FindBy(xpath="//label[contains(text(),'No')]")
	WebElement enableno;
	
	@FindBy(xpath=" //input[@name='PS_ORDER_RETURN_NB_DAYS']")
	WebElement timelimitofvalidity;
	
	@FindBy(xpath="  //input[@name='PS_RETURN_PREFIX_1']")
	WebElement returnsprefix;
	
	@FindBy(xpath=" //button[@name='submitOptionsorder_return']")
	WebElement savebtn;
	
	public  MerchandsPage() {
		PageFactory.initElements(driver,this);
	}
	
	public boolean checkHeadingOfPage() {
	boolean flag=titleofmerchandspage.isDisplayed();
	return flag;
		
	}
	
	public void CheckClickOnHelp() {
		 helpmenu.click();
		 driver.navigate().back();	
	}
	public void CheckClickOnEnableYes() {
		enableyes.click();
		 
	}
	public void CheckClickOnEnableNo() {
		enableno.click();
		 
	}
	public void CheckTimeLimitOfValidity() {
		timelimitofvalidity.sendKeys("14");
		 
	}
	
	public void CheckReturnsPrefix() {
		returnsprefix.sendKeys("returnsprefix");
		 
	}
	
	public void CheckClickSaveBtn() {
		savebtn.click();
		 
	}
	
	
	
	
	
	
	
}