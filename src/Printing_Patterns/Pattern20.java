package Printing_Patterns;

/*Print the below pattern

 *        *
 **      **
 ***    ***
 ****  ****
 **********
 ****  ****
 ***    ***
 **      **
 *        *

 */

public class Pattern20 {
    static void main() {
//        pattern20(5);
        pattern(5);
        patternAlt(5);
    }

    static void pattern20(int n) {

        //For Ascending
        int reverseSpace = (n - 1) * 2;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
                if (k == i && reverseSpace != 0) {
                    for (int j = 0; j < reverseSpace; j++) {
                        System.out.print(" ");
                    }
                }
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            reverseSpace -= 2;
            System.out.println();
        }

        //For Descending
        int spaces = 2;
        for (int i = 1; i < n; i++) {
            for (int k = i + 1; k <= n; k++) {
                System.out.print("*");
                if (k == n && spaces != 0) {
                    for (int j = 0; j < spaces; j++) {
                        System.out.print(" ");
                    }
                }
            }
            for (int k = i + 1; k <= n; k++) {
                System.out.print("*");
            }
            spaces += 2;
            System.out.println();
        }
    }


    //    Striver
    public static void pattern(int n) {
        int spaces = n * 2 - 2;
        int loop = 0;
        for (int i = 0; i < 2 * n - 1; i++) {
            //stars
            for (int l = 0; l <= loop; l++) {
                System.out.print("*");
            }

            //spaces
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }

            //stars
            for (int l = 0; l <= loop; l++) {
                System.out.print("*");
            }
            if (i <= n / 2 + 1) {
                spaces = spaces - 2;
                loop++;
                System.out.println();
            } else {
                spaces = spaces + 2;
                loop--;
                System.out.println();
            }
        }

    }



    //    Striver
    public static void patternAlt(int n) {
        int spaces = n * 2 - 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if(i>n)
                stars = n*2-i;
            //stars
            for (int l = 1; l <= stars; l++) {
                System.out.print("*");
            }

            //spaces
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }

            //stars
            for (int l = 1; l <= stars; l++) {
                System.out.print("*");
            }
            if (i < n) {
                spaces = spaces - 2;
            } else {
                spaces = spaces + 2;
            }
            System.out.println();
        }

    }

}
