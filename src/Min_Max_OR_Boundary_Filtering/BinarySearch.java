package Min_Max_OR_Boundary_Filtering;

public class BinarySearch {
    static void main() {
        int[] arr = {1,3,5,7,9,10,21,34,56,76};
        System.out.println(binarySearch(arr,76));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if (target>arr[mid]){
                start = mid+1;
            }
            else if (target<arr[mid]){
                end = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
