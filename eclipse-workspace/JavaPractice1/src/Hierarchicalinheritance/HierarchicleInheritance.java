package Hierarchicalinheritance;

public class HierarchicleInheritance 
{
  public static void main(String[] args) 
  {
	 System.out.println("---Properties of son1---");
	        Son1  s1=new Son1();
	              s1.bike();
	              s1.car();
	              s1.money();
	              s1.home();
	              
	   System.out.println("---Propertiers of son2---");
	        Son2  s2=new Son2();
	              s2.mobile();
	              s2.car();
	              s2.money();
	              s2.home();
	              
	    System.out.println("---Properties of son3---");
	        Son3 s3=new Son3();
	             s3.laptop();
	             s3.car();
	             s3.money();
	             s3.home();
	        		
	  
}
}
