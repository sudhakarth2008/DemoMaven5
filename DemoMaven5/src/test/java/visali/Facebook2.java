package visali;
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

public class Facebook2 {

	 public static String baseUrl = "https://www.facebook.com/";
	 public static   String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
	 public static WebDriver driver ; 
	 
	 @Test
	 public  static void allmethods()throws Exception{
		 Facebook2.openbrowser();
		 Facebook2.loginbrowser();
		 Facebook2.logoutbrowser();
		 Facebook2.closebrowser();
	 }
	 public  static void openbrowser()throws Exception{
		
		 ChromeOptions options = new ChromeOptions();
	  	 options.addArguments("--disable-notifications");
	  	 System.setProperty("webdriver.chrome.driver",driverPath);
	  	 driver =new ChromeDriver(options);
	  	 driver.get(baseUrl);
	   	 driver.manage().window().maximize() ;
	   	 
	   	  
	 }
	 public  static void loginbrowser()throws Exception{
		 
		 
		 driver.findElement(By.xpath(" //*[@id='email'] ")).sendKeys("sudhakarth2009@gmail.com");
	      driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("babli12345");
	      driver.findElement(By.xpath("//input[@value='Log In'  and @aria-label='Log In']")).click();

	      Facebook2.wait5sec();
 
		 
	 }
	 public  static void logoutbrowser()throws  Exception {
		 
	       
	     driver.findElement(By.xpath("//*[@id='pageLoginAnchor']")).click();
	  	
	     Facebook2.wait5sec();
	     
	     driver.findElement
	     (By.xpath("//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem' and @role='presentation']")).click();
	    
	 
		 
	 }
	 public  static void closebrowser ()throws Exception{
		 driver.quit();
		 
	 }
	 public  static void wait5sec ()throws Exception{
		 
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
						e.printStackTrace();
			}
	     
	 }
	 
}