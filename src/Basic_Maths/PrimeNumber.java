package Basic_Maths;

//A number which only divisible by 1 and itself
public class PrimeNumber {
    static void main() {
        System.out.println(isPrime(997));
    }


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

}
