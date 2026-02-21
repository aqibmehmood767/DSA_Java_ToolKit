package Printing_Patterns;

/*Print the below pattern
E
D E
C D E
B C D E
A B C D E
*/

public class Pattern18 {
    static void main() {
        pattern18(5);
    }

    static void pattern18(int n) {
        char alphabet = (char) ('A'+n-1);

        for (int i = 1; i <=n; i++) {
            char hold = alphabet;
            for (int k = 1; k <= i; k++) {
                System.out.print(hold + " ");
                hold++;
            }
            alphabet--;
            System.out.println();
        }
    }
}
