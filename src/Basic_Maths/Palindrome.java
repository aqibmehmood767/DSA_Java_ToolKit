package Basic_Maths;

public class Palindrome {
    static void main() {

    }


    static boolean isPalindrome(int number){
        int revNum = 0;
         int dup = number;
          while (number>0){
              int id = number%10;
              revNum = revNum*10+id;
              number = number%10;
          }

        return false;
    }
}
