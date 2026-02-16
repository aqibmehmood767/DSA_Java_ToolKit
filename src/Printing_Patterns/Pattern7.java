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
    }

