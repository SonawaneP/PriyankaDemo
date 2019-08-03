package com.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AddNewPage;
import com.qa.pages.DashboardPage;
import com.qa.pages.LoginPage;
import com.qa.pages.OrdersPage;

public class AddNewPageTest extends TestBase {
	
	LoginPage loginpage;
	DashboardPage dashboardpage;
	OrdersPage orderpage;
	AddNewPage addnewpage;
	
	public AddNewPageTest() {
		super();
			
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		System.out.println("initing....");
		Initialization();
		loginpage = new LoginPage();
		dashboardpage=loginpage.CheckValideEmailAndPassword(prop.getProperty("email"), prop.getProperty("password"));
		orderpage=dashboardpage.clickOnOrdersLink();
		addnewpage=orderpage.clickOnAddNewUser();
		
		
	}

	
	@Test(priority=1)
	public void validateAddNewCustomer() {
		addnewpage.clickAddNewCustomer();
		
	}
	
	@Test(priority=2)
	public void validateSwithchToWindow() throws InterruptedException {
		addnewpage.clickAddNewCustomer();
		addnewpage.checkSwithchToWindow();
		
	}
}
