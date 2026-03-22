package java8;

public class AnagramCheck {
	
    public static boolean isAnagram(String s1, String s2) {
        return s1.chars()
                 .sorted()
                 .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                 .toString()
                 .equals(
                     s2.chars()
                       .sorted()
                       .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                       .toString()
                 );
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("hello", "world"));   
        System.out.println(isAnagram("earth", "heart"));   
    }
}