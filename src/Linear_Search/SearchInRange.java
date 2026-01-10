package Linear_Search;

public class SearchInRange {
    static void main() {
        int[] arr = {0,1,2,3,4,5,99,7,8,9};
        int start = 2;
        int end = 10;
        int target = 99;
        System.out.println(SearchTheRange(arr, target, start, end));
        System.out.println(SearchTheRange2(arr, target, start, end));

    }

    public static boolean SearchTheRange(int[] arr , int target, int start, int end){
        if (arr.length == 0){
            return false;
        }
        for (int i = start; i <= end; i++){
            if (arr[i] == target){
                return true;
            }
        }
        return false;
    }


    public static int SearchTheRange2(int[] arr , int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
