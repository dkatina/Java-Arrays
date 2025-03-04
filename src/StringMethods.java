public class StringMethods {
    public static void main(String[] args) {
        String str = "  Hello, World!  ";

// .length() - Returns the length of the string
        System.out.println(str.length());  // 17

// charAt() - Returns the character at a specific index
        System.out.println(str.charAt(7));  // ,

// indexOf() - Returns the index of the first occurrence of a substring
        System.out.println(str.indexOf("World"));  // 9
        System.out.println(str.indexOf("o"));  // 6 (first occurrence of 'o')

// substring() - Returns a part of the string (two variations)
        System.out.println(str.substring(2, 7));  // "Hello" (start and end index)
        System.out.println(str.substring(8));  // "World!  " (start index only)

// toUpperCase() / toLowerCase() - Converts the string to upper/lower case
        System.out.println(str.toUpperCase());  // "  HELLO, WORLD!  "
        System.out.println(str.toLowerCase());  // "  hello, world!  "

// equals() / equalsIgnoreCase() - Compares strings for equality (case-sensitive and case-insensitive)
        System.out.println(str.equals("  Hello, World!  "));  // true
        System.out.println(str.equalsIgnoreCase("  hello, world!  "));  // true

// startsWith() / endsWith() - Checks if the string starts or ends with a substring
        System.out.println(str.startsWith("  He"));  // true
        System.out.println(str.endsWith("!  "));  // true

// contains() - Checks if the string contains a substring
        System.out.println(str.contains("World"));  // true
        System.out.println(str.contains("Java"));  // false

// replace() - Replaces all occurrences of a substring with another
        System.out.println(str.replace("World", "Java"));  // "  Hello, Java!  "
        System.out.println(str.replace("l", "x"));  // "  Hexxo, Worxd!  "

// trim() - Removes leading and trailing whitespace
        System.out.println(str.trim());  // "Hello, World!"



    }
}
