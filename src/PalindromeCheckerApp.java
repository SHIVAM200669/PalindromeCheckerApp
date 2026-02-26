import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "madam";
        String  reversed="";
        for(int i=text.length()-1;i>=0;i--)
        {
            reversed=reversed+text.charAt(i);

        }
        System.out.println("\nChecking word: " + text);
        if(text.equals(reversed))
        {
            System.out.println("Result: It is a Palindrome String:");

        }
        else
        {
            System.out.println("Result: Not a Palindrome");
        }
    }
}