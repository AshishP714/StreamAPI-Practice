package java8;

import java.util.stream.Collectors;

public class DuplicateCharacters {
	public static void main(String[] args) {
		String str = "programming";

		System.out.println("Duplicate characters:");

		str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet()
				.stream().filter(e -> e.getValue() > 1)
				.forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
	}
}