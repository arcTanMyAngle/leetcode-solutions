// Time Complexity: O(n)
// Space Complexity O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map_index = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int compl = target - nums[i];
            if(map_index.containsKey(compl)) return new int[] {map_index.get(compl), i};
            map_index.put(nums[i], i);

        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
