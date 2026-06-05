package logicalPrograms;
  // Find the length of the string but don't use the .length method
public class LengthofString 
{
    public static void main(String[] args)
    {
	    String data = "Hello";	
	    
	     char[]  c = data.toCharArray();
	     int count=0;
	     
	     for( char x: c)
	     {
	    	      count++;
	     }
	     
	     System.out.println(count);
	}
}
