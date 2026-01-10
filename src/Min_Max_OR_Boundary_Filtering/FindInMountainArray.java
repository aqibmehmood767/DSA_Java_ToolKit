package Min_Max_OR_Boundary_Filtering;

public class FindInMountainArray {
    static void main() {

//        int arr[] = {1,3,5,7,5,4,2,1,7,3,2};
//        int arr[] = {1,5,2};
        int arr[] = {0,5,3,1};
        System.out.println(binarySearch(3,arr));
    }


//    static int binarySearch(int target,int[] arr){
//        int start = 0;
//        int end = arr.length-1;
//        int ans = -1;
//
//        if (arr[start]==target){
//            return start;
//        }
//        else if (arr[end]==target){
//            ans=end;
//        }
//        while (start<=end){
//            int mid = (start+end)/2;
//            if (target>arr[mid]){
//                start = mid+1;
//            }
//            else if (target<arr[mid]){
//                end = mid-1;
//            }
//            else {
//                ans = mid;
//                return ans;
//            }
//        }
//        return ans;
//    }


    static int binarySearch(int target,int[] arr){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while (start<end){
            int mid = (start+end)/2;
            if (arr[start]>arr[mid]){
                start = mid+1;
            }
            else if (arr[end]<arr[mid]){
                end = mid;
            }
        }
        int appleBinarySearch = binarySearchForTargetLeftSide(start,arr);
        if (appleBinarySearch==-1){
            appleBinarySearch = binarySearchForTargetRightSide(start,arr);
        }
        return appleBinarySearch;
    }

    static int binarySearchForTargetLeftSide(int target,int[] arr){
        int start = 0;
        int end = target;
        int ans = -1;

        while (start<=end){
            int mid = (start+end)/2;
            if (target>arr[mid]){
                start = mid+1;
            }
            else if (target<arr[mid]){
                end = mid-1;
            }
            else {
                ans = mid;
                return ans;
            }
        }
        return ans;
    }


    static int binarySearchForTargetRightSide(int target,int[] arr){
        int start = target;
        int end = arr.length-1;
        int ans = -1;

        while (start<=end){
            int mid = (start+end)/2;
            if (target>arr[mid]){
                start = mid+1;
            }
            else if (target<arr[mid]){
                end = mid-1;
            }
            else {
                ans = mid;
                return ans;
            }
        }
        return ans;
    }
}
