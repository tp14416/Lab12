public class Lab12Prob02 {

    // Recursive method to reverse a string
    public static String reverseString(String str) {
        // Base case: if the string has only one character, return it
        if (str.length() <= 1) {
            return str;
        }
        // Recursive case: return the last character + recursive call with substring
        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args) {
        // Testing the method with example cases
        String testStr = "hello";
        System.out.println("Original: " + testStr);
        System.out.println("Reversed: " + reverseString(testStr));
    }
}
