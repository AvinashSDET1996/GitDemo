package StaticMethods;

public class sample1 
{
   public static void main(String [] args)                    // Main method
   {
	     System.out.println("Hi");
	     m1();               // Regular method call from main method
	     m2();
	          
   }
   
   public static void m1()              // user defined - Static regular method
   {
	     System.out.println("Running static regular method m1");
   }
   
   public static void m2()      // User defined - static regular method
   {
	     System.out.println("Running static regular method m2");
   }
}
