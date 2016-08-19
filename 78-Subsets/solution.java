public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0){
            return result;
        }
        Arrays.sort(nums);
        List<Integer> subset = new ArrayList<>();
        helper(result, subset, nums, 0);
        return result;
    }
    
    public void helper(List<List<Integer>> result, List<Integer> subset, int[] nums, int fromIndex){
        //CLONE A NEW SUBSET!!!
        result.add(new ArrayList<>(subset));
        for(int i = fromIndex; i < nums.length; i++){
            subset.add(nums[i]);
            //i + 1, not fromIndex + 1!!!!!
            helper(result, subset, nums, i + 1);
            subset.remove(subset.size() - 1);
        }
    }
}