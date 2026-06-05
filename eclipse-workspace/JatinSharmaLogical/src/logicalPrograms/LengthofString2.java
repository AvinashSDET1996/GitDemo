package logicalPrograms;

public class LengthofString2 
{
  public static void main(String[] args) 
  {
	  String data= "hello";
	  System.out.println(data.length());
	  int count= 0;
	  
	  while(true)
	  {
		   try
		   {
			   data.charAt(count);
			   count++;
		   }
		   
		    catch(StringIndexOutOfBoundsException e)
		   {
		    	  System.out.println(count);
		    	  break;
		   }
	  }
	  
	        
	
	  
}
}
