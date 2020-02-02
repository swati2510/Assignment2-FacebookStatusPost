package com.project01.GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


import com.project01.ObjectRepo.HomePage;
import com.project01.ObjectRepo.LogIn;


public class BaseClass  {
	/*GLOBAL OBJECT*/
	
	public static WebDriver driver;
	
	public FileLib flib=new FileLib();
	
	
		
	@BeforeClass
	public void configBC() throws Throwable
	{
	
		
		
		System.out.println("======LAUNCH THE BROWSER========");
		/*Read the browser name from properties file*/
		
		
		String browsername = flib.getPropertyKeyValue("browser");

		if(browsername.equals("firefox")){
			driver = new FirefoxDriver();
		}else if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		    driver = new ChromeDriver();
		}else if(browsername.equals("ie")){
		    driver = new InternetExplorerDriver();
		}
		    driver.manage().window().maximize();
	}

@BeforeMethod
	
	public void configBM() throws Throwable
	
	{
		
	System.out.println("<<<<<LOGIN>>>>>");
	String URL=flib.getPropertyKeyValue("url");
	String USER=flib.getPropertyKeyValue("username");
	String PASSWORD=flib.getPropertyKeyValue("password");
	driver.manage().window().maximize();
	driver.get(URL);
	
	LogIn lp = PageFactory.initElements(driver, LogIn.class);
    lp.loginToApp(USER, PASSWORD);
    Thread.sleep(4000);	
	
	  }
	
	@AfterMethod
	public void configAM() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("<<<<LOGOUT>>>>");
		
		HomePage hp= PageFactory.initElements(driver,HomePage.class);
		hp.logout();
		
		
	}
	
	@AfterClass
	public void configAC()
	{
		System.out.println("=======CLOSE THE BROWSER========");
		//driver.close();
	}
	

}
