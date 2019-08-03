package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
@Listeners(com.qa.utils.CustomizedListner.class)
public class LoginPageTest extends TestBase{
	
	LoginPage loginpage;

	LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		System.out.println("initing....");
		Initialization();
		loginpage = new LoginPage();
		
	}
	
	@Test(priority=1)
	public void validateTitle() {
		log.info("Test 1 starting........");
		String title=loginpage.checkTitle();
		Assert.assertEquals(title, "ShopCartt > Administration panel (PrestaShopâ)");
	}
	
	@Test(priority=2)
	public void validatePrestaLogo() {
		log.info("Test 2 starting........");
		boolean flag=loginpage.checkPrestaShopLogo();
		Assert.assertTrue(flag);
		System.out.println(flag);
	}
	
	
	@Test(priority=3)
	public void validatePrestaLogoText() {
		boolean flag1=loginpage.checkPrestaLogoText();
		Assert.assertTrue(flag1);
		System.out.println(flag1);
	}
	
	@Test(priority=4)
	public void validateCurrentUrl() {
		String title=loginpage.takeCurrentUrl();
		Assert.assertEquals(title, "https://javaclassesinpune.com/projects/shopcart/admin123/index.php?controller=AdminLogin&token=22e58b7a4c2a987f7d1bdb59de85c22f");
	}
	@Test(priority=5)
		public void validateTextBelowLogo() {
			String title=loginpage.takeTextBelowLogo();
			Assert.assertEquals(title,"ShopCartt");
		}
	@Test(priority=6)
	public void validateEmailLable() {
		boolean flag1=loginpage.checkEmailLable();
		Assert.assertTrue(flag1);
		System.out.println(flag1);
	}
	@Test(priority=7)
	public void validateEmailPlaceholder() {
		String title=loginpage.checkEmailPlaceholder();
		Assert.assertEquals(title,"test@example.com");
	}
	
	@Test(priority=8)
	public void validatePasswordPlaceholder() {
		String title=loginpage.checkPasswordPlaceholder();
		Assert.assertEquals(title,"? Password");
	}
	
	@Test(priority=9)
	public void validateBlankEmailPassword() throws InterruptedException {
		loginpage.checkBlankEmailPassword();
		System.out.println("Blank email and password....");
	}
	
	
	@Test(priority=10)
	public void validateBlankEmailAndValidPassword() throws InterruptedException {
		loginpage.checkBlankEmailCorrectPassword();
		System.out.println("Enter EmailId.....");
	}
	/*
	@Test(priority=11)
	public void validateCorrectEmailAndBlankPassword() throws InterruptedException {
		loginpage.checkBlankEmailCorrectPassword();
		System.out.println("Enter EmailId.....");
	}
	
	@Test(priority=12)
	public void validateCorrectEmailAndInvalidPassword() throws InterruptedException {
		loginpage.checkValidEmailInvalidPassword();
		System.out.println("Enter valid password.....");
	}
	
	@Test(priority=13)
	public void validateInvalidEmailAndValidPassword() throws InterruptedException {
		loginpage.checkInvalidEmailvalidPassword();
		System.out.println("Enter valid EmailId.....");
	
	}
	@Test(priority=14)
	public void validateInvalidEmailAndInvalidPassword() throws InterruptedException {
		loginpage.checkInvalidEmailInvalidPassword();
		System.out.println("successfully Login.....");
		//Assert.assertEquals(title,"");
	}
	
	@Test(priority=15)
	public void validEmailAndPassword() throws InterruptedException {
		loginpage.CheckValideEmailAndPassword(prop.getProperty("email"), prop.getProperty("password"));
		System.out.println("successfully Login.....");
		//Assert.assertEquals(title,"");
	}
	
	@Test(priority=16)
	public void validateColorOfLoginBtn() {
		loginpage.checkButtoncolor();
	}
	
	@Test(priority=17)
	public void validateForgotPasswordLink() {
		String title=loginpage.checkForgotPasswordLink();
		Assert.assertEquals(title,"I forgot my password");
		
	}
	
	@Test(priority=18)
	public void validateIscheckBoXSelectedNot() {
		boolean title1=loginpage.checkBoxIsSelectedNot();
		Assert.assertFalse(title1);
		System.err.println(title1);
		
	}
	
	@Test(priority=19)
	public void validateIscheckBoXSelected() {
		boolean title=loginpage.checkBoxIsSelected();	
		Assert.assertTrue(title);
		System.err.println(title);
	}
	
	@Test(priority=20)
	public void validateStayLoginText() {
		boolean title=loginpage.checkStayLoginText();	
		Assert.assertTrue(title);
		System.err.println(title);
	}
	@Test(priority=21)
	public void validateRighReserveLink() throws InterruptedException {
		loginpage.checkRightsReserveLink();	
	}
	
	@Test(priority=22)
	public void validateTwitterLogo() throws InterruptedException {
		loginpage.checkTwitterLogo();
	}
	
	@Test(priority=23)
	public void validateFacebookLogo() throws InterruptedException {
		loginpage.checkFacebookLogo();
	}
	
	@Test(priority=24)
	public void validateGithubLogo() throws InterruptedException {
		loginpage.checkGithubLogo();
	}
	
	
	@Test(priority=25)
	public void validateGoogleLogo() throws InterruptedException {
		loginpage.checkGoogleLogo();
	}
	
	@Test(priority=26)
	public void validateColorOfTwitterLogo() {
		loginpage.checkTwitterButtoncolor();
	}
	
	@Test(priority=27)
	public void validateColorOfFacebookLogo() {
		loginpage.checkFacebookButtoncolor();
	}
	
	@Test(priority=28)
	public void validateColorOfGoogleLogo() {
		loginpage.checkGoogleButtoncolor();
	}
	
	@Test(priority=29)
	public void validateColorOfGitHubLogo() {
		loginpage.checkGitHubButtoncolor();
	}
	
	@Test(priority=30)
	public void validateRightsReserveLinkIsDisplayed() throws InterruptedException {
		loginpage.checkRightsReserveLinkIsDisplayed();
	}
	*/
	
	@AfterMethod
	public void tearDown() {
		log.info("closing browser.....");
		driver.close();
	}
}
