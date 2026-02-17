package Printing_Patterns;

/*Print the below pattern
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/

public class Pattern11 {
    static void main() {
        pattern11(5);
    }

    static void pattern11(int n) {
        boolean oddStep = true;
        int odd = 1;
        int even = 0;

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                if (oddStep) { //for odd steps
                    System.out.print(odd);
                    System.out.print(" ");
                    if (odd == 1) {
                        odd = 0;
                    } else
                        odd = 1;
                } else { //for even steps
                    System.out.print(even);
                    System.out.print(" ");
                    if (even == 1) {
                        even = 0;
                    } else
                        even = 1;
                }
            }
            System.out.println();
            oddStep = !oddStep;
            odd = 1;
            even = 0;
        }
    }
}
