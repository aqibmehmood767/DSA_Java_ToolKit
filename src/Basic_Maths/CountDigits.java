package Basic_Maths;

public class CountDigits {
    static void main() {
        System.out.println(countDigitsInNumber(12345));
    }


    public static int countDigitsInNumber(int number){
        int count =0;
        while (number>0){
            number = number/10;
            count++;
        }
        return count;


        //Another solution

//        String string = String.valueOf(number);
//        return string.length();
    }
}
