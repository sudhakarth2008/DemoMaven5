package honey;

import org.testng.annotations.Test;
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
public class Amajon2 {
	    public static String baseUrl = "https://www.amazon.in/";
    public static String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
    public static  WebDriver driver ; 
    
    @Test
    public static void allMethods()throws Exception
    {
    	Amajon2.openBrowser();
    	Amajon2.loginBrowser();
    	Amajon2.logoutBrowser();
    	//Amajon2.logoutBrowser();
    	Amajon2.closeBrowser();  	
    }
    public static void openBrowser()throws Exception
    {
    	

   	 ChromeOptions options = new ChromeOptions();
   	 options.addArguments("--disable-notifications");
   	 System.setProperty("webdriver.chrome.driver",driverPath);
   	 driver =new ChromeDriver(options);
   	 driver.get(baseUrl);
    	 driver.manage().window().maximize() ;
   	
    	
    }
    public static void loginBrowser()throws Exception
    
    {
    	driver.findElement(By.xpath(OR.helosignin_click)).click();


    	driver.findElement(By.xpath(OR. login_textbox)).sendKeys("sudhakarth2008@gmail.com");

    	driver.findElement(By.xpath(OR.continue_click)).click();
    	
    	Amajon2.wait5seconds();

    	driver.findElement(By.xpath(OR.password_textbox )).sendKeys("babli1234");

    	driver.findElement(By.xpath(OR. login_click)).click();

    	Amajon2.wait5seconds();

    }
    public static void logoutBrowser()throws Exception
    
        {
    	Actions actions = new Actions(driver);  
    	WebElement ele2=driver.findElement(By.xpath(OR.heloyourorder_sp));

    	//Wait10Seconds();
    	Amajon2.wait5seconds();

    	 actions.moveToElement(ele2).build().perform();
    	 
    		Amajon2.wait5seconds();

    	 WebElement ele3=driver.findElement(By.xpath(OR. signout_click));
    	  actions.moveToElement(ele3).click().build().perform();
   }
    public static void closeBrowser()throws Exception
    {
    	driver.quit();
    }
    public static void wait5seconds()throws Exception
    {
    	 try {
 			Thread.sleep(6000);
 		} catch (InterruptedException e) {
 					e.printStackTrace();
 		}
 	
    }
    

		
 

}
