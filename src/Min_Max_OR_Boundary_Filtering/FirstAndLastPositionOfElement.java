package Min_Max_OR_Boundary_Filtering;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class FirstAndLastPositionOfElement {
    static void main() {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 5;
        System.out.println(Arrays.toString(searchRange(arr, target)));

    }


    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int start = searchRange(nums, target, true);
        int end = searchRange(nums, target, false);

        result[0] = start;
        result[1] = end;

        return result;
    }


    public static int searchRange(int[] nums, int target, boolean findStartIndex) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid; // Assign the value to answer which we get
                if (findStartIndex) { // For finding the left side possible answer, we will change the end to get to the last index
                    end = mid - 1;
                } else {  // For finding the right side possible answer, we will change the start to get to the last possible index
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
