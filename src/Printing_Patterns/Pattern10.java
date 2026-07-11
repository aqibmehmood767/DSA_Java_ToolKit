package Printing_Patterns;

/*Print the below pattern
 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *

 */

public class Pattern10 {
    static void main() {
        pattern10(5);
        pattern(4);
    }

    static void pattern10(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    //    Striver
    public static void pattern(int n) {

        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) stars = 2 * n - i; //starts reducing the stars based on row number
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

