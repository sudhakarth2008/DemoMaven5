package Reporting;
//import MercuryDemoTours;


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
import java.text.SimpleDateFormat;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;
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
import SamSung.*;

import java.awt.Desktop;
import java.io.*;



public class TestHTMLReporter2 {
	


		@Test
		public  void MyHtml() throws IOException {

			
			  String HtmlOutputFileName= CretaeHTMLFile();
			  HTMLScreenShot("1","Enter on user Name","	Succefully Entered","Pass",HtmlOutputFileName,"ScreenShotPath");
			  HTMLScreenShot("2","Enter on Pass Name","	Succefully Entered","Pass",HtmlOutputFileName,"ScreenShotPath");
			  HTMLScreenShot("3","Click on Sign In","	Failed to Click ","Fail",HtmlOutputFileName,"ScreenShotPath");
			  HTMLScreenShot("4","Verify Page Title","Title is not matching","Fail",HtmlOutputFileName,"ScreenShotPath");
			  HTMLCloser(HtmlOutputFileName);
			
		}
		
		
		
	public String  CretaeHTMLFile() throws IOException
	{
		

		 SimpleDateFormat sdfDate1 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		 Date now1 = new Date();
		 String strDate1 = sdfDate1.format(now1);
		 String HtmlOutputFileName="C:\\Users\\sudhakar\\Desktop\\HTML Report\\HTMLReport" +"_"+strDate1 +".html";
		  
		
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream(HtmlOutputFileName), "utf-8"))) {
			writer.close();
		}catch (IOException ex) {} 
		
		File f1=new File("C:\\Users\\sudhakar\\Desktop\\HTML Report\\HtmlReport3.html");
		File f2=new File(HtmlOutputFileName);
		FileUtils.copyFile(f1, f2);          
	
		return HtmlOutputFileName;
	
	}
		
		
		
		
		
	public void HTMLScreenShot(String SNo,String Steps,String Details,String Status,String HtmlOutputFileName,String ScreenShotPath) throws IOException
	{
		

		FileWriter fw = new FileWriter(HtmlOutputFileName,true); 
		
		 String PassScreenShot="E://Batch2//TC01//TC01_Chrome_Iteration_1_TC01_2019_02_17_07_19_30//TC01_Chrome_Iteration_1_2019_02_17_07_19_32.png";
		 String FaiScreenShot="E://Batch2//TC01//TC01_Chrome_Iteration_1_TC01_2019_02_17_07_19_30//TC01_Chrome_Iteration_1_2019_02_17_07_19_32.png";
		 
		 
		 SimpleDateFormat sdfDate1 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		 Date now1 = new Date();
		 String strDate1 = sdfDate1.format(now1);
		 
		
		
		fw.write("\n <tr> ");
		
				
	    fw.write("\n   <td width=\"5%\">"
	    		+ SNo
	    		+ "</td> ");
	    
	    
	    fw.write("\n  <td width=\"15%\">"
	    		+ Steps
	    		+ "</td> ");
	       
	    fw.write("\n  <td width=\"15%\">"
	    		+ Details
	    		+ "</td>  ");
	    
	    
	    if (Status.equals("Pass"))
	    {
	    
	    fw.write("\n  <td width=\"5%\">  ");
	    fw.write("\n   <b>Pass</b>&nbsp    ");
	    fw.write("\n    <img src=\"C:\\Users\\sudhakar\\Desktop\\HTML Report\\PASS_FAIL\\PASS2.JPG\" alt=\"PASS\"></td> ");
	   
	    fw.write("\n   <td width=\"10%\"> <a href=" + PassScreenShot + " target=\"popup\" "
	    		+ "onclick=\"window.open('"
	    		+ PassScreenShot
	    		+ "','popup','width=600,height=600'); return false;\">Pass ScreenShot</a></td> ");
	    
	    }

	    if (Status.equals("Fail"))
	    {
	    
	    	fw.write("\n  <td width=\"5%\">  ");
		    fw.write("\n   <b>Fail</b>&nbsp    ");
		    fw.write("\n    <img src=\"C:\\Users\\sudhakar\\Desktop\\HTML Report\\PASS_FAIL\\FAIL1.JPEG\" alt=\"FAIL\"></td> ");
		   
		    fw.write("\n   <td width=\"10%\"> <a href=" + FaiScreenShot + " target=\"popup\" "
		    		+ "onclick=\"window.open('"
		    		+ FaiScreenShot
		    		+ "','popup','width=600,height=600'); return false;\">Fail ScreenShot</a></td> ");
	    
	    }
	    
	    //Don't Delete this comment
	  //  fw.write("\n   <td width=\"10%\"> <a href=\"http://www.google.com\" target=\"popup\" onclick=\"window.open('http://www.google.com','popup','width=600,height=600'); return false;\">Click Here</a></td> ");
	    fw.write("\n  <td width=\"10%\">"
	    		+ ""
	    		+ strDate1
	    		+ "</td>"
	    		+ " ");
	    
	    fw.write("\n </tr> ");
	    
	    fw.write("\n  ");
	    fw.write("\n  ");
	    
	    fw.close();
	}
	
	
	
		
	public void HTMLCloser(String HtmlOutputFileName) throws IOException
	{
		FileWriter fw = new FileWriter(HtmlOutputFileName,true); //the true will append the new data
	    fw.write("\n  ");
	    fw.write("\n  ");
	    fw.write("\n </table> ");//appends the string to the file
	    fw.write("\n </body> ");
	    fw.write("\n </html> ");
	    fw.close();
	}	
		
	
}

	
	