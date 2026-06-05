package LatestSeleniumFeatures;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow 
{
   public static void main(String[] args) 
   {
	    WebDriver driver=new ChromeDriver();
	            driver.get("https://rahulshettyacademy.com/angularpractice/");
	            driver.manage().window().maximize();
	            driver.switchTo().newWindow(WindowType.WINDOW);
	            
	                Set<String> handles = driver.getWindowHandles();
	                Iterator<String> it = handles.iterator();
	                String   parentWindowId=  it.next();
	                String  childWindowId=  it.next();
	             driver.switchTo().window(childWindowId);
	           driver.get("https://rahulshettyacademy.com/course-library");
	String  coursename=  driver.findElements(By.cssSelector("h3[class*='font-bold text-lg leading-snug mb-1']")).get(0).getText();
        driver.switchTo().window(parentWindowId);
        driver.findElement(By.cssSelector("[name='name']")).sendKeys(coursename);
   }
}
