package Basic_Maths;

public class ReverseNumber {
    static void main() {
        System.out.println(reverseNumber(12345));

    }


    static StringBuilder reverseNumber(int number){
        String s = String.valueOf(number);
        StringBuilder reversed = new StringBuilder();

        for (int i = s.length()-1; i>=0;i--){
            reversed = new StringBuilder(reversed+""+s.charAt(i));
        }
        return reversed;
    }



}
