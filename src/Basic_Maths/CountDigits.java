package Basic_Maths;

//Technique:
//-reduce the number by diving number with 10. It will reduce the number to 0.

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
    }


    //Another solution
    static int countDigits(int number){

        String string = String.valueOf(number);
        return string.length();
    }
}
