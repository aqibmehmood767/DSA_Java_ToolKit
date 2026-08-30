package Recursion;

public class LinearPrinting {
    static void main() {
        print(10);
        printOptimised(1,10);
    }


    static int counter = 1;
    static void print(int n){
        if (counter > n) //Base Case (From which the recursion will break)
            return;
        System.out.println(counter);
        counter++;
        print(n);
    }


    static void printOptimised(int l,int n){
        if (l > n) //Base Case (From which the recursion will break)
            return;
        System.out.println(l);
        printOptimised(++l,n);
    }
}
