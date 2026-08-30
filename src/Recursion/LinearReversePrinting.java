package Recursion;

public class LinearReversePrinting {

    static void main() {
        print(10);
        printOptimised(10);
    }


    static void print(int n){
        if ( n < 0) //Base Case (From which the recursion will break)
            return;
        System.out.println(n);
        print(--n);
    }


    static void printOptimised(int n){
        if (n <= 0) //Base Case (From which the recursion will break)
            return;
        System.out.println(n);
        printOptimised(--n);
    }
}
