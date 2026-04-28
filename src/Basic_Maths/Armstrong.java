package Basic_Maths;

/*
Problem: Armstrong Number

Definition:
A number is Armstrong if:
sum of (each digit ^ total number of digits) = number

Example:
153 = 1^3 + 5^3 + 3^3

Approach:
1. Count number of digits
2. Extract each digit using %10
3. Add digit^power
4. Compare with original number

Key Tricks:
- Use %10 to extract last digit
- Use /10 to remove last digit
- Count digits by dividing number repeatedly

Time Complexity: O(d)
d = number of digits
*/

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
