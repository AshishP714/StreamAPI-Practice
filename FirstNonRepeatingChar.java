package java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		String str = "programming";

		str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new,
				Collectors.counting())).entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey)
				.findFirst().ifPresent(c -> System.out.println("First non-repeating: " + c)); // p
	}
}