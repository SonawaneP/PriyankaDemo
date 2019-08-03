package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AddNewPage;
import com.qa.pages.DashboardPage;
import com.qa.pages.LoginPage;
import com.qa.pages.MerchandsPage;
import com.qa.pages.OrdersPage;

public class MerchandsPageTest extends TestBase {
	
	LoginPage loginpage;
	DashboardPage dashboardpage;
	OrdersPage orderpage;
	AddNewPage addnewpage;
	MerchandsPage merchandpage;

public  MerchandsPageTest() {
	super();
		
}

@BeforeMethod
public void setup() throws InterruptedException {
	System.out.println("initing....");
	Initialization();
	loginpage = new LoginPage();
	dashboardpage=loginpage.CheckValideEmailAndPassword(prop.getProperty("email"), prop.getProperty("password"));
	//orderpage=dashboardpage.clickOnOrdersLink();
	//addnewpage=orderpage.clickOnAddNewUser();
	merchandpage=dashboardpage.clickOnMerchands();
	
}
@Test(priority=1)
public void validateTitleOfMerchandsPage() {
	boolean flag= merchandpage.checkHeadingOfPage();
	log.info(flag);
}
@Test(priority=2)
public void validateHelpMenu() {
	 merchandpage.CheckClickOnHelp();

}

@Test(priority=3)
public void validateEnableYes() {
	 merchandpage.CheckClickOnEnableYes();

}

@Test(priority=4)
public void validateEnableNo() {
	 merchandpage.CheckClickOnEnableNo();

}

@Test(priority=5)
public void validateReturnsPrefix() {
	 merchandpage.CheckReturnsPrefix();
}

@Test(priority=6)
public void validateTimeLimitOfValidity() {
	 merchandpage.CheckTimeLimitOfValidity();

}
@Test(priority=7)
public void validateSavebtn() {
	 merchandpage.CheckClickSaveBtn();
}

@AfterMethod
public void tearDown() {
	driver.close();
}











}