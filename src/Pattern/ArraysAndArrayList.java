package Pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysAndArrayList {
    static void main() {
        int[][] arr = new int[][]{{1,2},{3,4,5}};

        System.out.println(arr[0][0]);
        System.out.println(arr[1][1]);

        Scanner scanner = new Scanner(System.in);
        int[][] arrInput = new int[2][2];
        for (int row = 0; row < arrInput.length; row++){
            for (int col = 0 ; col < arrInput[row].length; col++){
                arrInput[row][col] = scanner.nextInt();
            }
        }


        for (int row = 0; row < arrInput.length; row++){
            for (int col = 0 ; col < arrInput[row].length; col++){
                System.out.println(arrInput[row][col]);
            }
        }

        for (int row = 0; row < arr.length; row++){
            for (int col = 0 ; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }


        Scanner scanner1 = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();

        for (int i =0; i<3; i++){
            arrayLists.add(new ArrayList<>());
        }

        for (int i = 0; i<arrayLists.size();i++){
            for (int j=0 ; j<2; j++){
                arrayLists.get(i).add(scanner1.nextInt());
            }
        }
        System.out.println(arrayLists);

    }
}
