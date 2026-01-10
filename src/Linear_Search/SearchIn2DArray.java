package Linear_Search;

import java.util.Arrays;

public class SearchIn2DArray {
    static int[][] arr = {
            {1, 2, 3},
            {4, 5},
            {6, 99, 10}
    };

    static void main() {
        System.out.println(findMin(arr));

        int target = 99;
        System.out.println(Arrays.toString(SearchIn2D(arr,target)));
    }


    //    For finding the Target Index in 2D Array
    static int[] SearchIn2D(int[][] arr, int target) {
//        int min = Integer.MAX_VALUE;
        if (arr.length == 0) {
            return new int[]{-1,-1};
        }

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target) {
                    return new int[]{row,column};
                }
            }
        }
        return new int[]{-1,-1};
    }


    //    For finding the minimum in 2D Array
    static int findMin(int[][] arr) {
        int min = Integer.MAX_VALUE;
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
}
