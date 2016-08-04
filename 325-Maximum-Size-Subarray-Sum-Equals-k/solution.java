public class Solution {
      public static int maxSubArrayLen(int[] nums, int k) {
    if (nums == null || nums.length == 0)
        return 0;
    int len = nums.length, maxLen = 0, sum = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < len; i++) {
        sum += nums[i];
        if (sum == k)
            maxLen = i + 1;
        else {
            if (map.get(sum - k) != null)
                maxLen = Integer.max(maxLen, i - map.get(sum - k));
        }
        if (map.get(sum) == null)
            map.put(sum, i);
    }
    return maxLen;
  }
}