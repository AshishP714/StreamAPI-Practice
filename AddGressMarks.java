package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddGressMarks {

	public static void main(String[] args) {
		StudentMarks sm = new StudentMarks();
		ArrayList<Integer> marks = sm.marks();
		
		System.out.println("Before gress marks :- ");
		System.err.println(marks);
		
		List<Integer> updatedMarks = marks.stream().map(i -> i + 5).collect(Collectors.toList());
		
		System.out.println("After gress marks :- ");
		System.err.println(updatedMarks);
	}
}