package Locators;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Locators4 
{
  public static void main(String[] args) 
  {
	 WebDriver driver=new ChromeDriver();
	           driver.manage().window().maximize();
	           driver.get("https://google.com");
	           driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	           driver.navigate().back();
	           driver.navigate().forward();
	           driver.quit();
	           
}
}
