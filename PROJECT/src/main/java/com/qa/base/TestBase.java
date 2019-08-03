package com.qa.base;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

import com.qa.testcases.LoginPageTest;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;
	
	public TestBase(){
	 
		try {
			prop=new Properties();
			FileInputStream fis=new FileInputStream("C:\\workspaceForProject1\\ShopCartProject2\\src\\main\\java\\com\\qa\\"
					+ "config\\config.properties");
			prop.load(fis);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		public static void Initialization(){
			System.out.println("drivr launching...");
			System.setProperty("webdriver.chrome.driver","G:\\JBK mevan\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
			
			//******************to create log******************************//////
			
			log = Logger.getLogger(LoginPageTest.class);
			PropertyConfigurator.configure("C:\\workspaceForProject1\\ShopCartProject2\\src\\main\\java\\com\\qa\\config\\log4j.properties");
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			//driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			System.out.println("website launching...");
			
			driver.get(prop.getProperty("url"));
			
			//driver.get("https://javaclassesinpune.com/projects/shopcart/index.php");
			
		}
		public void onTestFailure(ITestResult result) {
			// TODO Auto-generated method stub
			
		}
		
	}
	

