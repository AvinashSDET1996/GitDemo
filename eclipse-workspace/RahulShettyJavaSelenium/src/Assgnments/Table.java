package Assgnments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table 
{
   public static void main(String [] args)
   {
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	               driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	             
	        int tableRows = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size();
	                 System.out.println(tableRows);
	                 
	        int tableColumns = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th")).size();
	                 System.out.println(tableColumns);  
	                 
	    System.out.println(driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[3]")).getText());     
	     
   }
}
