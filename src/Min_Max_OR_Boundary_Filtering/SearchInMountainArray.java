package Min_Max_OR_Boundary_Filtering;

//https://leetcode.com/problems/find-in-mountain-array/
public class SearchInMountainArray {
    static void main() {

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
        return start;

    }
}
