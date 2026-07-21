package Printing_Patterns;

/*Print the below pattern
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
*/

public class Pattern17 {
    static void main() {
        pattern17(5);
        pattern(5);
        patternStriver(5);
    }

    static void pattern17(int n) {

        for (int i = 1; i <= n; i++) {
            char alphabet = 'A';
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(alphabet);

                if (k == i && alphabet != 'A') {
                    for (int l = k - 1; l > 0; l--) {
                        alphabet--;
                        System.out.print(alphabet);
                    }
                }
                alphabet++;
            }
            System.out.println();
        }
    }


    //    Another optimized Sol
    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
//            spaces
            int spaces = n - i - 1;
            for (char l = 0; l < spaces; l++) {
                System.out.print(" ");
            }

//            alphabets asc
            char alphabet = 'A';
            for (char l = 0; l <= i; l++) {
                System.out.print(alphabet);
                alphabet++;
            }

//            alphabets asc
            alphabet--;
            alphabet--;
            for (char l = 0; l < i; l++) {
                System.out.print(alphabet);
                alphabet--;
            }
            System.out.println();
        }
    }


    //    Striver
    public static void patternStriver(int n) {
        for (int i = 0; i < n; i++) {

//            spaces
            for (char l = 0; l < n - i - 1; l++) {
                System.out.print(" ");
            }

//            alphabets
            char alphabet = 'A';
            int loop = 2 * i + 1;
            for (char l = 0; l < loop; l++) {
                System.out.print(alphabet);
                if (l < loop / 2)
                    alphabet++;
                else alphabet--;
            }
            System.out.println();
        }
    }
}
