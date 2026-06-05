package Assgnments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AngularPage 
{
   public static void main(String[] args) throws InterruptedException 
   {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://rahulshettyacademy.com/angularpractice/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']")).sendKeys("Avinash");
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("avipgorade4496@gmail.com");
	  driver.findElement(By.id("exampleInputPassword1")).sendKeys("Avi@123");
	  driver.findElement(By.id("exampleCheck1")).click();
	  
	         WebElement Staticdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
	         
	              Select dropdown=new Select(Staticdropdown);
	                     dropdown.selectByContainsVisibleText("Male");
	       driver.findElement(By.id("inlineRadio1")).click();
	       driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("04/04/1996");
	       driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
}
}
