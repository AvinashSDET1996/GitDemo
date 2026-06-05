package Exception_Handling;

public class sample1 
{
   public static void main(String[] args) 
   {
	  int a=10;
	  int b=0;
	  int c=0;
	    
	     try
	     {
	    	   c=a/b;
	     }
	     catch(ArithmeticException e)
	     {
	    	   System.out.println("Arithmetic exception handled");
	    	   c=a/1;
	     }
	      System.out.println(c);
	      System.out.println("Hi---");
	      System.out.println("Hello----");
	  
}
}
