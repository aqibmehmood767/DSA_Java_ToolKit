package Min_Max_OR_Boundary_Filtering;

import java.util.*;
import java.util.stream.Collectors;

public class TargetIndicesAfterSortingArray {
    static void main() {
//        int[] arr = {75,99,19,93,87,68,12,18,48,83,24,50,16,53,36,16,80,68,46,13,53,100,50,49,77,52,34,42,38,98,73,11,13,61,72,8,11,67,98,24,23,71,47,6,5,7,97,86,25,82,11,15,26,97,69,6,30,77,98,44,32,39,71,47,64,78,6,61,72,75};
        int[] arr = {1,2,5,2,3};
        System.out.println(targetIndices(arr, 5));
    }

    static List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> list = new ArrayList<>();
        List<Integer> start = targetIndices(nums, target, true);
        List<Integer> end = targetIndices(nums, target, false);

        if (start != null) {
            list.addAll(start);
        }
        if (end != null) {
            list.addAll(end);
        }

        Set<Integer> set = new HashSet<>(list);
        List<Integer> newList = new ArrayList<>(set);
        Collections.sort(newList);

        return newList;

    }


    public static List<Integer> targetIndices(int[] nums, int target, boolean findStartIndex) {
        Integer ans = null;
        List<Integer> list = new ArrayList<>();

        List<Integer> sortedArrayList = new ArrayList<>();
        for (int num : nums) {
            sortedArrayList.add(num);
        }

        Collections.sort(sortedArrayList);

        int start = 0;
        int end = sortedArrayList.size() - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (target < sortedArrayList.get(mid)) {
                end = mid - 1;
            } else if (target > sortedArrayList.get(mid)) {
                start = mid + 1;
            } else {

                while (mid >= 0 && mid < sortedArrayList.size() && target == sortedArrayList.get(mid) ) {
                    ans = mid;
                    if (findStartIndex) {
                        end = mid - 1;
                        mid=mid-1;
                    } else {
                        start = mid + 1;
                        mid=mid+1;
                    }
                    list.add(ans);

                }
                break;
            }
        }
        Collections.sort(list);
        return list;
    }








//    List<Integer> targetIndices(int[] nums, int target){
//
//        List<Integer> list = new ArrayList<>();
//        List<Integer> start = targetIndices(nums,target,true);
//        List<Integer> end = targetIndices(nums,target,false);
//
//        if (start!= null){
//            list.addAll(start);
//        }
//        if (end != null){
//            list.addAll(end);
//        }
////        if (start == end){
////            list.remove(end);
////        }
//
//        Set<Integer> set = new HashSet<>(list);
//        List<Integer> newList = new ArrayList<>(set);
//
//        return newList;
//
//    }
//
//
//    public List<Integer> targetIndices(int[] nums, int target, boolean findStartIndex) {
//        Integer ans = null;
//        List<Integer> list = new ArrayList<>();
//
//        List<Integer> sortedArrayList = new ArrayList<>();
//        for (int num : nums){
//            sortedArrayList.add(num);
//        }
//
//        Collections.sort(sortedArrayList);
//
//        int start = 0;
//        int end = sortedArrayList.size()-1;
//        while (start<=end){
//            int mid = (start+end)/2;
//
//            if(target < sortedArrayList.get(mid)){
//                end = mid - 1;
//            }
//            else if (target > sortedArrayList.get(mid)){
//                start = mid + 1;
//            }
//            else {
//                ans = mid;
//                if (findStartIndex){
//                    end = mid-1;
//                }
//                else {
//                    start = mid+1;
//                }
//                list.add(ans);
//            }
//        }
//
//        return list;
//    }
}
