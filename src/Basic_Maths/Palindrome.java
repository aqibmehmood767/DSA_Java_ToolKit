package Basic_Maths;

public class Palindrome {
    static void main() {
        System.out.println(isPalindrome(7));
        System.out.println(palindrome(1));

    }


//    Main Solution
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
    
    
//    Practice Solution
    static int palindrome(int num){
        int dup = num;
        int hold = 0;
        int compare = 0;
        
        while (num>0){
            hold = num%10;
            compare = (compare*10)+hold;
            num = num/10;
        }
        System.out.println(dup == compare);
        System.out.println(dup);
        System.out.println(compare);
        System.out.println(hold);
        return hold;
    }
}
