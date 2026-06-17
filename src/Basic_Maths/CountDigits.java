package Basic_Maths;

//Technique:
//-reduce the number by diving number with 10. It will reduce the number to 0.

public class CountDigits {
    static void main() {
        System.out.println(countDigitsInNumber(12345));
        System.out.println("sss");
        System.out.println(countDig(123567));
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


     static int countDig(int num){
        int count = 0;

        while (num>0  ){
            num = num/10;
            count++;
        }

        System.out.println("Digits = " + count);
        return count;
    }
}
