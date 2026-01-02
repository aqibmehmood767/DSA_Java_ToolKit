package Pattern;

import java.util.Scanner;

public class ArmstrongNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int inputArmstrong = sc.nextInt();
        int remainder=0;
        int cube = 0;
        int finalValue = inputArmstrong;
        while (inputArmstrong>0){
            remainder = inputArmstrong%10;
            cube += (remainder*remainder*remainder);
            inputArmstrong = inputArmstrong/10;
            System.out.println(inputArmstrong + " cube " + cube + " remainder " + remainder);
        }
        String isArmstrong = finalValue == cube ? "Armstrong":"NotArmstrong";
        System.out.println(isArmstrong);
    }
}
