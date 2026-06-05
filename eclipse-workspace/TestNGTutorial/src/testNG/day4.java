package testNG;

import org.testng.annotations.Test;

public class day4 
{
	@Test
    public void WebloginHomeLoan()
    {
    	   System.out.println("Webloginhome");
    }
	
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan()
	{
		System.out.println("MobileloginHome");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		System.out.println("APIloginHome");
	}
}
