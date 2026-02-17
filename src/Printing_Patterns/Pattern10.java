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
    }

    static void pattern10(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k <=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i > 0; i--) {
            for (int k = 0; k <i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
