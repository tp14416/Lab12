public class Lab12Prob01 {

    // Recursive method implementing the given recurrence relation
    public static int recursiveAbstract(int n) {
        // Base cases
        if (n == 0) return 1;
        if (n == 1) return 3;
        if (n == 2) return 4;

        // Recursive case using the given formula
        return recursiveAbstract(n - 3) * (recursiveAbstract(n - 2) - recursiveAbstract(n - 1));
    }

    public static void main(String[] args) {
        // Example calls for testing
        for (int i = 0; i <= 10; i++) {
            System.out.println("f(" + i + ") = " + recursiveAbstract(i));
        }
    }
}
