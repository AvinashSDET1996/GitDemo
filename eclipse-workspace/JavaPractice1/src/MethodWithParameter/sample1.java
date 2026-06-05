package MethodWithParameter;

public class sample1 
{
   public static void main(String[] args)
   {
	   addition(10,30);
	   addition(5,6);
	   addition(100,150);
	   
	   sample1 s1=new sample1();
	           s1.sub(200, 20);
	           s1.sub(1000, 500);
	           s1.sub(25, 50);
}
   
     public static void addition(int a, int b)
     {
    	   System.out.println(a+b);
     }
     
      public void sub(int num1, int num2)
      {
    	  System.out.println(num1-num2);
      }
}
