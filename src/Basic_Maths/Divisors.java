package Basic_Maths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Divisors {
    static void main() {

        System.out.println(printDivisors(32));
        System.out.println(div(36));
        System.out.println(div2(36));
    }

// Main Solution
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


//    Practice solutions
    static List<Integer> div(int num){
        List<Integer> collect = new ArrayList<>();
        for (int i=1;i<= num/2; i++){
            if (num%i == 0){
                collect.add(i);
            }
        }
    collect.add(num);
        for (Integer i:collect){
            System.out.println(i);
        }
        return collect;
    }


    static List<Integer> div2(int num){
        List<Integer> collect = new ArrayList<>();
        for (int i=1;i<= Math.sqrt(num); i++){
            if (num%i == 0){
                collect.add(i);
                if ((num/i)!=i){
                    collect.add(num/i);
                }
            }
        }
         for (Integer i:collect){
            System.out.println(i);
        }
        Collections.sort(collect);
        return collect;
    }
}
