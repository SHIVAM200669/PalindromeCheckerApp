import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("        Palindrome Checker App UC-4        ");
        System.out.println("=======================================");

        // Take input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert string to char array
        char[] arr = input.toCharArray();

        // Two-pointer technique
        int start = 0;
        int end = arr.length - 1;
        boolean isPalindrome = true;

        while (start < end) {

            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: Not a Palindrome.");
        }

        sc.close();
    }
}