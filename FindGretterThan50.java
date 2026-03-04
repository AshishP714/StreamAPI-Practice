package CorePractice;

import java.util.*;

public class FindGretterThan50 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(10, 55, 60, 23, 90);

		nums.stream().filter(n -> n > 50).forEach(System.out::print);
	}
}