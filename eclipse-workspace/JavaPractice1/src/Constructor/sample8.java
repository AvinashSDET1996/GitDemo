package Constructor;

public class sample8 
{
  int num1;
  int num2;
  String sname;
  
    sample8(int a, int b, String name)
    {
    	 num1=a;
    	 num2=b;
    	 sname= name;
    }
    
        public void addition()
        {
        	 System.out.println(num1+num2);
        }
        
        public void studentname()
        {
        	 System.out.println(sname);
        }
        
        public static void main(String[] args)
        {
		      sample8  s8=new sample8(10,20,"Rahul");
		               s8.addition();
		               s8.studentname();
		}
}
