package Basic_Maths;

import java.util.ArrayList;
import java.util.List;

//A number that has exactly two factors , 1 and itself
//                  OR
//A number which only divisible by 1 and itself
public class PrimeNumber {
    static void main() {
        System.out.println(isPrime(997));
        System.out.println(primeNumbers(1));
    }


//    Main Solutiion
    static boolean isPrime(int number){
        if (number==1){
            return false;
        }
        int count=0;
        for (int i=2;i*i<=number;i++){
            System.out.println(count++);
            if (number%i==0){
                return false;
            }
        }
        return true;
    }


//    Another Solutions

    static boolean primeNumbers(int number){
        if (number==1){
            return true;
        }
        int couter=0;
        for (int i=1 ;i<=Math.sqrt(number);i++){
            System.out.println(i);
            if (number%i==0){
                couter++;
                if ((number/i)!=i){
                    couter++;
                }

            }
        }
        if (couter==2){
            return true;
        }
        return false;
    }
}
