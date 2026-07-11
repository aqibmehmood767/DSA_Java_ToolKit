package Printing_Patterns;

/*Print the below pattern
 *
 ***
 *****
 *******
 *******
 *****
 ***
 *
 */

public class Pattern9 {
    static void main() {
        pattern9(4);
        pattern(4);
    }

    static void pattern9(int n) {

        int print = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= print; k++) {
                System.out.print("*");
            }
            print += 2;
            System.out.println();
        }


        int print2 = (n - 1) * 2;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= print2; k++) {
                System.out.print("*");
            }
            print2 -= 2;
            System.out.println();
        }
    }


    //    Striver
    public static void pattern(int n) {
        //Asce
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            for (int l = 0; l < (i * 2 + 1); l++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //Desc
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int l = 0; l < (2 * n - (i * 2 + 1)); l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
