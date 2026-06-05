package rahulshettyacademy.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rahulshettyacademy.AbstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent
{
	
	WebDriver driver;
	     //Initialized constructor
    public LandingPage(WebDriver driver)
    {
     	  super(driver);    
    	      this.driver=driver;
    	      PageFactory.initElements(driver, this);
    }
    
    //driver.findElement(By.id("userEmail")).sendKeys("prajaktagorade@gmail.com");
    //PageFactory
       @FindBy(id="userEmail")
       WebElement userEmail;
       
     // driver.findElement(By.id("userPassword")).sendKeys("Test@2001");
	   @FindBy(id="userPassword")
	   WebElement passwordEle;
	     
       
       // driver.findElement(By.id("login")).click();
	   @FindBy(id = "login")
	   WebElement submit;
	   
	   @FindBy(css = "[class*='flyInOut']")
	   WebElement errorMessage;
	   
	 public ProductCatalogue loginApplication(String email, String password)
	 {
		    userEmail.sendKeys(email);
		    passwordEle.sendKeys(password);
		    submit.click();
		  ProductCatalogue productCatalogue=new ProductCatalogue(driver);
		  return productCatalogue;
	 }
	 
	 public String getErrorMessage()
	 {
		 waitForWebElementToAppear(errorMessage);
		return errorMessage.getText();
		  
	 }
	 
	 public void goTo()
	 {
		 driver.get("https://rahulshettyacademy.com/client/#/auth/login");
}
}
