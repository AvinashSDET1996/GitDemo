package Exception_Handling;

public class sample2
{
   public static void main(String[] args)
   {
	  int ar[] = new int[5];
	  
	  try
	  {
		  ar[6] =10;   //Risky code
	  }
	  catch(Exception c)      //Generic exception
	  {
		    c.printStackTrace();
		    System.out.println("Generic exception handled");
	  }
	  
	  finally
	  {
		  System.out.println("GN");
	  }
	
}
}
