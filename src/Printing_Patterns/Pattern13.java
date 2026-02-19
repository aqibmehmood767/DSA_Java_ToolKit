package Printing_Patterns;

/*Print the below pattern
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/

public class Pattern13 {
    static void main() {
        pattern13(5);
    }

    static void pattern13(int n) {
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
