public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int start = 0;
        int end = nums.length - 1;
        //find the first postion >= target
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        //need to understand the meaning of these positions
        //why these condition and why the order of these following coditions
        if (nums[start] >= target) {
            return start;
        } else if (nums[end] >= target) {
            return end;
        } else{
            return end + 1;
        }
    }
}