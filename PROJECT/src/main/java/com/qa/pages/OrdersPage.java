package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class OrdersPage extends TestBase {
@FindBy(xpath="//a[@id='page-header-desc-order-new_order']//i[@class='process-icon-new']")
	WebElement addNewOrder;

@FindBy(xpath="//input[@name='orderFilter_id_order']")
    WebElement idoforder;

@FindBy(xpath="//input[@name='orderFilter_reference']")
WebElement refereceoforder;

@FindBy(xpath="//select[@name='orderFilter_new']")
WebElement newclientoforder;

@FindBy(xpath="//select[@name='orderFilter_country!id_country']")
WebElement deliveryoforder;

@FindBy(xpath="//input[@name='orderFilter_customer']")
WebElement customeroforder;

@FindBy(xpath="//input[@name='orderFilter_total_paid_tax_incl']")
WebElement totaloforder;

@FindBy(xpath="//input[@name='orderFilter_payment']")
WebElement paymentoforder;

@FindBy(xpath="//select[@name='orderFilter_os!id_order_state']")
WebElement statusoforder;

@FindBy(xpath="//button[@id='submitFilterButtonorder']")
WebElement searchBtnoforder;

@FindBy(xpath="//h2[@class='page-title']")
WebElement orderpagetitle;

@FindBy(xpath="//i[@class='process-icon-help']")
WebElement helpMenuOfOrdersPage;

@FindBy(xpath="//span[contains(text(),'Abandoned Carts')]")
WebElement abandonedCartsOfOrdersPage;

@FindBy(xpath="//span[contains(text(),'Abandoned Carts')]")
WebElement plussignAddNew;

@FindBy(xpath="//*[@id=\"desc-order-export\"]/span/i")
WebElement exportlink;

@FindBy(xpath="//span[@class='label-tooltip']//i[@class='process-icon-refresh']")
WebElement refreshlink;

@FindBy(xpath="//i[@class='process-icon-terminal']")
WebElement showSqlQuerylink;
 
@FindBy(xpath="//i[@class='process-icon-database']")
WebElement exportToSqlManagerlink;
 



public OrdersPage() {
	PageFactory.initElements(driver,this);
}
	public AddNewPage clickOnAddNewUser() {
		
		addNewOrder.click();
		return new AddNewPage();
		
		
		
	}
	
	public void searchForOrder() throws InterruptedException {
		
		idoforder.sendKeys("5");
		refereceoforder.sendKeys("KHWLILZLL");
		
		Select select=new Select(newclientoforder);
		select.selectByVisibleText("No");
		
		Select select1=new Select(deliveryoforder);
		select1.selectByVisibleText("United States");
		
		customeroforder.sendKeys("J. DOE");
		
		totaloforder.sendKeys("$71.51");
		
		paymentoforder.sendKeys("Bank wire");
		
		Select select2=new Select(deliveryoforder);
		Thread.sleep(2000);
		select2.selectByIndex(0);
		
		searchBtnoforder.click();	
	}
	
	public boolean checkOrderPageTitle() {
		boolean flag=orderpagetitle.isDisplayed();
		return flag;
		
		
	}
	public void checkHelpMenu() {
		
		helpMenuOfOrdersPage.click();
		driver.navigate().back();
		
	}
	
public void checkAbanbonedCartslink() {
		
	abandonedCartsOfOrdersPage.click();
		driver.navigate().back();
		
	}

public void checkplussignAddNewlink() {
	
	plussignAddNew.click();
		driver.navigate().back();
}		

public void checkExportlink() {
	
	exportlink.click();
		driver.navigate().back();
}	

public void checkRefreshlink() {
	
	refreshlink.click();
		driver.navigate().back();
}	

public void checkshowSqlQuerylink() {
	
	showSqlQuerylink.click();
		driver.navigate().back();
}	

public void checkExportToSqlManagerlink() {
	
	exportToSqlManagerlink.click();
		driver.navigate().back();
}	







}
