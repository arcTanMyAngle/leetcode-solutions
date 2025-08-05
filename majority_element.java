// Time: O(n) Space: 0(1)
class Solution {
    public int majorityElement(int[] nums) {
        // two ways to go about this
        // Booyer Moore Voting Algorithm or HashMap
        // Lets stick with the theme of arrays and utilize Booyers!

        //instead of starting at 0 lets begin at the first position in the array
        int candidate = nums[0];
        int count = 1;
        for (int e = 1; e < nums.length; e++){
            if (nums[e] == candidate) {count++;}
            else if (count > 0) {count--;}
            else 
                {candidate=nums[e]; count=1;}
        }
        return candidate;
    }
}
