package Array;

import java.util.Arrays;

public class example4_ArrayDeclarationInitializationInsingleStep2 
{
  public static void main(String[] args)
  {
	  String ar[] = {"Suresh", "Mahesh", "Ramesh", "Ganesh"};
	  
	    System.out.println(ar.length);
	    System.out.println(ar[2]);
	    System.out.println("---Print Array---");
	    for(int i=0; i<=ar.length-1; i++)
	    {
	    	System.out.println(ar[i]);
	    }
	    
	    System.out.println("Print Array in Alphabetical order---");
	    Arrays.sort(ar);
	    for(int i=0; i<=ar.length-1; i++)
	    {
	    	System.out.println(ar[i]);
	    }
	    
}
}
