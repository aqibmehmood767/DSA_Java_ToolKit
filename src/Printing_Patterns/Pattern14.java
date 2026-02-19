package Printing_Patterns;

/*Print the below pattern
A
AB
ABC
ABCD
ABCDE
*/

public class Pattern14 {
    static void main() {
        pattern14(5);
    }

    static void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            char alphabet = 'A';
            for (int k = 1; k <= i; k++) {
                System.out.print(alphabet);
                alphabet++;
            }
            System.out.println();
        }
    }
}
