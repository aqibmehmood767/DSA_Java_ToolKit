package Printing_Patterns;

/*Print the below pattern
 *******
 *****
 ***
 *
 */
public class Pattern8 {
    static void main() {
        pattern8(4);

        pattern(5);
    }

    static void pattern8(int n) {
        int print = (n - 1) * 2;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= print; k++) {
                System.out.print("*");
            }
            print -= 2;
            System.out.println();
        }
    }


    //    Striver
    static void pattern(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int l = 0; l < (2 * n - (2 * i + 1)); l++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
