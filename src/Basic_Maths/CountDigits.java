package Basic_Maths;

public class CountDigits {
    static void main() {
        System.out.println(countDigitsInNumber(12345));
    }


    public static int countDigitsInNumber(int number){
        String string = String.valueOf(number);
        return string.length();
    }
}
