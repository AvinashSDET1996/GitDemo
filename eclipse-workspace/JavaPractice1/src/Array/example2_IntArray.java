package Array;

import java.util.Arrays;

public class example2_IntArray 
{
    public static void main(String[] args) 
    {
	    int ar[]= new int[4];
	        ar[0]= 20;
	        ar[1]= 30;
	        ar[2]=40;
	        ar[3]=10;
	        
	      System.out.println(ar[3]);
	      System.out.println(ar.length);
	      System.out.println("---Print array---");
	      for(int i=0; i<=ar.length-1; i++)
	      {
	    	   System.out.println(ar[i]);
	      }
	      
	      System.out.println("---Print array in the ascending order---");
	    
	        Arrays.sort(ar);
	        for(int i=0; i<=ar.length-1; i++)
	        {
	        	System.out.println(ar[i]);
	        }
	}
}
