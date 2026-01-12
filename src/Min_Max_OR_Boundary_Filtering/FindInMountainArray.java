package Min_Max_OR_Boundary_Filtering;

//https://leetcode.com/problems/find-in-mountain-array/description/

public class FindInMountainArray {
    static void main() {

//        int arr[] = {1,3,5,7,5,4,2,1,7,3,2};
//        int arr[] = {1,2,3,4,5,3,1};
//        int arr[] = {0,5,3,1};
        int arr[] = {3,5,3,2,0};
//        int arr[] = {0,5,3,1};
        System.out.println(binarySearchForPeakElement(2, arr));
    }


//    For Getting The Peek Element
    static int binarySearchForPeakElement(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        int appleBinarySearch = binarySearchForTargetLeftSide(end, target, arr);
        if (appleBinarySearch == -1) {
            appleBinarySearch = binarySearchForTargetRightSide(start, target, arr);
        }
        return appleBinarySearch;
    }


//    For Searching on the Left Side of Peek Element in Ascending array
    static int binarySearchForTargetLeftSide(int endIndex, int target, int[] arr) {
        int start = 0;
        int end = endIndex;
        int ans = -1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (target > arr[mid]) {
                if (target == arr[mid+1]){
                    return mid+1;
                }
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid;
            } else {
                ans = mid;
                return ans;
            }

        }
        return ans;
    }


//    For Searching on the Right Side of Peek Element in Descending array
    static int binarySearchForTargetRightSide(int startIndex, int target, int[] arr) {
        int start = startIndex;
        int end = arr.length - 1;
        int ans = -1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (target > arr[mid]) {
                end = mid-1;
            } else if (target < arr[mid]) {
                if (target == arr[end]) {
                    return end;
                }
                start = mid+1;
            } else {
                ans = mid;
                return ans;
            }
        }
        return ans;
    }
}
