package StreamsTUTS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class streamTest1 {
	
	@Test
	public void streamFilter(){
		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhinav");
		names.add("Pranita");
		names.add("Annu");
		names.add("Geeta");
		names.add("Addu");
		names.add("Aiyush");
		
		//There is no life of intermediate op if there is no terminal op 
		//terminal op will execute only if intermediate op returns true
		//we can create stream
		//how to use filter in Stream API
		
		Long c = names.stream().filter(s->s.startsWith("A")).count();
        System.out.println(c);
        
        //print all the arraylist length>4
        
        //The original collection remains same irrespective of the aggregate op. 
        
        
        names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	}
	
	
	@Test
	public void streamMap(){
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Messi");
		names.add("Dhoni");
		names.add("Ronaldo");
		names.add("Ramos");
		names.add("SKY");
			
	Stream.of("Abhinav","Annu","Pranita","Geeta").filter(s->s.startsWith("A")).map(s->s.toUpperCase())
	.forEach(s->System.out.println(s));
	
	List<String> names1 = Arrays.asList("Abhishek","Annu","Addu","Varun");
	names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toLowerCase()).forEach(s->System.out.println(s));
	
	//Merging two lists
	Stream<String> newStream =Stream.concat(names.stream(), names1.stream());
	newStream.sorted().forEach(s->System.out.println(s));
	
	
	
	}

    @Test	
	public void streamCollect(){
		
    	List<String> ls= Stream.of("Abhinav","Annu","Pranita","Geeta").filter(s->s.startsWith("P ")).map(s->s.toUpperCase())
    	.collect(Collectors.toList());
    	System.out.println(ls.get(0));
    
	}
}

