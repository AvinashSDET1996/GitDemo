package Constructor;

public class sample1 
{
	// default contructor -----> Provided by compiler
	
	
     public void m1()
     {
    	  System.out.println("Running method m1");
     }
     
      public static void main(String[] args) 
      {
		   sample1  s1=new sample1();
		            s1.m1();
		            
		            
		      sample2 s2=new sample2();
		              s2.m2();
	}
}
