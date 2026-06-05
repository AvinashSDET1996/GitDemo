package Array;

public class example1_StringArray 
{
   public static void main(String[] args) 
   {
	  String ar[]= new String[5];
	     
	         ar[0]= "ganesh";
	         ar[1]= "Mahesh";
	         ar[2]= "Ramesh";
	         ar[3]= "Suresh";
	         ar[4]= "Rahul";
	         
	      System.out.println(ar[3]);
	      System.out.println(ar.length);
	      System.out.println("---Print Array---");
	      for(int i=0; i<=ar.length-1; i++)
	      {
	    	  System.out.println(ar[i]);
	      }
	      
	  
}
}
