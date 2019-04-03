package Swapna;


import org.openqa.selenium.WebDriver;

public class Basic {
	
public  String sTestID="TC01";	
public static String sTestCaseName="TC01_Hello";	

	public void Hai()
	{
		System.out.println("Hai Ravu ");
		System.out.println("Hai .... " +sTestID);
	}

	public static void Hello()
	{
		System.out.println("Hello Venkat ");
		System.out.println("Hai ... " +sTestCaseName);
	}
	
	
	public int Hai(int a , int b)
	{
		
		int	c=a+b;
		System.out.println("Sum of  a and b values " +c);
		//String hai="Sudhakar";
		
		return c;
		
		//return hai;
	}
	
	

}


