package TypesOfVariables;

public class sample2
{
       // Example of static global variable
	  static int a=20;            // Static global variable
	 public static void main(String [] args)
	 {
		   System.out.println(a);              
		               m3();            //static method calling from same class
		               m4();            //static method calling from same class
		   System.out.println(sample3.c);
	 }
	 
	 public static void m3()
	 {
		 System.out.println(a);
	 }
	 
	 public static void m4()
	 {
		 System.out.println(a);
	 }
		
}
