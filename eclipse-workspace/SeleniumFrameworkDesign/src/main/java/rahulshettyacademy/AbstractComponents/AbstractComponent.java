package rahulshettyacademy.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import rahulshettyacademy.pageobjects.CartPage;
import rahulshettyacademy.pageobjects.OrderPage;

public class AbstractComponent 
{
	 WebDriver driver;
	  
	 public AbstractComponent(WebDriver driver)
	 {
		   this.driver= driver;
	 }
	 
	   @FindBy(css ="[routerlink*='cart']")
	   WebElement cartHeader;
	   
	   @FindBy(css ="[routerlink*='myorders']")
	   WebElement orderHeader;
	   
	   @FindBy(css= ".totalRow button")
	   WebElement checkoutBtn;
	   
	   
	
	public void waitForElementToAppear(By findBy)
	{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(6));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
}
	
	public void waitForWebElementToAppear(WebElement findBy)
	{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.visibilityOf(findBy));
}
	
	
	   public CartPage goToCartPage()
	   {
		    cartHeader.click();
		    CartPage cartPage=new CartPage(driver);
		    return cartPage;
	   }
	   

	   public OrderPage goToOrderPage()
	   {
		   orderHeader.click();
		    OrderPage orderPage = new OrderPage(driver);
		    return orderPage;
	   }
	
	   public void waitForElementToDisappear(WebElement ele) throws InterruptedException
	   {
		 Thread.sleep(5000);
//		   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//		   wait.until(ExpectedConditions.invisibilityOf(ele));
	   }
	   
	   public void elementToBeClickable(WebElement checkoutBtn2)
	   {
		   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(4));
	       wait.until(ExpectedConditions.elementToBeClickable(checkoutBtn));
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	  //  js.executeScript("arguments[0].scrollIntoView(true);",checkoutBtn);
	     js.executeScript("window.scrollBy(0, 700)");
		   
	   }
}