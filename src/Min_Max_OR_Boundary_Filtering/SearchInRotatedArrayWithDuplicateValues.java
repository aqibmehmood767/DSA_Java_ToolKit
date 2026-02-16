package Min_Max_OR_Boundary_Filtering;

public class SearchInRotatedArrayWithDuplicateValues {
    static void main() {

        int[] arr = {2,6,2,2,2};
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
            if (arr[mid] == arr[end] && arr[mid]== arr[start]) {
//                check if start is pivot
                if (arr[start]>arr[start+1]){
                    return start;
                }
                start++;

//                check if end is pivot
                if (arr[end]<arr[mid-1]){
                    return mid-1;
                }
                end--;
            }
            //to check if left side is sorted then pivot should be in right side
            else if (arr[start]<arr[mid] || (arr[start]==arr[end] &&  arr[mid]>arr[end])){
                start = mid + 1;
            }
            //pivot is in left side
            else {
                end = mid-1;
            }
        }
        return -1;
    }
}
