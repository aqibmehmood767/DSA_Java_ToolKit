package Basic_Maths;

public class Palindrome {
    static void main() {
        System.out.println(isPalindrome(7));

    }


    static boolean isPalindrome(int number) {
        int revNum = 0;
        int dup = number;
        while (number > 0) {
            int lastDigit = number % 10;
            revNum = (revNum * 10) + lastDigit;
            number = number / 10;
        }
        System.out.println(revNum);
        if (revNum == dup) {
            return true;
        }

        return false;
    }
}
