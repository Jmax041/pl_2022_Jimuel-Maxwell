import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter word/phrase: ");
        String input = sc.nextLine();
        String reverse = "";
        char letter;
        String compare = "";
        String lowercase = input.toLowerCase();

//removes space and special characters from input string
        for(int a=0; a<lowercase.length(); a++) {
            if(lowercase.charAt(a)>64 && lowercase.charAt(a)<=122) {
                compare = compare + lowercase.charAt(a);
            }
        }

//reverses the input string
        for(int a=0; a<compare.length(); a++) {
            letter = compare.charAt(a);
            reverse = letter + reverse;
        }

//if else statement that prints whether the input is a palindrome or not
        if(compare.equals(reverse)) {
            System.out.println(input + " is a palindrome");
        }
        else {
            System.out.println(input + " is a NOT palindrome");
        }

        sc.close();
    }
}