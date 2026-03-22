package java8;

import java.util.stream.IntStream;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        String cleaned = str.toLowerCase().replaceAll("\\s", "");
        int length = cleaned.length();

        return IntStream.range(0, length / 2)
                        .allMatch(i -> cleaned.charAt(i) == cleaned.charAt(length - 1 - i));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("Madam"));
    }
}