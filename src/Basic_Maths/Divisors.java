package Basic_Maths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Divisors {
    static void main() {

        System.out.println(printDivisors(32));
    }


    static List<Integer> printDivisors(int number) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i*i<=number; i++) {
            if (number % i == 0) {
                divisors.add(i);
                if (i!=number/i){
                    divisors.add(number/i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }


}
