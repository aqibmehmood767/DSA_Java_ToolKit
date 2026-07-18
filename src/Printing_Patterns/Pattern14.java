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
        pattern(5);
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


    //    Striver
    public static void pattern(int n) {

        for (int i = 1; i <= n; i++) {
            for (char l = 'A'; l<'A'+i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
