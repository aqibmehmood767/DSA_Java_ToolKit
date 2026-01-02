package Pattern;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Palindrome {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input.charAt(input.length()/2));
        if (input.length()%2==0){
            for (int i = 0; i<(input.length()/2);i++){
//                System.out.println(i +" "+ (input.length()-i-1) );
                if (input.charAt(i)==input.charAt(input.length()-i-1)){
                    System.out.println(i + " " + (input.length()-i-1));
                    if (i==input.length()-i-2){
                        System.out.println(input + " is Palindrome");
                        break;
                    }
                }
                else {
                    System.out.println(input + " is not a Palindrome");
                    break;
                }
            }
        }
        else {
            for (int i = 0; i<=(input.length()/2);i++){
//                System.out.println(i +" "+ (input.length()-i-1) );
                if (input.charAt(i)==input.charAt(input.length()-i-1)){
                    System.out.println(i + " " + (input.length()-i-1));
                    if ((i++)==input.length()/2){
                        System.out.println(input + " is Palindrome");
                        break;
                    }
                }
                else {
                    System.out.println(input + " is not a Palindrome");
                    break;
                }}

        }
            }
}
