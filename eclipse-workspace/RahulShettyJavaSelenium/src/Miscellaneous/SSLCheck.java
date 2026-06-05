package Miscellaneous;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCheck 
{
   public static void main(String[] args) 
   {
//----------------------------------------------------------------------------------- 
	   // For firefox
	      FirefoxOptions options1=new FirefoxOptions();
	                     options1.setAcceptInsecureCerts(true);
	                     
	    // for Edge
	        EdgeOptions options2=new EdgeOptions();
	                    options2.setAcceptInsecureCerts(true);
//------------------------------------------------------------------------------------	   
	      //For chrome
	   ChromeOptions options=new ChromeOptions();
	   options.setAcceptInsecureCerts(true);
	   WebDriver driver=new ChromeDriver(options);
	   driver.manage().window().maximize();
	             driver.get("https://expired.badssl.com/");
	             System.out.println(driver.getTitle());
}
}
