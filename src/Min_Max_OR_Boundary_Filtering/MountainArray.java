package Min_Max_OR_Boundary_Filtering;

            //SOLUTION OF BOTH
//https://leetcode.com/problems/find-peak-element/description/
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class MountainArray {
    static void main() {
//        int[] arr = {0,1,3,4,7,10,14,16,5,2};
//        int[] arr = {3,4,5,1};
//        int[] arr = {3, 5, 3, 2, 0};
        int[] arr = {0,1,2,5,4,3};
        System.out.println(binarySearch(arr));
    }


    static int binarySearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            System.out.println(start + " " + mid + " " + end + " ");

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        return start; //or return end because both have same answer

//        OR


//            if (mid == 0){
//                if (arr[mid]>arr[mid+1]){
//                    return mid;
//                }
//                else return mid+1;
//            }
//            if (arr[mid]>arr[mid+1] && arr[mid] > arr[mid-1]){
//                return mid;
//            }
//            else if (arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1]){
//                end = mid-1;
//            }
//            else if (arr[mid]<arr[mid+1] && arr[mid]>arr[mid-1]){
//                start = mid+1;
//            }
//        }
//
//        return -1;
    }
}
