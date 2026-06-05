package rahulshettyacademy.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import rahulshettyacademy.TestComponents.BaseTest;
import rahulshettyacademy.pageobjects.CartPage;
import rahulshettyacademy.pageobjects.CheckoutPage;
import rahulshettyacademy.pageobjects.ConfirmationPage;
import rahulshettyacademy.pageobjects.OrderPage;
import rahulshettyacademy.pageobjects.ProductCatalogue;

public class SubmitOrderTest extends BaseTest
{
	   String productName = "ZARA COAT 3";
	@Test(dataProvider= "getData", groups= {"Purchase"})
  // public void submitOrder(String email, String password, String productName) throws InterruptedException, IOException 
	public void submitOrder(HashMap<String, String> input) throws InterruptedException, IOException 
   {
	
	   
	    ProductCatalogue productCatalogue=  landingPage.loginApplication(input.get("email"), input.get("password"));
	 //   List<WebElement> products = productCatalogue.getProductList();
	    productCatalogue.getProductList();
	    productCatalogue.addProductToCart(input.get("product"));
	    CartPage cartPage=    productCatalogue.goToCartPage();
	 
	    Boolean match = cartPage.VerifyProductDisplay(input.get("product"));
	    Assert.assertTrue(match);
	    CheckoutPage   checkoutPage= cartPage.goToCheckout();
	    checkoutPage.selectCountry("india");
	    ConfirmationPage confirmationPage = checkoutPage.submitOrder();
	    String  confirmMessage=  confirmationPage.getConfirmationMessage();
	    Assert.assertTrue(confirmMessage.equalsIgnoreCase("Thankyou for the order."));	         
}
	    
	     @Test(dependsOnMethods = {"submitOrder"})
	   public void OrderHistoryTest()
	   {
	    	 ProductCatalogue productCatalogue=  landingPage.loginApplication("prajaktagorade@gmail.com", "Test@2001");
	    	              OrderPage ordersPage=   productCatalogue.goToOrderPage();
	    	           Assert.assertTrue(ordersPage.VerifyOrderDisplay(productName)); 	     
	   }
	     
	     
	   @DataProvider
	   public Object[][]  getData() throws IOException
	   {              
           List<HashMap<String, String>> data = getJsonDataToMap(System.getProperty("user.dir") +"//src//test//java//rahulshettyacademy//data//PurchaseOrder.json");     
		   return new Object[][] {{data.get(0)},{data.get(1)}};
     }
     
	       
//	    @DataProvider 
//	   public Object[][] getData()
//	   {
//		   return new Object[][] {{"prajaktagorade@gmail.com", "Test@2001", "ZARA COAT 3"},{"apgorade1996@gmail.com","Avinash@1996", "ADIDAS ORIGINAL"}};
//		   
//	   }

	   
//	   @DataProvider
//	   public Object[][]  getData() throws IOException
//	   {
//		     HashMap<String, String> map = new  HashMap<String,String>();
//		               map.put("email", "prajaktagorade@gmail.com");
//		               map.put("password", "Test@2001");
//		               map.put("product", "ZARA COAT 3");
//		               
//		     HashMap<String, String> map1 = new HashMap<String, String>();
//		               map1.put("email", "apgorade1996@gmail.com");
//                       map1.put("password", "Avinash@1996");
//                       map1.put("product", "ADIDAS ORIGINAL");
}