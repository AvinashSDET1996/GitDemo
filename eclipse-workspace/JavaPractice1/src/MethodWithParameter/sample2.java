package MethodWithParameter;

public class sample2 
{
   public static void main(String [] args)
   {
	      studentName("Prisha"); 
	      studentName("Prajakta");
	      System.out.println("--------------------------------------");
	      studentFullName("Prisha", "Avinash", "Gorade");
	      studentFullName("Parth", "Avinash", "Gorade");
   }
   
   public static void studentName(String name)
   {
	       System.out.println(name);
   }
   
     public static void studentFullName(String firstname,String middlename, String lastname)
     {
    	   System.out.println(firstname+ " "+middlename+" " + lastname);
     }
}
