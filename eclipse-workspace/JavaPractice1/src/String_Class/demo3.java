package String_Class;

public class demo3 
{
  public static void main(String[] args) 
  {
	  String s1= "Velocity";
	  String s2= "ABCD";
	  String s3= "";
	  String s4 = "abcd";
	  String s5= "my name is abc";
	  String s6= "abcabcab";
	  String s7 = "Java Classes";
	  
	    System.out.println(s7.replace("Java", "Selenium"));
	    System.out.println(s7);
	    
	    System.out.println(s5.endsWith("abc"));
	    System.out.println(s5.startsWith("my"));
	    System.out.println("--------------------------------");
	    System.out.println(s6.lastIndexOf('b'));
	    System.out.println(s6.indexOf('c'));
	    System.out.println(s1.charAt(7));
	    System.out.println("--------------------------------------");
	    System.out.println(s1.contains("Ve"));
	    System.out.println(s2.equalsIgnoreCase(s4));
	    System.out.println(s2.equals(s4));
	    System.out.println("---------------------------");
	    System.out.println(s1.length());
	    System.out.println(s1.toUpperCase());
	    System.out.println(s2.isEmpty());
	    System.out.println(s3.isEmpty());
	    
	          String  ar[]= s5.split(" ");
	          
	          System.out.println("---Print String array info---");
	          for(int i=0; i<=ar.length-1; i++)
	          {
	        	  System.out.println(ar[i]);
	          }
	          System.out.println("-----------------------");
	          System.out.println(s2.concat(s4));
	          System.out.println(s2+s4); 
	          System.out.println(s1.substring(1,3));
	          System.out.println(s1.substring(4));
	          System.out.println("-----------------");
	          
	          
	    
}
}
