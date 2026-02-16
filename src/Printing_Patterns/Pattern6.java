package Printing_Patterns;

/*Print the below pattern
 1234
 123
 12
 1 */

public class Pattern6 {
    static void main() {
        pattern6(4);
    }

    static void pattern6(int n){
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
