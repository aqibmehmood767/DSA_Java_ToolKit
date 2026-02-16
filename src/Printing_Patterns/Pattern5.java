package Printing_Patterns;

/*Print the below pattern
 ****
 ***
 **
 * */

public class Pattern5 {
    static void main() {
        pattern5(4);
    }

    static void pattern5(int n){
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
