package math;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Fibonacci {
    public static void main(String[] args) {

        int x = 0;
        int y = 1;
        for (int i = 0; i < 40; i++) {
            System.out.println(x);
            x = x+y;
            y = x-y;
        }
         /*
          Write 40 Fibonacci numbers with java.
         */


    }
}



