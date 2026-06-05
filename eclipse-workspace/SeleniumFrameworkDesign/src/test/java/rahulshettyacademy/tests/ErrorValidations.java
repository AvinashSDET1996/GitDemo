package rahulshettyacademy.tests;

import org.testng.Assert;
import org.testng.annotations.Test;



import rahulshettyacademy.TestComponents.BaseTest;
import rahulshettyacademy.TestComponents.Retry;
import rahulshettyacademy.pageobjects.CartPage;
import rahulshettyacademy.pageobjects.ProductCatalogue;

public class ErrorValidations extends BaseTest
{ 
     @Test(groups = {"ErrorHandling"}, retryAnalyzer = Retry.class)
   public void LoginErrorValidation() 
   {
	   
	   landingPage.loginApplication("prajaktagorade@gmail.com", "Test@21");
	   Assert.assertEquals("Incorrect email password.", landingPage.getErrorMessage());      
}
	  
	  @Test
	public void ProductErrorValidation() throws InterruptedException
	{  
		String productName = "ZARA COAT 3";
	    ProductCatalogue productCatalogue=  landingPage.loginApplication("prajaktagorade@gmail.com", "Test@2001");
	 //   List<WebElement> products = productCatalogue.getProductList();
	    productCatalogue.getProductList();
	    productCatalogue.addProductToCart(productName);
	    CartPage cartPage=    productCatalogue.goToCartPage();
	    Boolean match = cartPage.VerifyProductDisplay("ZARA COAT 33");
	    Assert.assertFalse(match);
	}
  
}
