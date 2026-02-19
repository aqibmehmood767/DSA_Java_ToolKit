package Printing_Patterns;

/*Print the below pattern
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
*/

public class Pattern17 {
    static void main() {
        pattern17(5);
    }

    static void pattern17(int n) {

        for (int i = 1; i <=n; i++) {
            char alphabet = 'A';
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(alphabet);

                if (k == i && alphabet != 'A'){
                for (int l = k-1; l > 0; l--) {
                    alphabet--;
                    System.out.print(alphabet);
                }
                }
                alphabet++;
            }
            System.out.println();
        }
    }
}
