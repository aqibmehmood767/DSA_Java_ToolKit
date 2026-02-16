package Printing_Patterns;

/*Print the below pattern
 ****
 ****
 ****
 **** */

public class Pattern1 {
    static void main() {
        pattern1(4);
    }

    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
