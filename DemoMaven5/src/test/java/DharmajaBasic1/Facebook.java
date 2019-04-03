package DharmajaBasic1;
import org.testng.annotations.Test;

import SamSung.OR;

//import Orange_Pim.OR;

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
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import java.net.*;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.*;
import java.util.NoSuchElementException;

public class Facebook {
	
    public String baseUrl = "https://www.facebook.com/";
    String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
    public WebDriver driver ; 

  @Test
  public void b_verifyHomepageTitle() throws Exception{
	  
	
	  
	  driver.findElement(By.xpath(" //*[@id='email'] ")).clear();
	  driver.findElement(By.xpath(" //*[@id='email'] ")).sendKeys("sudhakarth2009@gmail.com");
      driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("babli12345");
      driver.findElement(By.xpath("//input[@value='Log In'  and @aria-label='Log In']")).click();

	  try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
	  
     driver.findElement(By.xpath("//*[@id='pageLoginAnchor']")).click();
  	
     try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
     
     driver.findElement
     (By.xpath("//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem' and @role='presentation']")).click();
    
	}   // Ends Before Test      
  
 
 
  
  //Starts Before Test
  @BeforeTest
  public void setBaseURL() throws InterruptedException
	{
 	/* ChromeOptions options = new ChromeOptions();
	 options.addArguments("--disable-notifications");
	 System.setProperty("webdriver.chrome.driver",driverPath);
	 driver =new ChromeDriver(options);
	 driver.get(baseUrl);
 	 driver.manage().window().maximize() ;*/
	  System.setProperty("webdriver.ie.driver",
		"C:\\Users\\sudhakar\\Desktop\\seleni\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");


		 
		 //DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		 //capabilities.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
		// driver = new InternetExplorerDriver(capabilities);
		 driver = new InternetExplorerDriver();
		 
		
		 //driver = new InternetExplorerDriver();
		 driver.manage().window().maximize();
		 driver.get(baseUrl);

		// driver.quit();
	 	 
 	 
 	 
	}
 	 
 	 //Actions actions = new Actions(driver);
 	 
 


	  @AfterTest
	  public  void closeBrowser() throws Exception{
		    if (driver == null) {
		        return;
		    }
		    driver.quit();
		    driver = null;
		}
	  
	  
	  
	  @Test
	  public void MyFAQS() throws Exception{
		  
		  
		  //WebDriver driver1= new FirefoxDriver();
		  WebDriver driver1= new ChromeDriver();
		  EventFiringWebDriver driver2 = new EventFiringWebDriver(driver1);
		  driver2.executeScript("document.getElementById(\"name\")");
		  driver2.executeScript("document.getElementById(\"name\").value=\"test\"  ");
		  
		  //How to Handle Single Main Window
		  String handle= driver.getWindowHandle();
		  driver.findElement(By.xpath("New Message Window")).click(); 
		  		  
		  //How to Handle Multiple Windows
		  Set <String> WindowsId= driver.getWindowHandles();
		  Iterator<String> iterator = WindowsId.iterator();
		  ArrayList<String> ids = new ArrayList<String>();
		  while(iterator.hasNext())
		  {
			  ids.add(iterator.next());
		  }
		  driver.switchTo().window(ids.get(3));
		  driver.findElement(By.xpath("")).isDisplayed();
		  driver.close();
		  
		  driver.switchTo().window(ids.get(2));
		  driver.findElement(By.xpath("")).isDisplayed();
		  driver.close();
		  
		  driver.switchTo().window(ids.get(0));
		  driver.findElement(By.xpath("")).isDisplayed();
		  driver.close();
		  
		  // How to maximize window
		  driver.manage().window().maximize();
		  
		  //How to get Window x,y posotions
		  Point position= driver.manage().window().getPosition();
		  position.getX();
		  position.getY();
		  
		  //How to get Webelement  x,y locations
		  Point location= driver.findElement(By.xpath("")).getLocation();
		  location.getX();
		  location.getY();
		  
		  
		 
		  
		  
		  // How to Switch Frames
		  driver.switchTo().frame(0);  // By index
		  driver.switchTo().frame("Child Frame"); // By Frame Name
		  driver.switchTo().parentFrame(); // Back to Parent Frame
		  driver.switchTo().defaultContent(); // Default Fisrt Frame
		  
		  
		  
		  //Handling alerts
		  driver.findElement(By.name("Alert Box")).click();
		  Alert alert= driver.switchTo().alert();
		 

		  alert.accept();
		  alert.dismiss();
		  alert.getText();
		  alert.sendKeys("UserName");
		  //or 
		  driver.switchTo().alert().accept();
		  driver.switchTo().alert().dismiss();
		  driver.switchTo().alert().getText();
		  driver.switchTo().alert().sendKeys("UserName");
		  driver.switchTo().alert().sendKeys("Password");
		  //Alert alert= driver.switchTo().alert()
		
		  
		  // Implicit wait
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		  //Explicit Wait
		 // WebElement element=driver.findElement(By.xpath(""));
		  WebDriverWait wait=  new WebDriverWait(driver,120);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR.ADMIN_FOCUS) ) ) ;
		  driver.findElement(By.xpath(OR.ADMIN_FOCUS)).click();
		  
		  //FluentWait
		  WebDriverWait wait2=  new WebDriverWait(driver,240);
		  wait2.pollingEvery(60,TimeUnit.SECONDS);
		  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("") ) ) ;
		  driver.findElement(By.xpath(OR.ADMIN_FOCUS)).click();
		  
		  
		  
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("") ) ) ;
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(""))); 
		  wait.until(ExpectedConditions.elementToBeSelected(By.xpath("")));
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		 
		  
		  //Fluent Wait
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		  WebDriverWait wait2=  new WebDriverWait(driver,60);
		  wait2.pollingEvery(5,TimeUnit.SECONDS);
		  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("") ) ) ;
		  
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.	  
		WebElement wait3= new FluentWait<WebDriver>(driver)
		.withTimeout(60, TimeUnit.SECONDS)
		.pollingEvery(5,TimeUnit.SECONDS).
		ignoring(NoSuchElementException.class)
		.until(ExpectedConditions.presenceOfElementLocated(By.xpath(""))); 
		wait3.click();
		
		//How can we get exact time to load a page using Selenium WebDriver?
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		
		
		//How to check mouse movement on specific web element and click ?
		WebElement target=driver.findElement(By.xpath("") );
		Actions action = new Actions(driver);
		action.moveToElement(target).build().perform();
		action.moveToElement(target).click().build().perform();
		
        //How to double click specic web element
		action.moveToElement(element).doubleClick();
		action.contextClick(target);
		action.sendKeys(target, "UserName");
		action.sendKeys(target, "Password");
		  
		
		// How to drag and drop
		WebElement Source1=driver.findElement(By.xpath("") );
		WebElement Target1=driver.findElement(By.xpath("") );
		action.dragAndDrop(Source1, Target1);
		
		// How to select Dropdown Values
		Select select = new Select (driver.findElement(By.xpath("")));
		select.selectByIndex(0);
		select.selectByValue("Value");
		select.selectByVisibleText("By Visible Text");
		
		// Identify WebELement Locator
		  driver.findElement(By.cssSelector("")).sendKeys("");
		  driver.findElement(By.cssSelector("")).click();
		  driver.findElement(By.className(""));
		  driver.findElement(By.id(""));
		  driver.findElement(By.name(""));
		  driver.findElement(By.linkText(""));
		  driver.findElement(By.partialLinkText(""));
		  driver.findElement(By.tagName(""));
		  driver.findElement(By.xpath(""));
		 
		  driver.findElements(By.cssSelector(""));
		  driver.findElements(By.className(""));
		  driver.findElements(By.id(""));
		  driver.findElements(By.name(""));
		  driver.findElements(By.linkText(""));
		  driver.findElements(By.partialLinkText(""));
		  driver.findElements(By.tagName(""));
		  driver.findElements(By.xpath(""));
		  
		   //check Number of tags present in Dom
	         List  list= driver.findElements(By.tagName("Ifreame"));
			 int count=list.size(); // ruturns zero records if no elements
			 
			 List  list1= driver.findElements(By.tagName("a"));
			 int count1=list1.size();
			 
			 WebElement  ele= driver.findElement(By.tagName("a")); //returens NoSuchELement Visible Exception
			 ele.getText();
			
		
			 
		driver.findElement(By.id("")).getAttribute("").contains("checked");	 
		driver.findElement(By.id("")).clear();	 
		driver.findElement(By.id("")).submit();
		
		driver.getCurrentUrl();
		driver.close();
		driver.quit();
		driver.get("");
		
	//	what is the difference between driver.get(""); and driver.navigate().to("");
		
		driver.navigate().to("");
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		
		
		//System.exit(0);
		
		


		
		// How to check an Webelement is present or not ?
		Boolean str= driver.findElement(By.xpath("")).isDisplayed();
		Boolean str1= driver.findElement(By.xpath("")).isEnabled();
		Boolean st21= driver.findElement(By.xpath("")).isSelected();
		
		//Find element by tagname
		driver.findElements(By.tagName("a"));
		
		//Find number of Hyperlinks in a webpage
		driver.get("http://www.google.com");
		 List <WebElement> list7 = driver.findElements(By.tagName("a"));
		 System.out.println("Number of links: "+list7.size());
		
		 //print the above number of links
		 for(int i = 0; i < list7.size(); i++){ 
		 System.out.println(list7.get(i).getText());
		 }
		
	  // How to take screenshot
	  File SRCFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  
	  
	 
	  
	  
	  
	  
	  
	  
	  }	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}                                   
