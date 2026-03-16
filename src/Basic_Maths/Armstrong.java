package Basic_Maths;

//a positive integer equal to the sum of its own digits, each raised to the power of the total number of digits.
// For a digit number, it is the sum of the cubes of its digits;
// for a digit number, it is the sum of fourth powers
public class Armstrong {
    static void main() {
        System.out.println(isArmstrong(54748));
    }


    static boolean isArmstrong(int number){
        int dup = number;
        int hold = 0;
        int base = number;
        int pow = 0;
        while (base>0){
            base = base/10;
            pow++;
        }
        System.out.println("Power " + pow);
        while (number>0){
            int lastDigit = number%10;
//            hold = hold+(lastDigit*lastDigit*lastDigit);
            hold = (int) (hold+(Math.pow(lastDigit,pow)));
            number = number/10;
            System.out.println(hold);
        }
        if (dup==hold){
            return true;
        }
        return false;
    }
}
