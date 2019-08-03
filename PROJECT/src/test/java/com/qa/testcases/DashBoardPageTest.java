package com.qa.testcases;

import java.awt.AWTException;


import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DashboardPage;
import com.qa.pages.LoginPage;
@Listeners(com.qa.utils.CustomizedListner.class)
public class DashBoardPageTest extends TestBase {


	LoginPage loginpage;
	DashboardPage dashboardpage;

	DashBoardPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		System.out.println("initing....");
		Initialization();
		loginpage = new LoginPage();
		dashboardpage=loginpage.CheckValideEmailAndPassword(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void validateTitleofDashboard() {
		
		String title=dashboardpage.checkTitle();
		Assert.assertEquals(title, "Dashboard • ShopCartt");
	}
	
	@Test(priority=1)
	public void validateLogoWithVersion() {
		boolean flag=dashboardpage.checkLogoWithVersionIsDisplayed();
		Assert.assertTrue(flag);
		System.out.println(flag);
	}
	
	@Test(priority=2)
	public void validateShopCartText() {
		boolean flag=dashboardpage.checkShopCartTextIsDisplayed();
		Assert.assertTrue(flag);
		System.out.println(flag);
	}
	
	@Test(priority=3)
	public void validateCustomerLogoLink() {
		dashboardpage.checkCustmerLogoLink();
		
		System.err.println("custmerLink present");
	}
	
	@Test(priority=4)
	public void validateShopCartLogoLink() {
		dashboardpage.checkCartLogoLink();
		System.err.println("cartLink present");
	}
	
	@Test(priority=5)
	public void validateShowOrderLink() throws InterruptedException {
		dashboardpage.checkShowOrderLink();
		System.err.println("ShoworderLink present");
	}
	@Test(priority=6)
	public void validateShowAllCustomerLink() throws InterruptedException {
		dashboardpage.checkShowAllCustomerLink();
		System.err.println("ShowoAllCustomerLink present");
	}
	
	@Test(priority=7)
	public void validateShowAllMessages() throws InterruptedException {
		
		dashboardpage.checkShowAllMesseges();
	System.err.println("show all messeges present");

	}
	
	@Test(priority=8)
	public void validateMessageBoxLogo()throws InterruptedException {
		
		dashboardpage.checkMessageBoxLogo();
	System.err.println("msg box present");

	}
	
	@Test(priority=9)
	public void validateQuickAccessBtnColor(){
		
		dashboardpage.checkQuickAccessBtncolor();
	
	}
	
	@Test(priority=10)
	public void validateClickOnQuickAccess(){
		
		dashboardpage.clickOnQuickAccess();
	}
	@Test(priority=11)
	public void validateQuickAccess1Option(){
		boolean flag=dashboardpage.selectFirstOptionOfQuickAccess();
		Assert.assertTrue(flag);
		log.info(flag);
	}
	@Test(priority=12)
	public void validateQuickAccess2Option(){
		boolean flag=dashboardpage.selectSecondOptionOfQuickAccess();
		log.info(flag);
	}
	@Test(priority=13)
	public void validateQuickAccess3Option(){
		boolean flag=dashboardpage.selectThirdOptionOfQuickAccess();
		log.info(flag);
	}
	
	@Test(priority=14)
	public void validateaddCurrentPageToQuickAccess() throws InterruptedException{
		dashboardpage.addCurrentPageToQuickAccess();
	}
	
	@Test(priority=15)
	public void validateConnectToPrestashopMarketPlaceAccountcolor(){
		
		dashboardpage.checkConnectToPrestashopMarketPlaceAccountcolor();
	}
	

	@Test(priority=16)
	public void validateconnectToPrestashopMarketPlaceAccount() throws InterruptedException{
		
		dashboardpage.checkconnectToPrestashopMarketPlaceAccount();
	}
	@Test(priority=17)
	public void validateMyShopLink() throws InterruptedException{
		
		dashboardpage.selectMyShopLink();
	}
	
	@Test(priority=18)
	public void ValidateclickOnSystemAdministrator() throws InterruptedException {
		dashboardpage.checkclickOnSystemAdministrator();
	}
	
	
	@Test(priority=19)
	public void ValidateclickOnSignOutBtn(){
		dashboardpage.checkclickOnSignOutBtn();
	}
	
	@Test(priority=20)
	public void ValidateIsDemoModeBtnEnabled(){
		boolean flag=dashboardpage.checkIsDemoModeBtnEnabled();
		Assert.assertTrue(flag);
		System.out.println(flag);
		
	}
	
	@Test(priority=21)
	public void ValidateClickOnHelpMenuBtn() throws InterruptedException{
		dashboardpage.checkClickOnHelpMenuBtn();
	}
	
	@Test(priority=22)
	public void ValidateColorOfSearchBox(){
		dashboardpage.checkColorOfSearchBox();
	}
	
	@Test(priority=23)
	public void ValidateSearchBoxBtn() throws AWTException, InterruptedException{
		dashboardpage.checkSearchBtn();
	}
	
	@Test(priority=24)
	public void ValidatecountAllLinksOfCurrentPage(){
		dashboardpage.countAllLinksOfCurrentPage();
	}
	
	@Test(priority=25)
	public void ValidateOrderslink() throws InterruptedException{
		dashboardpage.clickOnOrdersLink();
	}
	@Test(priority=38)
	public void ValidateMerchandslink() throws InterruptedException{
		dashboardpage.clickOnMerchands();
	}
	
	@Test(priority=26)
	public void ValidateCatalogLink() throws InterruptedException{
		dashboardpage.clickOnCatalogLink();
	}
	
	@Test(priority=27)
	public void ValiodateClickOnCustomers() throws InterruptedException{
		dashboardpage.checkClickOnCustomers();
	}
	
	@Test(priority=28)
	public void ValidateClickOnPriceRules() throws InterruptedException{
		dashboardpage.clickOnPriceRules();
	}
	
	@Test(priority=29)
	public void ValidateclickOnModulesAndServices() throws InterruptedException{
		dashboardpage.clickOnModulesAndServices();
	}
	@Test(priority=30)
	public void ValidateclickOnShipping() throws InterruptedException{
		dashboardpage.clickOnShipping();
	}
	
	@Test(priority=31)
	public void ValidateclickOnLocalization() throws InterruptedException{
		dashboardpage.clickOnLocalization();
	}
	
	@Test(priority=32)
	public void ValidateclickOnPreferences() throws InterruptedException{
		dashboardpage.clickOnPreferences();
	}
	
	@Test(priority=33)
	public void ValidateclickOnAdvancedParameters() throws InterruptedException{
		dashboardpage.clickOnAdvancedParameters();
	}
	
	@Test(priority=34)
	public void ValidateclickOnAdministration() throws InterruptedException{
		dashboardpage.clickOnAdministration();
	}
	
	
	@Test(priority=35)
	public void ValidateclickOnStates() throws InterruptedException{
		dashboardpage.clickOnStates();
	}
	

	@Test(priority=36)
	public void ValidateClickOnMaximizeDashboard() throws InterruptedException{
		dashboardpage.clickOnmaximizedashboard();
	}
	
	
	@Test(priority=37)
	public void ValidateclickOnContactBtn() throws InterruptedException{
		dashboardpage.clickOnContactBtn();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	
}
