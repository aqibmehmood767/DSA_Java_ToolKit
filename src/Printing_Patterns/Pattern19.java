package Printing_Patterns;

/*Print the below pattern

* **********
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
        pattern17(5);
    }

    static void pattern17(int n) {
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
        int reverseSpace = (n-1)*2;
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
}
