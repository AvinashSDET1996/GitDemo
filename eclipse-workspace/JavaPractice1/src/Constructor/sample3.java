package Constructor;

public class sample3 
{
  // User defined constructor
  // Step 1: variable declaration
	
	int a;
	int b;
	
	sample3()
	{
		 a=10;
		 b=20;
	}
	   //use
	 public void addition()
	 {
		 System.out.println(a+b);
	 }
	  public void multiplication()
	  {
		  System.out.println(a*b);
	  }
	     public static void main(String[] args) 
	     {
		     sample3 s3=new sample3();
		             s3.addition();
		             s3.multiplication();
		      System.out.println("-----------------------------------");
	         
		      sample4 s4=new sample4();
		              s4.sub();
		      
}
}