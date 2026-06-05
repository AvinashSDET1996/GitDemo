package Dropdowns;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpdatedDropdown 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	   driver.findElement(By.id("divpaxinfo")).click();
	   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	   Thread.sleep(2000);
	   int i=1;
	   while(i<5)
	   {
		   driver.findElement(By.id("hrefIncAdt")).click();
		   i++;
	   }
	   driver.findElement(By.id("btnclosepaxoption")).click();
	   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	   driver.quit();
}
}
