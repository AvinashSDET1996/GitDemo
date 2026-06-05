package LogicalPrograms1;

public class ReverseStringWithoutUsingStringBuilder1 
{ 
   public static void main(String[] args)
   {
	  String str = "Avinash Prakash Gorade";
	  
	  for(int i=str.length()-1; i>=0; i--)
	  {
		    System.out.print(str.charAt(i));
	  }
}
}
