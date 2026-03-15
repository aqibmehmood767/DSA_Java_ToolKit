package Basic_Maths;

public class ReverseNumber {
    static void main() {
        System.out.println(reverseNumberInteger(-12345));
        System.out.println(reverseNumber(12345));
    }


    static int reverseNumberInteger(int number) {
//        For Neagtive numbers
        if (number<0){
            number = -(number);
            int hold = 0;
            while (number > 0) {
                int lastDigit = number % 10;
                hold = (hold * 10) + lastDigit;
                number = number / 10;
            }
            return -hold;
        }


//        For Positive Numbers
        int hold = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            hold = (hold * 10) + lastDigit;
            number = number / 10;
        }
        return hold;
    }


    //        Another Solution
    static StringBuilder reverseNumber(int number) {

        String s = String.valueOf(number);
        StringBuilder reversed = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = new StringBuilder(reversed + "" + s.charAt(i));
        }
        return reversed;
    }


}
