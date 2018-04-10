package math;

public class MakePyramid {
    public static void main(String[] args) {

        //   Implement a large Pyramid of stars in the screen with java.
        //
        //                    *
        //                   * *
        //                  * * *
        //                 * * * *
        //                * * * * *
        //               * * * * * *

        //Start Here

        for(int a=0;a<6;a++) {
            for(int j=0;j<6-a;j++) {
                System.out.print(" ");      //Enters the spaces
            }
            for(int k=0;k<=a;k++) {
                System.out.print("* ");     //Enters the stars***
            }

            System.out.println();
        }
    }
}