package LogicalPrograms1;

public class ReverseStringWithoutReversingTheCharacters1 
{
   public static void main(String[] args) 
   {
	  String statement = "Welcome to the Java";
	        
	           String[] words = statement.split(" ");
	           
	       for(int i= words.length-1; i>=0; i--)
	       {
	    	       System.out.print(" "+ words[i]);
	       }
}
}
