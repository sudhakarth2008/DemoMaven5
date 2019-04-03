package subha;

import org.testng.annotations.Test;

import subha.ExcelApiTest3;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.apache.commons.io.FileUtils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.ie.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.sql.Timestamp;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

import java.io.File;
import java.io.*;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import java.net.*;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.*;
 
public class Facebook2

{
		public static String baseUrl = "https://www.facebook.com/";
		public static   String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
	    public static WebDriver driver ; 
	   
	    //Get InputData from E://TC15.xls
	    public static String Uname,Pwd;
	    
@Test
public static void callallMethods()throws Exception
	    {
			
			Facebook2.openBrower();
	    	Facebook2.baseUrl();
	    	Facebook2.emailName();
	    	Facebook2.password();
	    	Facebook2.clickButon();
	    	Facebook2.invokeButton();
	    	Facebook2.logoutBrowser();
	    	Facebook2.closeBrowser();
	    	
	    	
	    	//Facebook2.loginuptosubmit();
	    	//Facebook2.loginBrowser();
	    	//Facebook2.emailName();
	    	//Facebook2.password();
	    	//Facebook2.clickButon();
	 	    
	    }

		public static void GetInputData() throws Exception
		{
			
			try {
				  ExcelApiTest3 eat = new ExcelApiTest3();
				   Facebook2.Uname=eat.getCellData("E://TC15.xls","Sheet1",1,0);
				   System.out.println("Uname is "+Uname);
				   Facebook2.Pwd=eat.getCellData("E://TC15.xls","Sheet1",1,1);
				  System.out.println("Uname is "+Pwd);
				  
		
		    }catch(Exception e) { }
		}





	    public static void openBrower()throws Exception
	    {
	    	 
	    	 ChromeOptions options = new ChromeOptions();
	   	 options.addArguments("--disable-notifications");
	   	 System.setProperty("webdriver.chrome.driver",driverPath);
	   	 driver =new ChromeDriver(options);
	   	// driver.get(baseUrl);
	    	 driver.manage().window().maximize() ;
	    	 
	   	
	    }
	    public static void baseUrl()throws Exception
	    {
	    	 //public static String baseUrl = "https://www.facebook.com/";
	    	driver.get(baseUrl);
	 
	    }
	    public static void invokeButton()throws Exception
	    {
	    	 driver.findElement(By.xpath(OR.LogoutInvokeButton)).click();
	    }
	    
	    public static void password()throws Exception
	    {
	    	Facebook2.GetInputData();
	   	 	driver.findElement(By.xpath(OR.Password)).sendKeys(Facebook2.Pwd);
	    }
	    
	    public static void emailName()throws Exception
	    {
	    	Facebook2.GetInputData();
	       	driver.findElement(By.xpath(OR.email)).sendKeys(Facebook2.Uname);
	    }
	    

	    public static void clickButon()throws Exception
	    {
	    	
	    	Facebook2.wait5seconds();
	    	Facebook2.wait5seconds();  
	    	driver.findElement(By.xpath(OR.LoginSubmit)).click();
	    	 Facebook2.wait5seconds();

	    }

	    public static void logoutBrowser()throws Exception
	    {
	    //	  driver.findElement(By.xpath(" //div[text()='Account Settings']   ")).click();

	    	  Facebook2.wait5seconds();  
	    	  
	    	  driver.findElement(By.xpath(OR.LogoutButton)).click();

	    	
	    }

	    public static void closeBrowser()throws Exception
	    {
	    	driver.quit();
	    	/*
			driver.findElement(By.xpath(OR.email)).sendKeys("sudhakarth2008@gmail.com");
			driver.findElement(By.xpath(OR.Password)).sendKeys("sudhakarth2008@gmail.com");
			driver.findElement(By.xpath(OR.LoginSubmit)).click();
			driver.findElement(By.xpath(OR.LogoutInvokeButton)).click();
			driver.findElement(By.xpath(OR.LogoutButton)).click();
			
			*/
	    	
	    }

	    public static void wait5seconds()throws Exception
	    {
	    	  try {
	    			Thread.sleep(3000);
	    		} catch (InterruptedException e) {
	    					e.printStackTrace();
	    		}
	    	  
	    	
	    }
	    
	    public static void loginuptosubmit()throws Exception
	    {
	    	Facebook2.emailName();
	    	Facebook2.password();
	    	Facebook2.clickButon();
	    	
	    	
	    }
	    
	    

}
