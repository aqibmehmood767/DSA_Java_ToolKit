package Min_Max_OR_Boundary_Filtering;

//https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArray {
    static void main() {

//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,45,67,88,99,101,102,103,104,105,106,108,109,110,111,123,124,125,126};
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int start = 0;
        int end = 1;
        int target = 10;

        while (target > arr[end]) {
                int temp = end+1;
                end = end + (end-start+1)*2;
                start = temp;
            }

        System.out.println(binarySearch(arr,target,start,end));
        }


    static int binarySearch(int[] arr, int target, int start, int end){
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
