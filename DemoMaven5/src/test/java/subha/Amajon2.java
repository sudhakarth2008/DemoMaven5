package subha;
import org.testng.annotations.Test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
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

public class Amajon2 {

	  public static String baseUrl = "https://www.amazon.in/";
	  public static String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
	  public static WebDriver driver ; 

 @Test
 
 public static void allmethods() throws Exception{
	 Amajon2.openBrowser(); 
	 Amajon2.loginBrowser(); 
	 Amajon2.logout();
	 //Amajon2 
	 
 }
 public static void openBrowser() throws Exception{
  	
 	 System.setProperty("webdriver.chrome.driver",driverPath);
 	 driver = new ChromeDriver(); 
     driver.get(baseUrl);
     driver.manage().window().maximize() ;
     
 }
     
    public static void loginBrowser() throws Exception{
    	 
     
     
     
     Actions actions = new Actions(driver);   
		 
	 WebElement ele=driver.findElement(By.xpath("//span[text()='Sign in'][3]"));
	 Amajon2.wait5seconds();
	 new WebDriverWait(driver, 990000000).until(ExpectedConditions.visibilityOf(ele));	 
	 actions.moveToElement(ele).click().build().perform();
	 Amajon2.wait5seconds();
	   driver.findElement
	   (By.xpath(" //input[@type='email' and @name='email']"))
	   .sendKeys("sudhakarth2008@gmail.com");
	   driver.findElement(By.xpath("//input[@type='submit' and @id='continue']")).click();
	   driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("babli1234");
	   driver.findElement(By.xpath("//input[@type='submit' and @id='signInSubmit']")).click();
     }
    
    
     public static void logout()throws Exception{
    	   
    	 Actions actions = new Actions(driver);
     
    WebElement ele1=driver.findElement(By.xpath("//span[text()='Hello']"));
	new WebDriverWait(driver, 5000).until(ExpectedConditions.visibilityOf(ele1));	 
	actions.moveToElement(ele1).perform();
	Amajon2.wait5seconds();
    WebElement ele2=driver.findElement(By.xpath("//span[text()='Sign Out']"));
	new WebDriverWait(driver, 9000).until(ExpectedConditions.visibilityOf(ele2));	 
	actions.moveToElement(ele2).click().build().perform();
	driver.quit();
  	
 	 
  	}// Ends Before Class  
     
     public static void wait5seconds()throws Exception
	    {
	    	  try {
	    			Thread.sleep(3000);
	    		} catch (InterruptedException e) {
	    					e.printStackTrace();
	    		}
	    	  
	    	
	    }

	
	  //public void afterTest() {
		  	//driver.quit();
		  	
		  	/*signOut_span	= //span[text()='Sign Out']
		  			helloSudhakar_span	   =//span[text()='Hello']
		  			signinsubmit_submit_button =	//input[@type='submit'][@id='signInSubmit']
		  			password_password_textbox =	//input[@type='password'][@name='password']
		  			continue_submit_button	=//input[@type='submit'][@id='continue']
		  			email_email_textbox	=//input[@type='email'][@name='email']
		  			signIn_span	= //span[text()='Sign in'][3]*/

	  }
	  


