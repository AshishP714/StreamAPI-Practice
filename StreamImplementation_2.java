package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamImplementation_2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(10);
		l.add(5);
		l.add(15);
		l.add(25);
		l.add(20);
	
		System.out.println("Before stream normal ArrayList object :- ");
		System.err.println(l);
		
		List<Integer> l1 = l.stream().map(i -> i * 2).collect(Collectors.toList());
		
		Set<Integer> l2 = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toSet());
		
		System.out.println("\nAfter stream multiplied each element by 2 :- ");
		System.err.println(l1);
		
		System.out.println("\nConverted into set duplicates are not allowed :- ");
		System.err.println(l2);
	}
}