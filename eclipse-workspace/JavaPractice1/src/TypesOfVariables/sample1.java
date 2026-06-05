package TypesOfVariables;

public class sample1 
{
   int b=20;       // global variable(Non-static)
   
   public void m1()
   {
	   int a=10;        // local variable
	   System.out.println(a);     
	
	   System.out.println(b);     // global variable
   }
    public void m2()
    {
    	 //  System.out.println(a);          //b'se it is a local variable from above block
    	   System.out.println(b);            // global variable
    }
    
      public static void main(String [] args)
      {
    	     sample1  s1=new sample1();
    	              s1.m1();
    	              s1.m2();
                     
      }
}
