package Printing_Patterns;

public class Pattern19 {
    static void main() {
        pattern17(5);
    }

    static void pattern17(int n) {
        int spaces = 0;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n * 2; k++) {
                if (k == n && spaces != 0) {
                    for (int j = 0; j < spaces; j++) {
                        System.out.print(" ");
                    }
                    continue;
                }
                System.out.print("*");
            }
            spaces += 2;
            System.out.println();
        }
    }
}
