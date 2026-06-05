package WindowHnadlesOperations;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;


public class Assignment1 
{
   public static void main(String[] args) 
   {
	   WebDriver  driver=new ChromeDriver();
	              driver.manage().window().maximize();
                  driver.get("https://the-internet.herokuapp.com/windows");
                  driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
                Set<String> windows = driver.getWindowHandles();
                Iterator<String> it = windows.iterator();
                 String parentId = it.next();
                 String childid = it.next();
                 
                 driver.switchTo().window(childid);
           String chiildwindowtext = driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
           System.out.println(chiildwindowtext);
                 driver.switchTo().window(parentId);
                 String parentwindowtext = driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
                 System.out.println(parentwindowtext);
   }
}
