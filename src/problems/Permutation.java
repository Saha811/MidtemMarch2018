package problems;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Permutation {

    public static void main(String[] args) {
        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        Permutation("", "SAHA");
    }
    private static void Permutation(String prefix, String str) {
        int x = str.length();
        if (x == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < x; i++) {
                Permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, x));

            }
        }
    }
}
