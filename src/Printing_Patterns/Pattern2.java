package Printing_Patterns;

/*Print the below pattern

 *
 **
 ***
 ****   */

public class Pattern2 {
    static void main() {
        pattern2(4);
    }

    static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
