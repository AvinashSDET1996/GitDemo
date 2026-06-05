package CoreJavaBrushUp;

public class String1
{
   public static void main(String[] args)
   {
	   
	   //String literal
	   String s1 = "Rahul Shetty Academy";
	   
	   String s5 = "Hello";
	   
	    //new
	   String s2= new String("Welcome");
	   String s3= new String("Welcome");
	   
	   String s= "Rahul Shetty Academy";
	    //Index    [0]            [1]
	     String[] splittedString = s.split("Shetty");
	     System.out.println(splittedString[0]);
	     System.out.println(splittedString[1]);
	     System.out.println(splittedString[1].trim());
	     //Reverse order printing of string
	     for(int i=s.length()-1; i>=0; i--)
	     {
	    	    System.out.print(s.charAt(i));
	     }
}
}
