package This_and_Super_Keyword;

public class sample1 extends sample2
{
   // int a =30       //Global variable from super class
	  int a =20;      // global variable from same class
	  
	 public void m1()
	 {
		   int a=10;         // local variable
		   System.out.println(a);           //10     // local variable
		   System.out.println(this.a);       //20    
		   System.out.println(super.a);      //30
	 }
	   public static void main(String[] args)
	   {
		   sample1  s1=new sample1();
		            s1.m1();
	}
}
