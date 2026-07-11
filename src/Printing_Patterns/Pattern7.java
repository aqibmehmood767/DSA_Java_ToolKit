package Printing_Patterns;

/*Print the below pattern
 *
 ***
 *****
 *******
 */

public class Pattern7 {
    static void main() {
        pattern7(4);
        pattern(5);
    }

    static void pattern7(int n) {
        int print = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }

                for (int k = 1; k <=print; k++) {
                    System.out.print("*");
                }
                print+=2;
                System.out.println();
            }
        }


    //    Striver
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            for (int l = 0; l < (i * 2 + 1); l++) {
                System.out.print("*");
            }
            for (int k = 0; k < (n - i - 1); k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }


}

