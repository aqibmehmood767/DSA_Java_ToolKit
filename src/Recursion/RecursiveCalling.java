package Recursion;

public class RecursiveCalling {
    static int counter = 0;

    static void print() {
        if (counter == 10)
            return;
        System.out.println("Recursion " + counter  );
        counter++;
        print();

    }

    static void main() {
        RecursiveCalling.print();
    }
}
