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
        pattern(5);
    }

    static void pattern15(int n) {
        for (int i = n; i > 0; i--) {
            char alphabet = 'A';
            for (int k = 1; k <= i; k++) {
                System.out.print(alphabet);
                alphabet++;
            }
            System.out.println();
        }
    }


    //    Striver
    public static void pattern(int n) {

        for (int i = 0; i < n; i++) {
            for (char l = 'A'; l <= 'A' + (n - i - 1); l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
