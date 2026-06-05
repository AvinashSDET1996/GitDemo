package MethodWithParameter;

public class sample3
{
    public static void main(String[] args) 
    {
	   	studentInfo("Avinash", 100, 'B', 56.5f);
	   	System.out.println("--------------------------");
	   	studentInfo("Rudresh", 101, 'A', 75.5f);
	}
    
    public static void studentInfo(String sname, int srollnum, char sgrade, float sper)
    {
    	 System.out.println("Student name: " + sname);
    	 System.out.println("Student roll num: " + srollnum);
    	 System.out.println("Student grade: " + sgrade);
    	 System.out.println("Student per: " + sper+ "%");
    }
}
