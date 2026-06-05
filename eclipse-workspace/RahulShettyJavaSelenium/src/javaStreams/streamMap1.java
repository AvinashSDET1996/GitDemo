package javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class streamMap1 
{
	@Test
   public void streamMap()
   {
	      // Print names which have last letter as "a" with Uppercase
//	     Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Rama").filter(a->a.endsWith("a")).map(a->a.toUpperCase())
//	     .forEach(a-> System.out.println(a));
	     
	    List<String> names = Arrays.asList("Azbhijeet", "Don", "Alekhya", "Adam", "Rama");
	                 names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	                 
   }
}
