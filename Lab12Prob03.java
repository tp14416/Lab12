public class Lab12Prob03 {

    // Public method that initializes the recursive process
    public static String reverseString(String str) {
        return reverseStringHelper(str, str.length() - 1);
    }

    // Helper method to reverse the string using an index pointer
    private static String reverseStringHelper(String str, int index) {
        // Base case: if index is 0, return the first character
        if (index == 0) {
            return Character.toString(str.charAt(index));
        }
        // Recursive case: concatenate the character at the current index with the recursive call
        return str.charAt(index) + reverseStringHelper(str, index - 1);
    }

    public static void main(String[] args) {
        // Testing the method with example cases
        String testStr = "hello";
        System.out.println("Original: " + testStr);
        System.out.println("Reversed: " + reverseString(testStr));
    }
}
