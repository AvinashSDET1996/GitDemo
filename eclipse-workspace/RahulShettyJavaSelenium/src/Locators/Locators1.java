package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators1 
{
    public static void main(String[] args) throws InterruptedException
    {
	    WebDriver driver=new ChromeDriver();	
	              driver.manage().window().maximize();
	              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	              driver.get("https://rahulshettyacademy.com/locatorspractice/");
	              driver.findElement(By.id("inputUsername")).sendKeys("Avinash");
	              driver.findElement(By.name("inputPassword")).sendKeys("hello123");
	              driver.findElement(By.className("signInBtn")).click();
	              System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	              driver.findElement(By.linkText("Forgot your password?")).click();
	              driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
	              driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("John@email.com");
	              driver.findElement(By.xpath("//form/input[3]")).sendKeys("985525555");
	              driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
	              System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	              driver.findElement(By.className("go-to-login-btn")).click();
	              driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
	              driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	              Thread.sleep(1000);
	              driver.findElement(By.id("chkboxOne")).click();
	              driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	              Thread.sleep(5000);
	              driver.quit();
	              
	              
	              
	              
	              
	              
	              
	              
	               
	              
	              
	}
}
