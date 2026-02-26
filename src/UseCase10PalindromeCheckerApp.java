import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println(" PALINDROME CHECKER APP - UC10 (Normalized) ");
        System.out.println("===============================================");

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Normalize string
        String normalized = input.replaceAll("\\s+", "")  // remove spaces
                .toLowerCase();          // ignore case

        // Palindrome check using two-pointer approach
        int start = 0;
        int end = normalized.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Result
        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome (Ignoring case & spaces).");
        } else {
            System.out.println("Result: Not a Palindrome.");
        }

        sc.close();
    }
}