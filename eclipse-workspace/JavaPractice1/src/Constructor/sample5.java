package Constructor;

public class sample5 
{
   int num1; 
   int num2;
   
     sample5(int a, int b)
     {
    	  num1 = a;
    	  num2= b;
     }
     
       public void addition()
       {
    	    System.out.println(num1+num2);
       }
       
       public void mul()
       {
    	    System.out.println(num1*num2);
       }
       
        public static void main(String[] args) 
        {
		  sample5  s5=new sample5(10, 20);
		           s5.addition();
		           s5.mul();
		           
		           
		     sample5  s55=new sample5(5,6);
		              s55.addition();
		              s55.mul();
		   System.out.println("-------------------------------------");
		       sample6 s6=new sample6(60, 25);
		               s6.sub();
		               
		         sample6 s66=new sample6(100,300);
		                 s66.sub();
		}
}
