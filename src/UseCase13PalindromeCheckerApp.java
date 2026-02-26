import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // Reverse String Method
    public static boolean reverseMethod(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--)
            reversed += input.charAt(i);
        return input.equals(reversed);
    }

    // Stack Method
    public static boolean stackMethod(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray())
            stack.push(ch);
        for (char ch : input.toCharArray())
            if (ch != stack.pop())
                return false;
        return true;
    }

    // Deque Method
    public static boolean dequeMethod(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : input.toCharArray())
            deque.add(ch);
        while (deque.size() > 1)
            if (deque.removeFirst() != deque.removeLast())
                return false;
        return true;
    }

    // Recursive Method
    public static boolean recursiveMethod(String input, int start, int end) {
        if (start >= end)
            return true;
        if (input.charAt(start) != input.charAt(end))
            return false;
        return recursiveMethod(input, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===============================================");
        System.out.println(" PALINDROME CHECKER - UC13 PERFORMANCE TEST ");
        System.out.println("===============================================");

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        // Reverse Method Timing
        long startTime = System.nanoTime();
        reverseMethod(input);
        long endTime = System.nanoTime();
        long reverseTime = endTime - startTime;

        // Stack Method Timing
        startTime = System.nanoTime();
        stackMethod(input);
        endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        // Deque Method Timing
        startTime = System.nanoTime();
        dequeMethod(input);
        endTime = System.nanoTime();
        long dequeTime = endTime - startTime;

        // Recursive Method Timing
        startTime = System.nanoTime();
        recursiveMethod(input, 0, input.length() - 1);
        endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;

        // Display Results
        System.out.println("\nExecution Time (in nanoseconds):");
        System.out.println("Reverse Method   : " + reverseTime);
        System.out.println("Stack Method     : " + stackTime);
        System.out.println("Deque Method     : " + dequeTime);
        System.out.println("Recursive Method : " + recursiveTime);

        sc.close();
    }
}