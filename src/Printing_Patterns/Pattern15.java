package Printing_Patterns;

/*Print the below pattern

ABCDE
ABCD
ABC
AB
A

*/

public class Pattern15 {
    static void main() {
        pattern15(5);
    }

    static void pattern15(int n) {
        for (int i = n; i >0; i--) {
            char alphabet = 'A';
            for (int k = 1; k <= i; k++) {
                System.out.print(alphabet);
                alphabet++;
            }
            System.out.println();
        }
    }
}
