package com.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class AddNewPage extends TestBase {
	
	@FindBy(xpath="//*[@id=\"search-customer-form-group\"]/div/div/div[2]/a")
	WebElement addnewcustomer;

	@FindBy(xpath="//*[@id=\"firstname\"]")
	WebElement firstname;		
	
	
	
	public AddNewPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void clickAddNewCustomer() {
		addnewcustomer.click();	
	}
	
	public void checkSwithchToWindow() throws InterruptedException {
		
	/*Set<String> handler=driver.getWindowHandles();
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
	
	*/
	//driver.switchTo().window("Childwindow");
		
		//firstname.sendKeys("Anuja");
		//Thread.sleep(2000);
	driver.switchTo().frame("div[@class='fancybox-overlay fancybox-overlay-fixed']");
	driver.switchTo().frame("fancybox-frame1557745574354");
	//fancybox-frame1557745574354"
	firstname.sendKeys("Anuja");
	
	}
	
}
