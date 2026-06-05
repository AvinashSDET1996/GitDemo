package CoreJavaBrushUp;

public class Methods1
{
   public static void main(String[] args)
   {
	  Methods1 d=new Methods1();
	     String name = d.getData();       //Whatever the name we are returning in the below method is storing in the name variable
	     System.out.println(name);     //Prints: Rahul Shetty
}
   
   public String getData()
   {
	  System.out.println("Hello world"); 
	  return "rahul shetty";
	  
	   
   }
}
