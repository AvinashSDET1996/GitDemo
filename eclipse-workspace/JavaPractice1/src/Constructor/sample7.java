package Constructor;

public class sample7 
{
    int num1; 
    int num2;
    
     String sname;
     
     sample7()
     {
    	   num1=10;
    	   num2=20;
     }
     
       sample7(int a, int b)
       {
    	    num1=a;
    	    num2=b;
       }
       
       sample7(String name)
       {
    	      sname=name;
       }
       
       public void addition()
       {
    	   System.out.println(num1+num2);
       }
       
       public void studentname()
       {
    	    System.out.println(sname);
       }
       
       public static void main(String[] args)
       {
		    sample7  s7=new sample7();
		             s7.addition();
		             
		    sample7   s8=new sample7(5,6);
		              s8.addition();
		              
		     sample7  s9=new sample7("Rahul");
		              s9.studentname();
		     
	}
}
