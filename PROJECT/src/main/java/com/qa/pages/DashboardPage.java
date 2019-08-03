package com.qa.pages;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.base.TestBase;

public class DashboardPage extends TestBase {
@FindBy(xpath="//a[@id='header_shopversion']")
WebElement LogowithVersion;

@FindBy(xpath="//a[@id='header_shopname']")
WebElement shopCarttText;

@FindBy(xpath="//*[@id=\"orders_notif\"]/a")
WebElement cartLogoLink;

@FindBy(xpath="/html[1]/body[1]/header[1]/nav[1]/div[1]/ul[1]/li[2]/a[1]/i[1]")
WebElement customerLogoLink;

@FindBy(xpath="//*[@id=\"customers_notif\"]/a")
WebElement ShowOrderLink;

@FindBy(xpath="//*[@id=\"customers_notif_wrapper\"]/div[3]/a")
WebElement ShowallCustomerLink;

@FindBy(xpath="//a[@class='dropdown-toggle notifs']//i[@class='icon-envelope']")
WebElement msgBox;

@FindBy(xpath="//*[@id=\"customer_messages_notif_wrapper\"]/div[3]/a")
WebElement showMesseges;

@FindBy(xpath=" //a[@id='quick_select']")
WebElement quickAccess;

@FindBy(xpath="//*[@id=\"header_quick\"]/li/ul/li[1]/a")
WebElement options1OfQuickAccess;

@FindBy(xpath="//*[@id=\"header_quick\"]/li/ul/li[2]/a")
WebElement options2OfQuickAccess;

@FindBy(xpath="//*[@id=\"header_quick\"]/li/ul/li[3]/a")
WebElement options3OfQuickAccess;

@FindBy(xpath="//a[@class='ajax-quick-link']")
WebElement addCurrentPage;

@FindBy(xpath="//span[contains(text(),'Connect to PrestaShop Marketplace account')]")
WebElement connectToPrestashopMarketPlaceAccount;

@FindBy(xpath="//*[@id=\"modal_addons_connect\"]/div/div/div[1]/button")
WebElement clickCloseOnAlertOfPrestashopMarketPlaceAccount;

@FindBy(xpath="//*[@id=\"header_foaccess\"]/span[1]")
WebElement clickOnMyShop;

@FindBy(xpath="//*[@id=\"employee_infos\"]/a/span[2]")
WebElement clickOnSystemAdministrator;

@FindBy(xpath="//a[contains(text(),'My preferences')]")
WebElement clickOnAdministratorAndPreferaces;

@FindBy(xpath="//a[@id='header_logout']")
WebElement clickOnSignOutBtn;

@FindBy(xpath="//i[@class='process-icon-toggle-on']")
WebElement DemoModeBtn;

@FindBy(xpath="//*[@id=\"toolbar-nav\"]/li[2]/a/i")
WebElement helpMenuBtn;

@FindBy(xpath="//i[@id='search_type_icon']")
WebElement colorOfSearchBtn;

@FindBy(xpath="//input[@id='bo_query']")
WebElement clickOnSearch;

@FindBy(xpath="//*[@id=\"maintab-AdminCatalog\"]/a/span")
WebElement clickOnCatalog;

@FindBy(xpath="//a[@class='title']//span[contains(text(),'Orders')]")
WebElement clickOnOrder;

@FindBy(xpath="//li[@id='subtab-AdminOrders']//a[contains(text(),'Orders')]")
WebElement OrdersPage;

@FindBy(xpath="//li[@id='maintab-AdminParentCustomer']//a[@class='title']")
WebElement clickOnCustomers;

@FindBy(xpath="//span[contains(text(),'Price Rules')]")
WebElement clickOnPriceRules;

@FindBy(xpath="//span[contains(text(),'Modules and Services')]")
WebElement clickOnModulesAndServices;


@FindBy(xpath="//span[contains(text(),'Shipping')]")
WebElement clickOnShipping;


@FindBy(xpath="//span[contains(text(),'Localization')]")
WebElement clickOnLocalization;

@FindBy(xpath="//span[contains(text(),'Preferences')]")
WebElement clickOnPreferences;

@FindBy(xpath=" //span[contains(text(),'Advanced Parameters')]")
WebElement clickOnAdvancedParameters;

@FindBy(xpath="//span[contains(text(),'Administration')]")
WebElement clickOnAdministration;

@FindBy(xpath="//li[@id='maintab-AdminParentStats']//a[@class='title']")
WebElement clickOnStates;

@FindBy(xpath="//i[@class='icon-align-justify icon-rotate-90']")
WebElement maximizedashboard;


@FindBy(xpath="//*[@id=\"footer\"]/div[3]/div/a[1]")
WebElement contactBtn;

@FindBy(xpath="//a[contains(text(),'Invoices')]")
WebElement InvoicesLink;

@FindBy(xpath="//*[@id=\"subtab-AdminReturn\"]/a" )
WebElement MerchandsLink;

//a[contains(text(),'Merchandise Returns')]

public DashboardPage() {
	PageFactory.initElements(driver,this);
}

public boolean checkLogoWithVersionIsDisplayed() {
	return LogowithVersion.isDisplayed();
}

public boolean checkShopCartTextIsDisplayed() {
	return shopCarttText.isDisplayed();
}
public void checkCustmerLogoLink() {
	 customerLogoLink.click();
	 driver.navigate().back();
}

public String checkTitle() {
	 String s=driver.getTitle();
	return s;
	 
	 }


//*[@id="customers_notif_wrapper"]/div[3]/a

public void checkShowAllCustomerLink() throws InterruptedException {
	customerLogoLink.click();
	Thread.sleep(2000);

	ShowallCustomerLink.click();
	Thread.sleep(2000);

	driver.navigate().back();
	
}

public void checkCartLogoLink() {
	cartLogoLink.click();
	 driver.navigate().back();
}
public void checkShowOrderLink() throws InterruptedException {
	cartLogoLink.click();
	Thread.sleep(2000);
	ShowOrderLink.click();
	Thread.sleep(2000);
driver.navigate().back();
}


public void checkMessageBoxLogo(){
	msgBox.click();
	driver.navigate().back();
}


public void checkShowAllMesseges() throws InterruptedException{
	msgBox.click();
	Thread.sleep(2000);
	showMesseges.click();
	Thread.sleep(2000);
	driver.navigate().back();
}
public void checkQuickAccessBtncolor() {
	log.info("Before mouseover btn color:"+quickAccess.getCssValue("background-color"));
	Actions action=new Actions(driver);
	action.moveToElement(quickAccess).build().perform();
	log.info("After mouseover btn color"+quickAccess.getCssValue("color"));
	System.err.println("*****************************************");
}

public void clickOnQuickAccess() {
	quickAccess.click();
}

public boolean selectFirstOptionOfQuickAccess() {
	quickAccess.click();
	return options1OfQuickAccess.isDisplayed();
	
}
public boolean selectSecondOptionOfQuickAccess() {
	quickAccess.click();
	return options2OfQuickAccess.isDisplayed();
	
}
public boolean selectThirdOptionOfQuickAccess() {
	quickAccess.click();
	return options3OfQuickAccess.isDisplayed();
	
}

public void addCurrentPageToQuickAccess() throws InterruptedException {
	quickAccess.click();
	Thread.sleep(2000);
	addCurrentPage.click();
	Alert alert=driver.switchTo().alert();
	alert.sendKeys("abcd");
	Thread.sleep(2000);
	alert.dismiss();
	
}
public void checkConnectToPrestashopMarketPlaceAccountcolor() {
	log.info("Before mouseover btn color:"+connectToPrestashopMarketPlaceAccount.getCssValue("background-color"));
	Actions action=new Actions(driver);
	action.moveToElement(connectToPrestashopMarketPlaceAccount).build().perform();
	log.info("After mouseover btn color"+connectToPrestashopMarketPlaceAccount.getCssValue("color"));
	System.err.println("*****************************************");
}


public void checkconnectToPrestashopMarketPlaceAccount() throws InterruptedException {
	connectToPrestashopMarketPlaceAccount.click();
	Set<String> handler=driver.getWindowHandles();
	Iterator<String> itr=handler.iterator();
	
	String ParentWindowId=itr.next();
	log.info("ParentWindowId is:"+ParentWindowId);
	
	String ChildWindowId=itr.next();
	log.info("ChildWindowId is:"+ChildWindowId);
	
	driver.switchTo().window(ChildWindowId);
	log.info("ChildWindow title is:"+driver.getTitle());
	driver.close();
	
	driver.switchTo().window(ParentWindowId);
	log.info("ParentWindow title is:"+driver.getTitle());
	
	connectToPrestashopMarketPlaceAccount.click();
	Thread.sleep(2000);
	driver.switchTo().window("Childwindow");
	//Alert alert=driver.switchTo().alert();
	//alert.sendKeys("abcd");
	Thread.sleep(2000);
	clickCloseOnAlertOfPrestashopMarketPlaceAccount.click();
	//alert.accept();	
	
}
public void selectMyShopLink() throws InterruptedException {
	clickOnMyShop.click();
	Thread.sleep(2000);
	//driver.close();
	//driver.navigate().back();
}


public void checkclickOnSystemAdministrator() throws InterruptedException {
	clickOnSystemAdministrator.click();
	clickOnAdministratorAndPreferaces.click();
	Thread.sleep(2000);
	driver.navigate().back();
	
}

public void checkclickOnSignOutBtn() {
	clickOnSystemAdministrator.click();
	clickOnSignOutBtn.click();
	//Thread.sleep(2000);
	driver.navigate().back();
	
}

public boolean checkIsDemoModeBtnEnabled() {
	return DemoModeBtn.isEnabled();

}

public void checkClickOnHelpMenuBtn() throws InterruptedException {
	helpMenuBtn.click();
	Thread.sleep(2000);
	driver.navigate().back();

}

public void checkColorOfSearchBox(){
	log.info("Before mouseover btn color:"+colorOfSearchBtn.getCssValue("background-color"));
	Actions action=new Actions(driver);
	action.moveToElement(colorOfSearchBtn).build().perform();
	log.info("After mouseover btn color"+colorOfSearchBtn.getCssValue("color"));
	System.err.println("*****************************************");


}

public void checkSearchBtn() throws AWTException, InterruptedException{
	clickOnSearch.click();
	clickOnSearch.sendKeys("orders");
	Thread.sleep(3000);
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
}


public void countAllLinksOfCurrentPage(){
	List<WebElement> al=driver.findElements(By.tagName("a"));
	System.out.println("total links are:"+al.size());
	for(int i=0;i<al.size();i++) {
		String linkText=al.get(i).getText();
		System.out.println(linkText);
	}
}

public OrdersPage clickOnOrdersLink() throws InterruptedException {
//	Actions action = new Actions(driver);
//	action.moveToElement(clickOnOrder).build().perform();
	clickOnOrder.click();
	Thread.sleep(3000);
	return new OrdersPage();
	//driver.navigate().back();	
	
		
}

public void clickOnCatalogLink() throws InterruptedException {
//	Actions action = new Actions(driver);
//	action.moveToElement(clickOnOrder).build().perform();
	clickOnCatalog.click();
	Thread.sleep(3000);
	//return new OrdersPage();
	//driver.navigate().back();	
}	
		
public void checkClickOnCustomers() throws InterruptedException{
	clickOnCustomers.click();
	Thread.sleep(3000);
}

public void clickOnPriceRules() throws InterruptedException{
	clickOnPriceRules.click();
	Thread.sleep(3000);
}
public void clickOnModulesAndServices()throws InterruptedException{
	clickOnModulesAndServices.click();
	Thread.sleep(3000);
}
public void clickOnShipping()throws InterruptedException{
	clickOnShipping.click();
	Thread.sleep(3000);
}

public void clickOnLocalization()throws InterruptedException{
	clickOnLocalization.click();
	Thread.sleep(3000);
}
public void clickOnPreferences()throws InterruptedException{
	clickOnPreferences.click();
	Thread.sleep(3000);
}

public void clickOnAdvancedParameters()throws InterruptedException{
	clickOnAdvancedParameters.click();
	Thread.sleep(3000);
}
public void clickOnAdministration()throws InterruptedException{
	clickOnAdministration.click();
	Thread.sleep(3000);
}

public void clickOnStates()throws InterruptedException{
	clickOnStates.click();
	Thread.sleep(3000);
}

public void clickOnmaximizedashboard()throws InterruptedException{
	maximizedashboard.click();
	Thread.sleep(3000);
}

public void clickOnContactBtn()throws InterruptedException{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollInToView():",contactBtn);
	
	contactBtn.click();
	Thread.sleep(3000);
}
public void clickOnInvoices() {
	Actions action=new Actions(driver);
	action.moveToElement(InvoicesLink).build().perform();
	InvoicesLink.click();
	
}

public MerchandsPage clickOnMerchands() {
	Actions action=new Actions(driver);
	action.moveToElement(clickOnOrder).build().perform();
	action.moveToElement(MerchandsLink).build().perform();
	
	MerchandsLink.click();
	return new MerchandsPage();
	
}


//i[@id='search_type_icon']

//i[@class='process-icon-help']







}
