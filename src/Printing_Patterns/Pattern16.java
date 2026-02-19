package Printing_Patterns;

/*Print the below pattern

A
BB
CCC
DDDD
EEEEE

*/

public class Pattern16 {
    static void main() {
        pattern16(5);
    }

    static void pattern16(int n) {
        char alphabet = 'A';

        for (int i = 1; i <=n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(alphabet);
            }
            alphabet++;
            System.out.println();
        }
    }
}
