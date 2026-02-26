import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("        Palindrome Checker App         ");
        System.out.println("=======================================");

        //input from the user
        System.out.print("Enter the string ");
        String original=sc.nextLine();

        String reversed="";
        for(int  i=original.length()-1;i>=0;i--)
        {
            reversed=reversed+original.charAt(i);

        }

        if(original.equals(reversed))
        {
            System.out.println("It is a palindrome string ");
        }
        else
        {
            System.out.println("It is not a palkindrome string ");
        }

        sc.close();
    }
}