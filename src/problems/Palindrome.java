package problems;
import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */


        Scanner newscanner = new Scanner(System.in);
        System.out.print("Enter in a word to see whether or not it's a palindrome: ");
        String word = newscanner.nextLine();
        checkPalindrome(word);
    }

    public static void checkPalindrome(String word) {
        String Word = "WOW";
        String toLowerCase = word.toLowerCase();
        String str = "";

        for (int x = toLowerCase.length() - 1; x >= 0; x--) {
            str += toLowerCase.charAt(x);
        }
        if (toLowerCase.equals(str)) {
            System.out.println("The word" + " " + "'" + word + "'" + " is a palindrome!");
        } else {
            System.out.println("The word" + " " +  "'" + word + "'" + " is not a palindrome! Better luck next time.");

        }
    }
}