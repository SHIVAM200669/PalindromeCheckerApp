import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("        PALINDROME CHECKER APP         ");
        System.out.println("=======================================");
        System.out.println("Version : 1.0");
        System.out.println("Status  : Running");
        System.out.println("---------------------------------------");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("\nWelcome " + name + " 👋");
        System.out.println("System ready to check palindromes.");

        System.out.println("\n[UC1 COMPLETED SUCCESSFULLY]");
    }
}