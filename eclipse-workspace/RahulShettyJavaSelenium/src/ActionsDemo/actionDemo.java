package ActionsDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class actionDemo 
{
    public static void main(String[] args) throws InterruptedException
    {
	     WebDriver driver=new ChromeDriver();
	               driver.manage().window().maximize();
	               driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	               driver.get("https://www.amazon.com/");
	                
	             Actions a=new Actions(driver);
	           a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().
	           keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	             
	           a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();       
	}
}
