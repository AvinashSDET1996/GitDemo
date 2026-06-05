package testNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListner interface which implements Testng listeners
public class Listeners implements ITestListener
{
      public void onTestStart(ITestResult result)
      {
    	      
      }
      
      public void onTestSuccess(ITestResult result)
      {
    	  System.out.println("I successfully executed Listeners Pass code");
      }
      
      public void onTestFailure(ITestResult result)
      {
    	  System.out.println("I successfully executed Listeners Fail code " + result.getName());
      }
      
      public void onTestSkipped(ITestResult result)
      {
    	  
      }
      
      public void onTestFailureButwithinSuccessPercentage(ITestResult result)
      {
    	  
      }
      
      public void onStart(ITestResult result)
      {
    	  
      }
      
      public void onFinish(ITestResult result)
      {
    	  
      }
}
