import java.util.*;

// Strategy Interface
interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

// Stack Strategy
class StackStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray())
            stack.push(ch);

        for (char ch : input.toCharArray())
            if (ch != stack.pop())
                return false;

        return true;
    }
}

// Deque Strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : input.toCharArray())
            deque.add(ch);

        while (deque.size() > 1)
            if (deque.removeFirst() != deque.removeLast())
                return false;

        return true;
    }
}

// Context Class
class PalindromeChecker {

    private PalindromeStrategy strategy;

    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String input) {
        return strategy.isPalindrome(input);
    }
}

// Main App
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("   PALINDROME CHECKER - STRATEGY MODE  ");
        System.out.println("=======================================");

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        System.out.println("\nChoose Algorithm:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        PalindromeStrategy strategy;

        if (choice == 1)
            strategy = new StackStrategy();
        else
            strategy = new DequeStrategy();

        PalindromeChecker checker = new PalindromeChecker(strategy);

        boolean result = checker.check(input);

        if (result)
            System.out.println("Result: It is a Palindrome.");
        else
            System.out.println("Result: Not a Palindrome.");

        sc.close();
    }
}