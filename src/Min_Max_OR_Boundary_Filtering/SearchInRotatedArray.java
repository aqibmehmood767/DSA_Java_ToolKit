package Min_Max_OR_Boundary_Filtering;

//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchInRotatedArray {
    static void main() {

//        int[] arr = {6, 7, 8, 9, 12, 0, 1, 2, 3, 4, 5};
//        int[] arr = {4,5,6,7,0,1,2};
//        int[] arr = {3,1};
//        int[] arr = {7,8,1,2,3,4,5,6};
        int[] arr = {3,4,5,6,1,2};
        System.out.println(findPivot(arr));

        int pivot = findPivot(arr);
        int ans;
        if (pivot == -1) {
            ans = binarySearch(arr, 2, 0, arr.length - 1);
        } else {
            ans = binarySearch(arr, 2, 0, pivot);
            if (ans == -1) {
                ans = binarySearch(arr,2,pivot+1,arr.length-1);
            }
        }
        System.out.println(ans);
    }


    public int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        int ans;
        if (pivot == -1) {
            ans = binarySearch(arr, 9, 0, arr.length - 1);
        } else {
            ans = binarySearch(arr, 9, 0, pivot);
            if (ans == -1) {
                ans = binarySearch(arr,9,pivot,arr.length-1);
            }
        }
        return ans;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid =  start + (end - start) / 2;

            if (mid<end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
