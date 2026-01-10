package Binary_Search;

//Biggest number <= Target
public class Floor {
    static void main() {
        int[] arr = {-10 , -9 ,-5 , -4, -3 , 0 , 2,4,6,7,9,13,16,22,45,67}; // ascending order array
//        int[] arr = {22,21,13,12,9,8,5,3,1,-1,-4,-6,-8,-18,-22}; // descending order array

        boolean isAscending = checkOrder(arr);

        if (isAscending){
            System.out.println(applyAscending(arr,-11));
        }
        else
            System.out.println(applyDescending(arr, -11));
    }


    //    Check whether array is ascending or not
    static boolean checkOrder(int[] array){
        if (array[0]<array[array.length-1]){
            return true;
        }
        return false;
    }


    //    Apply increasing order
    static int applyAscending(int[] array, int target){

//        if target is smaller than the smallest number in th array
        if (target < array[0]){
            return -1;
        }

        int start = 0;
        int end = array.length-1;
        while (start<=end){
            int mid = (start+end)/2;

            if (target > array[mid]){
                start = mid+1;
            }
            else if (target < array[mid]){
                end = mid-1;
            }
            else
                return mid;
        }

        return array[end];
    }


    //    Apply decreasing order
    static int applyDescending(int[] array, int target){

//        if target is smaller than the smallest number in th array
        if (target < array[0]){
            return -1;
        }

        int start = 0;
        int end = array.length-1;
//        int mid = (start+end)/2;
        while (start<=end){

            int mid = (start+end)/2;
            if (target > array[mid]){
                end = mid-1;
            }
            else if (target < array[mid]){
                start = mid+1;
            }
            else
                return mid;
        }

        return array[end];
    }
}

