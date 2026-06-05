package NonStaticMethod;

public class sample4 
{
    public static void main(String[] args)
    {
	    	  m1();               // static method call from same class
	    	 sample8.m2();       // Static method call from different class
	    	 //Non-static method call from same class
	    	 sample4 s4=new sample4();      //Non-static method call from the same class
	    	         s4.m3();
	    	 sample8 s8=new sample8();     //Non-static method call from the different class
	    	         s8.m4();
	    			
	    	      
	}
    
    public void m3()
    {
    	 System.out.println("Running non-static regular method m3: from same class");
    }
    
    public static void m1()
    {
    	  System.out.println("Running static regular method m1: from same class");
    }
}
