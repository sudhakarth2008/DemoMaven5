package Mango1;

import org.testng.annotations.Test;

import Mango1.ExcelApiTest3;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
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
import java.lang.reflect.Constructor;
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
import Mango1.TestBrowser1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import Mango1.apple1;

public class Test1 
{
	
	 @Test  
	 public void Session1() throws Exception
	 {

		    int MYTHREADS = 30;
		    
		    
		    ExecutorService executor = Executors.newFixedThreadPool(MYTHREADS);
		    
		 //   for (int i = 1; i < 3; i++) {
		    	 			
				//Runnable worker = new MyRunnable();
				//executor.execute(worker);
		//	}
		    
		    
		     ExcelApiTest3 eat = new ExcelApiTest3();
			 int numberowsInputdata=eat.getRowCount("E://TC28.xls","Sheet1");
			 
			 for(int i=1;i<numberowsInputdata;i++)
			 {	 
				 String UserName2=eat.getCellData("E://TC28.xls","Sheet1",i,0);
				String Password2=eat.getCellData("E://TC28.xls","Sheet1",i,1);	 
				 
				 Runnable worker = new MyRunnable(UserName2,Password2);
				 executor.execute(worker);
				 	
			 }
		    
		    
		    
		    
			executor.shutdown();
			// Wait until all threads are finish
			while (!executor.isTerminated()) {
	 
			}
			System.out.println("\nFinished all threads");
			
			
		}  //@Test Close
	 
	 
	}	//Session1 Close






   
	 
class MyRunnable implements Runnable {
	
	WebDriver driver ;
    String baseUrl = "https://www.facebook.com/";
    String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
    
    
    String UserName1,Password1;
    
    MyRunnable(String UserName,String Password) {
    	
    	this.UserName1=UserName;
    	this.Password1=Password;
	}
    
    
	@Override
	public void run() {  
		
		try {
			//TestBrowser1.OpenChromeBrowser();
			//Starts here
			
		     ChromeOptions options = new ChromeOptions();
			 options.addArguments("--disable-notifications");
			 System.setProperty("webdriver.chrome.driver",driverPath);
			 driver = new ChromeDriver(options); 
			 driver.manage().window().maximize() ;	
			 driver.get(baseUrl);
			  driver.findElement(By.xpath(" //*[@id='email'] ")).clear();
			  driver.findElement(By.xpath(" //*[@id='email'] ")).sendKeys(UserName1);
		      driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(Password1);
		      driver.quit();
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
