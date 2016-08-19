public class Subsets_II {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
     List<List<Integer>> result = new ArrayList<>();
     if (nums == null || nums.length == 0){
         return result;
     }
     Arrays.sort(nums);
     List<Integer> subset = new ArrayList<>();
     helper(result, subset, nums, 0);
     return result;
    }
    private void helper(List<List<Integer>> result,
                        List<Integer> subset,
                        int[] nums, int fromIndex){
        //REMEMBER THIS!!! clone the subset before use.
        result.add(new ArrayList(subset));
        for(int i = fromIndex; i < nums.length; i++){
            if(i != fromIndex && nums[i] == nums[i - 1]){
                continue;
            }
            subset.add(nums[i]);
            helper(result, subset, nums, i + 1);
            subset.remove(subset.size() - 1);
        }
    }
}