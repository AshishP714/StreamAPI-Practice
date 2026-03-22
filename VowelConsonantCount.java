package java8;

import java.util.Map;
import java.util.stream.Collectors;

public class VowelConsonantCount {
	public static void main(String[] args) {
		String str = "Hello World";

		Map<String, Long> result = str.chars().filter(Character::isLetter)
				.mapToObj(c -> String.valueOf((char) c).toLowerCase())
				.collect(Collectors.partitioningBy(s -> "aeiou".contains(s), Collectors.counting())).entrySet().stream()
				.collect(Collectors.toMap(e -> e.getKey() ? "Vowels" : "Consonants", Map.Entry::getValue));

		System.out.println(result);
	}
}