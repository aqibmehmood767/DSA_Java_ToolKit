package Pattern;

import java.util.Arrays;

public class ReverseArrayThroughSwap {
    static void main() {
        int[] array = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(swap(array)));
        System.out.println(Arrays.toString(array));

        System.out.println("---");
        System.out.println(Arrays.toString(swapAdvance(array,0,array.length-1)));
    }

    public static int[] swap(int[] array){
        int temp = 0;
        for (int i = 0; i < array.length/2; i++){
            temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-1-i] = temp;
        }
        return array;
    }

    public static int[] swapAdvance(int[] array, int start, int end){
        int temp = 0;
//        for (int i = 0; i < array.length-1; i++){
        while (start<end){
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
        return array;
    }





}
