package NonStaticMethod;

public class sample1 
{
  public static void main(String[] args) 
  {
	      sample1 s1=new sample1();
	              s1.m3();
	              s1.m4();
	              s1.m4();                  //Method reusability
	               
}
  
  public void m3()
  {
	    System.out.println("Running non-static regular method: m3 from same class");
  }
  
  public void m4()
  {
	    System.out.println("Running non-static regular method: m4 from same class");
  }
  
}
