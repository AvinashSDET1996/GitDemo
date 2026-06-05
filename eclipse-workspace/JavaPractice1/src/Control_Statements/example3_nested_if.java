package Control_Statements;
 // Tip: Write first outer loop & then inner loop
public class example3_nested_if
{
   public static void main(String[] args)
   {
	  int age =17;
	  int weight =40;
	  
	  if(age>=18)
	  {
		System.out.println("Your age is >=18");
		
		if(weight>=50)
		{
			System.out.println("Eligible for blood donation: weight>=50");
		}
		else
		{
			System.out.println("Not eligible for blood donation: weight <50 ");
		}
	  }
	  else
	  {
		  System.out.println("Not eleigible for blood donation: age<18");
	  }
}
}
