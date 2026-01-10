package Linear_Search;

public class FindMin {
    static void main() {
        int[] arr = {3,5,6,8,2,11,34,-2};
        System.out.println(findMin(arr));
    }

    static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        if (arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
