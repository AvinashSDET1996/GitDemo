package seleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Seleintorduction
{
     public static void main(String [] args)
     {
    	     // We can invoke browser by manually OR by using Selenium manager
    	     //Manually
    	   //   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\OneDrive\\Desktop\\Automation\\drivers\\chromedriver.exe");
    	   // OR
    	   // By using selenium manager/Webdriver manager : Do not write above line:
    	 
    	       WebDriver driver= new ChromeDriver();
    	               driver.get("https://google.com");
    	               System.out.println(driver.getTitle());
    	                
    	               driver.get("https://amazon.com");   //By second person
    	               System.out.println(driver.getCurrentUrl());
     }
}
