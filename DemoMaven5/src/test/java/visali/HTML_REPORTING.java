package visali;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

public class HTML_REPORTING {
	

	
    @Test
    public void setBaseURL() throws Exception
  	{
    	
    	File f1= new File("C://Users//sudhakar//Desktop//w3 css table//HtmlReport1.txt");
    	File f2= new File("C://Users//sudhakar//Desktop//w3 css table//HtmlReport2.txt");
    	File f3= new File("C://Users//sudhakar//Desktop//w3 css table//HtmlReport3.txt");
    	File f4= new File("C://Users//sudhakar//Desktop//w3 css table//HtmlReport4.htm");
        
    
    	
    	/*FileUtils.copyFile(f1, f2);
        FileUtils.copyFile(f2, f3);*/
    	
        FileUtils.copyFile(f1, f4);
        
   	 
	}                                   
}