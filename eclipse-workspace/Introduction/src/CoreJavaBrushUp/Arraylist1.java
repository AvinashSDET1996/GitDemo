package CoreJavaBrushUp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist1 
{
  public static void main(String [] args)
  {
	         ArrayList<String> arr = new ArrayList<String>();
	                           arr.add("Avinash");   // changes by X
	                           arr.add("Gorade");    // changes by X
	                           arr.add("SDET");      // changes by X
	                           arr.add("2026");      // changes by X
	                           arr.add("selenium");
	                    System.out.println(arr.get(3)); 
	                    System.out.println("For loop:");
	                    
	              for(int i=0; i<arr.size(); i++)
	              {
	            	      System.out.println( arr.get(i));
	              }
	              
	              System.out.println("Enhanced For loop:");
	              
	              for(String s1 :arr)
	              {
	            	    System.out.println(s1);
	              }
	              
	              // iterm is preswent in the Arraylist or not
	             System.out.println(arr.contains("selenium")); 
	             
	               String[]  name = {"rahul", "shetty", "selenium"};  
	              List<String> nameArrayList = Arrays.asList(name);
	              System.out.println(nameArrayList.contains("selenium"));
	               
	                        
	             
	             
  }
}
