public class StringMethodsDemo {
    public static void main(String[] args) {
        // Initial string for demonstration
        String str = "Hello, welcome to Java programming!";

        // 1. charAt() - Returns the character at the specified index
        char ch = str.charAt(7); // character at index 7 (8th character)
        System.out.println("Character at index 7: " + ch);

        // 2. contains() - Checks if the string contains the specified sequence of characters
        boolean containsWord = str.contains("Java");
        System.out.println("Does the string contain 'Java'? " + containsWord);

        // 3. format() - Formats a string using placeholders
        String formattedString = String.format("Your name is %s and you are %d years old.", "John", 25);
        System.out.println("Formatted String: " + formattedString);

        // 4. length() - Returns the length of the string
        int lengthOfString = str.length();
        System.out.println("Length of the string: " + lengthOfString);

        // 5. split() - Splits the string into an array of substrings based on a delimiter
        String[] words = str.split(" "); // Splitting by space
        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
