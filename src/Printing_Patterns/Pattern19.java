package Printing_Patterns;

/*Print the below pattern

 ***********
 ****  ****
 ***    ***
 **      **
 *        *
 *        *
 **      **
 ***    ***
 ****  ****
 **********

 */


public class Pattern19 {
    static void main() {
//        pattern19(5);
        pattern(5);
    }

    static void pattern19(int n) {
        int spaces = 0;
        for (int i = 1; i <= n; i++) {
            for (int k = i; k <= n; k++) {
                System.out.print("*");
                if (k == n && spaces != 0) {
                    for (int j = 0; j < spaces; j++) {
                        System.out.print(" ");
                    }
                }
            }
            for (int k = i; k <= n; k++) {
                System.out.print("*");
            }
            spaces += 2;
            System.out.println();
        }

        //For Reverse
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
    }


    //    Striver
    public static void pattern(int n) {
        int spaces = 0;
        int loop = n;
        for (int i = 0; i <= n * 2; i++) {

            //stars
            for (int l = 1; l <= loop-i; l++) {
                System.out.print("*");
            }

            //spaces
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }

            //stars
            for (int l = 1; l <= loop-i; l++) {
                System.out.print("*");
            }
            if (i < n)
                spaces = spaces + 2;
            else{
                spaces = spaces - 2;
                loop = loop+2;
            }
            System.out.println();

        }
    }
}
