package String_Class;

public class demo2 
{
  public static void main(String[] args) 
  {
	  //1. Without new keyword
	  String s1= "abc";
	  String s2= "abc";
	  String s3= "abc1";
	  
	  //2. Using new keyword
	  String s4= new String("abc");
	  String s5= new String("abc");
	  String s6=new String("abc1");
	  
	    System.out.println(s1==s2);   //true
	    System.out.println(s1==s3);   //False
	    System.out.println(s1==s4);   //False
	    System.out.println(s4==s5);   //False
}
}
