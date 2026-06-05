package TypesOfVariables;

public class sample4 
{
       int d=40;                           //Non-static global variable
  
     public static void main(String[] args)
     {
	    	 sample4 s4=new sample4();
	    	      System.out.println(s4.d);
	    	      
	    	  sample5 s7=new sample5();
	    	     System.out.println(s7.f);
	    	           m1();            // call below static method
	    	           
	    	     sample4 s2=new sample4();        // calling global variable to m2 method & then creating object of that in main method & printing
	    	             s2.m2();
     }
     
     
	     public static void m1()
	      {
	              sample4  s5=new sample4();
	              System.out.println(s5.d);
	      }
	 
	       public void m2()
	       {
	    	   System.out.println(d);
	       }
	}

