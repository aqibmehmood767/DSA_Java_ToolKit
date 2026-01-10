package Binary_Search;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

public class SmallestLetterGreaterThanTarget {
    static void main() {

//        char[] arr = {'x','x','y','y'};
        char[] arr = {'a','c','e','g','j','l','n','o','r'};
//        char[] arr = {'c','f','g'};
//        System.out.println(nextGreatestLetter(arr,'z'));
        System.out.println(nextGreatestChar(arr,'l'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if (target == letters[mid]){
                return letters[mid+1];
            }
            if(target>letters[mid]){
                start = mid+1;
            }
            else if (target<letters[mid]){
                end = mid-1;
            }
            else
                return letters[mid+1];
        }if (target =='z'){
            return letters[0];
        }
        return letters[start];
    }


    static char nextGreatestChar(char[] arr, char target){
        int start = 0;
        int end = arr.length-1;
        
        while (start<=end){
            int mid = (start+end)/2;
            if (target<arr[mid]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return arr[start%arr.length];
    }
}
