package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.base.TestBase;


public class LoginPage extends TestBase {

	@FindBy(xpath="//*[@id=\"logo\"]")
	WebElement PrestaShopLogo;
	
	@FindBy(xpath="//div[contains(text(),'1.6.1.23')]")
	WebElement PrestaLogoText;
	
	@FindBy(xpath=" //h4[@id='shop_name']")
	WebElement TextbelowLogo;
	
	
	@FindBy(xpath="//label[contains(text(),'Email address')]")
	WebElement emailLable;
	
	@FindBy(xpath="//input[@ placeholder=' test@example.com']")
	WebElement emailPlaceholder;
	
	@FindBy(xpath="//input[@placeholder=' Password']")
	WebElement passwordPlaceholder;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement emailId;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement password;
	
	@FindBy(name="submitLogin")
	WebElement logInBtn;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/a[1]\r\n")
	WebElement forgotpassword;
	
	@FindBy(xpath="//input[@id='stay_logged_in']")
	WebElement checkBox;
	
	@FindBy(xpath="//*[@id=\"remind-me\"]/label")
	WebElement stayLogIn;
	
	@FindBy(xpath="//*[@id=\"login-footer\"]/p[1]/a")
	WebElement rightsReserveLink;
	
	@FindBy(xpath="//*[@id=\"login-footer\"]/p[2]/a[1]/i")
	WebElement twitterLogo;
	
	@FindBy(xpath="//i[@class='icon-facebook']")
	WebElement facebookLogo;
	
	@FindBy(xpath="//i[@class='icon-github']")
	WebElement githubLogo;
	
	@FindBy(xpath="//i[@class='icon-google-plus']")
	WebElement googleLogo;
	
	

	//a[contains(text(),'Â© PrestaShopâ„¢ 2007-2019 - All rights reserved')]
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String checkTitle() {
		return driver.getTitle();
	}
	
	
	public boolean checkPrestaShopLogo() {
		return PrestaShopLogo.isDisplayed();
	}
	
	public boolean checkPrestaLogoText() {
		return PrestaLogoText.isDisplayed();
	}
	
	public String takeCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public String takeTextBelowLogo() {
		return TextbelowLogo.getText();
	}
	
	public boolean checkEmailLable() {
		return emailLable.isDisplayed();
	}
	
	
	public String checkEmailPlaceholder() {
		return emailPlaceholder.getAttribute("placeholder");
	}
	
	public String checkPasswordPlaceholder() {
		return passwordPlaceholder.getAttribute("placeholder");
	}
	
	public void checkBlankEmailPassword() throws InterruptedException {
	emailId.sendKeys("");
	password.sendKeys("");
	logInBtn.click();
	Thread.sleep(2000);
		//return "";
	}
	
	public void checkBlankEmailCorrectPassword() throws InterruptedException {
		emailId.sendKeys("");
		password.sendKeys("password");
		logInBtn.click();
		Thread.sleep(2000);
			//return "";
		}
	public void checkValidEmailBlankPassword() throws InterruptedException {
		emailId.sendKeys("admin@javaclassesinpune.com");
		password.sendKeys("");
		logInBtn.click();
		Thread.sleep(2000);
			//return "";
		}
		
	public void checkValidEmailInvalidPassword() throws InterruptedException {
		emailId.sendKeys("admin@javaclassesinpune.com");
		password.sendKeys("abcd");
		logInBtn.click();
		Thread.sleep(2000);
			//return "";
		}
	public void checkInvalidEmailvalidPassword() throws InterruptedException {
		emailId.sendKeys("admin@javaclassesinpune");
		password.sendKeys("password");
		logInBtn.click();
		Thread.sleep(2000);
			//return "";
		}
	public void checkInvalidEmailInvalidPassword() throws InterruptedException {
		emailId.sendKeys("admin@javaclassesinpune");
		password.sendKeys("abcd");
		logInBtn.click();
		Thread.sleep(2000);
			//return "";
		}
	
	public DashboardPage CheckValideEmailAndPassword(String uname,String pwd) throws InterruptedException {
		
		emailId.sendKeys(uname);
		Thread.sleep(2000);
		
		password.sendKeys(pwd);
		Thread.sleep(2000);
		logInBtn.click();
		Thread.sleep(5000);
		
		return new DashboardPage();
			
		}
	
	public void checkButtoncolor() {
		System.out.println("Before mouseover btn color:"+logInBtn.getCssValue("background-color"));
		Actions action=new Actions(driver);
		action.moveToElement(logInBtn).build().perform();
		System.out.println("After mouseover btn color"+logInBtn.getCssValue("color"));
		System.err.println("*****************************************");
	}
	
	
	public String checkForgotPasswordLink(){
		return forgotpassword.getText();
		}
	
	public boolean checkBoxIsSelectedNot(){
		boolean flag= checkBox.isSelected();
		 return flag;
		}
	
	
	public boolean checkBoxIsSelected(){
		checkBox.click();
		boolean flag= checkBox.isSelected();
		return flag;
		}
	public boolean checkStayLoginText(){
		boolean flag=  stayLogIn.isDisplayed();
		 return flag;
		}
	
	public void checkRightsReserveLink() throws InterruptedException{
		rightsReserveLink.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
	}
	
	public boolean checkRightsReserveLinkIsDisplayed() throws InterruptedException{
		return rightsReserveLink.isDisplayed();
		
	}
	
	public void checkTwitterButtoncolor() {
		System.out.println("Before mouseover btn color:"+twitterLogo.getCssValue("background-color"));
		Actions action=new Actions(driver);
		action.moveToElement(twitterLogo).build().perform();
		System.out.println("After mouseover btn color"+twitterLogo.getCssValue("color"));
		System.err.println("*****************************************");
	}
	
	public void checkFacebookButtoncolor() {
		log.info("Before mouseover btn color:"+facebookLogo.getCssValue("background-color"));
		Actions action=new Actions(driver);
		action.moveToElement(facebookLogo).build().perform();
		log.info("After mouseover btn color"+facebookLogo.getCssValue("color"));
		log.info("*****************************************");
	}
	
	public void checkGoogleButtoncolor() {
		System.out.println("Before mouseover btn color:"+googleLogo.getCssValue("background-color"));
		Actions action=new Actions(driver);
		action.moveToElement(googleLogo).build().perform();
		System.out.println("After mouseover btn color"+googleLogo.getCssValue("color"));
		System.err.println("*****************************************");
	}
	
	public void checkGitHubButtoncolor() {
		System.out.println("Before mouseover btn color:"+githubLogo.getCssValue("background-color"));
		Actions action=new Actions(driver);
		action.moveToElement(githubLogo).build().perform();
		System.out.println("After mouseover btn color"+githubLogo.getCssValue("color"));
		System.err.println("*****************************************");
	}
			

	
	public void checkTwitterLogo() throws InterruptedException{
		twitterLogo.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		}
		
	public void checkGithubLogo() throws InterruptedException{
		githubLogo.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		}
	public void checkFacebookLogo() throws InterruptedException{
		facebookLogo.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		}
	public void checkGoogleLogo() throws InterruptedException{
			googleLogo.click();
			Thread.sleep(2000);
			driver.navigate().back();
			
}
}