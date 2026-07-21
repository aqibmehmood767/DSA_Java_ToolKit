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
        pattern(8);
    }

    static void pattern18(int n) {
        char alphabet = (char) ('A' + n - 1);

        for (int i = 1; i <= n; i++) {
            char hold = alphabet;
            for (int k = 1; k <= i; k++) {
                System.out.print(hold + " ");
                hold++;
            }
            alphabet--;
            System.out.println();
        }
    }


    // Start printing from ('A' + n - i - 1) up to the last character ('A' + n - 1).
    // 'A' + n is used as the exclusive upper limit.
    // Example (n=5): E -> D E -> C D E -> B C D E -> A B C D E

    //    Striver
    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (char l = (char) ('A' + n - i - 1); l < 'A' + n; l++) {
                System.out.print(l + " ");
            }
            System.out.println();

        }
    }
}
