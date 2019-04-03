package PDFLAB1;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.*;
import java.awt.AWTException;
import org.openqa.selenium.interactions.Actions;

import java.net.MalformedURLException;
 
public class RightClickExample {
   
    public static WebDriver driver ; 
	public static String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
	public static String URL ="http://spreadsheetpage.com/index.php/file/C35/P10/";
	
    @BeforeClass
    public static void openBrowser()throws Exception
	 {
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-notifications");
		 System.setProperty("webdriver.chrome.driver",driverPath);
		driver = new ChromeDriver(options); 
		driver.manage().window().maximize() ;	
		driver.get(URL);	
		
	 }
    
    
    @Test
    public void rightClickTest() throws AWTException, InterruptedException, MalformedURLException {
        driver.get(URL);
        WebElement element=driver.findElement(By.xpath("//a[text()='smilechart.xls']"));
        
        Actions action = new Actions(driver).contextClick(element);
        action.build().perform();
        
        action.sendKeys(Keys.SHIFT,Keys.ARROW_UP).build().perform();
        action.contextClick(element);
        
        
        /*JavascriptExecutor js = (JavascriptExecutor) driver;

        String javaScript = "var evt = document.createEvent('MouseEvents');"
                        + "var RIGHT_CLICK_BUTTON_CODE = 2;"
                        + "evt.initMouseEvent('contextmenu', true, true, window, 1, 0, 0, 0, 0, false, false, false, false, RIGHT_CLICK_BUTTON_CODE, null);"
                        + "arguments[0].dispatchEvent(evt)";

        js.executeScript(javaScript, element);*/
        
       /* Actions myAction = new Actions(driver); 
        myAction.contextClick(driver.findElement(By.xpath("//a[text()='smilechart.xls']"))).build().perform();
        myAction.sendKeys(Keys.ARROW_DOWN).build().perform();
        myAction.sendKeys(Keys.ARROW_DOWN).build().perform();
        myAction.sendKeys(Keys.ARROW_DOWN).build().perform();
        myAction.sendKeys(Keys.ARROW_DOWN).build().perform();
        myAction.sendKeys(Keys.ENTER).build().perform();*/

        //Actions action = new Actions(driver).contextClick(element);
        //action.build().perform();
        
        //action.sendKeys(Keys.SHIFT ,Keys.ARROW_DOWN).build().perform();
        //action.sendKeys(Keys.SHIFT ,Keys.ARROW_DOWN).build().perform();
        //action.sendKeys(Keys.SHIFT ,Keys.ARROW_DOWN).build().perform();
        //action.sendKeys(Keys.SHIFT ,Keys.ARROW_DOWN).build().perform();
       // action.sendKeys(Keys.SHIFT ,Keys.ARROW_DOWN).build().perform();
        //action.sendKeys(Keys.SHIFT ,Keys.ARROW_DOWN).build().perform();
       
       //action.sendKeys(Keys.ENTER).build().perform();
       
        //Actions myAction = new Actions(driver);
        
        //action.contextClick().sendKeys(Keys.SHIFT , Keys.ARROW_DOWN);
        //action.contextClick().sendKeys(Keys.SHIFT , Keys.ARROW_DOWN);
        //action.contextClick().sendKeys(Keys.SHIFT , Keys.ARROW_DOWN);
      //  action.contextClick().sendKeys(Keys.SHIFT , Keys.ARROW_DOWN);
       // action.build().perform();
        
       
       // Assert.assertEquals(textEdit, "clicked: edit", "Failed to click on Edit link");
        		
     
       // action.contextClick(element).sendKeys(Keys.SHIFT , Keys.ARROW_UP);
       // action.build().perform();
        
       /* WebElement elementEdit=driver.findElement(By.cssSelector(".context-menu-item.icon.icon-Save link as...>span"));
        elementEdit.click();      
        Alert alert=driver.switchTo().alert();
        String textEdit=alert.getText();
        System.out.println("textEdit  :"+textEdit);
        Assert.assertEquals(textEdit,"Clicked on Edit", " Failed to CLick on Edit");*/
        
        
        //action.sendKeys(Keys.SHIFT).sendKeys(Keys.ENTER);
        
        
       /* action.contextClick().sendKeys(Keys.SHIFT , Keys.ARROW_DOWN);
        action.build().perform();
        
        action.contextClick().sendKeys(Keys.SHIFT , Keys.ARROW_UP);
        action.build().perform();
        
        action.contextClick().sendKeys(Keys.SHIFT , Keys.ARROW_UP);
        action.build().perform();*/
        
    }
    
    
    

    public void rightClick(WebElement element) {
        try {
            Actions action = new Actions(driver).contextClick(element);
            action.build().perform();

            System.out.println("Sucessfully Right clicked on the element");
        } catch (StaleElementReferenceException e) {
            System.out.println("Element is not attached to the page document "
                    + e.getStackTrace());
        } catch (NoSuchElementException e) {
            System.out.println("Element " + element + " was not found in DOM "
                    + e.getStackTrace());
        } catch (Exception e) {
            System.out.println("Element " + element + " was not clickable "
                    + e.getStackTrace());
        }
    }

    //@AfterClass
   // public void tearDown() {
      //  driver.quit();
   // }


}