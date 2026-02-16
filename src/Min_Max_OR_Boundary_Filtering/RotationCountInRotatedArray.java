package Min_Max_OR_Boundary_Filtering;

public class RotationCountInRotatedArray {
    static void main() {
//        int[] arr = {6, 7, 8, 9, 12, 0, 1, 2, 3, 4, 5};
//        int[] arr = {4,5,6,7,0,1,2};
//        int[] arr = {3,1};
//        int[] arr = {7,8,1,2,3,4,5,6};
//        int[] arr = {3,4,5,6,1,2};
//        int[] arr = {15,18,2,3,6,12};
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int countRotations = findPivot(arr);
        System.out.println(countRotations + 1);
    }


    //    use this for non duplicates
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


//    use this for duplicates
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] == arr[end] && arr[mid] == arr[start]) {
//                check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

//                check if end is pivot
                if (arr[end] < arr[mid - 1]) {
                    return mid - 1;
                }
                end--;
            }
            //to check if left side is sorted then pivot should be in right side
            else if (arr[start] < arr[mid] || (arr[start] == arr[end] && arr[mid] > arr[end])) {
                start = mid + 1;
            }
            //pivot is in left side
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
