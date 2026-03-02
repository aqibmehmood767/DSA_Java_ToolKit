package Printing_Patterns;

/*Print the below pattern

5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5

 */

import java.util.Arrays;

public class Pattern22 {

    static void main() {
        pattern22(5);
    }


    static void pattern22(int n) {
        int holdValue = n;
        int[] arr = new int[(n * 2) - 1];
        Arrays.fill(arr, n);

        for (int i = 0; i < n; i++) {
            for (int j = i; j < arr.length - i; j++) {
                arr[j] = holdValue;
            }
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
            holdValue--;
        }

        holdValue = holdValue+2;
        for (int i = n-1; i > 0; i--) {
            for (int j = i-1; j < arr.length-i; j++) {
                arr[j] = holdValue;
            }
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
            holdValue++;
        }
    }
}
