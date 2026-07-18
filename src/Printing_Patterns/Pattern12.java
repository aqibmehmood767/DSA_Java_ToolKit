package Printing_Patterns;

/*Print the below pattern
1      1
12    21
123  321
12344321
*/

public class Pattern12 {
    static void main() {
        pattern12(4);
        pattern(5);
    }

    static void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int j = i; j < n + n - i; j++) {
                System.out.print(" ");
            }
            for (int l = i; l > 0; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }


    //    Striver
    public static void pattern(int n) {
        int spaces = n * 2 - 2;

        for (int i = 1; i <= n; i++) {
            //        numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

//            spaces
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }

//            numbers
            for (int l = i; l > 0; l--) {
                System.out.print(l);
            }
            spaces = spaces - 2;
            System.out.println();
        }
    }
}
