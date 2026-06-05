package JavaAlerts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Practice1 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	   driver.findElement(By.id("name")).sendKeys("Avinash");
	   driver.findElement(By.cssSelector("[id='alertbtn']")).click();
	   System.out.println(driver.switchTo().alert().getText());
	   driver.switchTo().alert().dismiss();
	   Thread.sleep(2000);
	   driver.findElement(By.id("confirmbtn")).click();
	   System.out.println(driver.switchTo().alert().getText());
	   driver.switchTo().alert().dismiss();
	   
}
}
