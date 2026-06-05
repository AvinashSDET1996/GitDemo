package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 
{
	
	@Parameters({"URL"})
   public void webloginCarLoan(String urlname)
   {
	     System.out.println("Weblogincar");
	     System.out.println(urlname);
   }
   
	  @Test(dataProvider= "getData")
	public void MobileLogincarLoan(String username, String password)
	{
		System.out.println("Mobilelogincar");
		System.out.println(username);
		System.out.println(password);
	}
	  
	  
	  
	  @Test (dependsOnMethods = {"webloginCarLoan", "MobileSignoutCarLoan"})
	  public void LoginAPIcarloan()
	  {
		  System.out.println("APIlogincar");
	  }
	  
	      @Parameters({"URL"})
	      @Test(timeOut=4000)
		public void MobileSignoutCarLoan(String urlname)
		{
			System.out.println("MobileSignoutCar");
			System.out.println();
		}
   
	    public Object[][] getData()
	    {
	    	    // 1st combination- username password - 
	    	    Object[][] data=new Object[3][2];
	    	    data[0][0] = "firstsetusername";
	    	    data[0][1] = "firstpassword";
	    	    
	    	  // columns in the row are nothing but values for that particular combination(row)
	    	    //2nd set
	    	    data[1][0] = "Secondsetusername";
	    	    data[1][1] = "secondpassword";
	    	    
	    //  3rd set
	    	    data[2][0] = "thirdsetusername";
	    	    data[2][1] = "thirdpassword";
	    	    
	    	    return data;
	    }
}
