package Binary_Search;

public class BinarySearchAlgo {
    static void main() {
        int[] arr = {-10 , -9 ,-5 , -4, -3 , 0 , 2,4,6,7,9,13,16,22,45,67};
        System.out.println(findTarget(arr,-10));
    }

    static int findTarget(int[] array, int target){
        int start = 0;
        int end = array.length-1;

        while (start<=end){
            int mid = (start+end)/2;
            if (target> array[mid]){
                start = mid+1;
            }
            else if (target<array[mid]){
                end = mid-1;
            }
            else {
                return mid;
            }

        }
        return -1;
    }
}
