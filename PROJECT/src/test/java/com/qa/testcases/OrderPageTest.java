package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AddNewPage;
import com.qa.pages.DashboardPage;
import com.qa.pages.LoginPage;
import com.qa.pages.OrdersPage;
@Listeners(com.qa.utils.CustomizedListner.class)
public class OrderPageTest extends TestBase {
	
	LoginPage loginpage;
	DashboardPage dashboardpage;
	OrdersPage orderpage;
	
	public OrderPageTest() {
		super();
			
	}
@BeforeMethod
public void setup() throws InterruptedException {
	System.out.println("initing....");
	Initialization();
	loginpage = new LoginPage();
	dashboardpage=loginpage.CheckValideEmailAndPassword(prop.getProperty("email"), prop.getProperty("password"));
	orderpage=dashboardpage.clickOnOrdersLink();
	
}
	@Test(priority=1)
	public void validatClickOnAddNewUser() {
		orderpage.clickOnAddNewUser();
	}
	
	@Test(priority=2)
	public void validatesearchForOrder() throws InterruptedException {
		orderpage.searchForOrder();
	}
	
	@Test(priority=3)
	public void validateOrderPageTitle() {
		 boolean title=orderpage.checkOrderPageTitle();
		 System.out.println(title);
	}
	
	@Test(priority=4)
	public void validateHelpMenu() {
		 orderpage.checkHelpMenu();
	}
	
	@Test(priority=5)
	public void validateAbanbonedCartslink(){
		 orderpage.checkAbanbonedCartslink();
	}
	
	@Test(priority=6)
	public void validateExportlink(){
		 orderpage.checkExportlink();
	}
	
	@Test(priority=7)
	public void validatecheckRefreshlink(){
		 orderpage.checkRefreshlink();
	}
	
	@Test(priority=8)
	public void validatecheckshowSqlQuerylink(){
		 orderpage.checkshowSqlQuerylink();
	}
	
	@Test(priority=9)
	public void validateExportToSqlManagerlink(){
		 orderpage.checkExportToSqlManagerlink();
	}
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	
	public void tearDown() {
		driver.close();
	}
}
