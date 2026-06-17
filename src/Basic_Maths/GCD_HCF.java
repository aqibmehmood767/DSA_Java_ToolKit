package Basic_Maths;

public class GCD_HCF {
    static void main() {
//        System.out.println(getGCDOptimised(40, 25));
//        System.out.println(getGCD(40, 25));
        System.out.println(getGCDAlpha(52, 10));
        System.out.println(getGCDorHCF(10, 53));
    }


    //  Main Solution
    static int getGCDAlpha(int a, int b) {

        while (a>0 && b>0){
            if (a>b) {
                System.out.println("a>b " + a%b);
                a = a%b;
            }
            else{
                System.out.println("b>a " + b%a);
                b=b%a;}
        }
        System.out.println(a + " " + b);
        if (a>b)
            return a;
        return b;
    }


    //  Another Solutions
    static int getGCDOptimised(int number1, int number2) {
        int gcd = 1;
        int counter = number1;
        if (number2 < number1) {
            counter = number2;
        }
        for (int i = counter; i >= 1; i--) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }


    static int getGCD(int number1, int number2) {
        int gcd = 1;
        int counter = number1;
        if (number2 < number1) {
            counter = number2;
        }
        for (int i = 1; i <= counter; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }


    static int getGCDorHCF(int number1, int number2) {
        System.out.println("===");
        while (number1> 0 && number2>0){
            if (number1>number2) {
                number1 = number1%number2;
            }
            else
                number2=number2%number1;
        }
        if (number1==0)
            return number2;
        return number1;
    }

}
