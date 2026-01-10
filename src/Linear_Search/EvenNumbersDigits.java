package Linear_Search;

import java.util.Arrays;

public class EvenNumbersDigits {
    static void main() {
        int[] arr = {1,22,333,44,555,6567,877,77,99,8};
        System.out.println(countEvenNumbers(arr));
    }


    static int countEvenNumbers(int[] arr){
        int count = 0;

//        check whether number is even or not Using Strings
        for (int i =0; i<arr.length; i++){
            String s = Arrays.toString(String.valueOf(arr[i]).toCharArray());
            if (s.length()%2==0 ){
                count++;
            }
        }


//        check whether number is even or not Using Custom Method isEven
        int countAgain = 0;
        for (int a : arr){
            if (isEven(a)){
                countAgain++;
            }
        }


        System.out.println(EvenNumberDigitsForNegativeNumbers(-2273));//check whether number is even or not
//        return count; //results get from for loop
        return countAgain; // results get from isEven Method
    }


//    To check whether positive number is even or not
    static boolean isEven(int number){
        int count = 0;
        while (number>0){
            number = number/10;
            count++;
        }

        if (count%2==0){
            return true;
        }
        return false;
    }


//    check if negative number is even or not
    public static boolean EvenNumberDigitsForNegativeNumbers(int number){
        int count = 0;

//        converting number to positive
        if (number<0){
        number = (number*(-1));
        }

        while (number>0){
            number = number/10;
            count++;
        }
        return count%2==0;
    }
}
