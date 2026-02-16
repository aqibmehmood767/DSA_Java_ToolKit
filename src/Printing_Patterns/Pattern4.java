package Printing_Patterns;

/*Print the below pattern
 1
 22
 333
 4444 */

public class Pattern4 {
    static void main() {
        pattern4(4);
    }

    static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
