// Time Complexity: O(M+N) 
// Space Complexity: O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // initialize the index of last real (!= 0) element
        int p_n = n - 1;
        int p_m = m - 1;
        int p = m + n - 1;
        //  Merge from back to front
        while (p_m >= 0 && p_n >=0){
            if (nums1[p_m] > nums2[p_n] ){
                nums1[p--] = nums1[p_m--];
            } else {
                nums1[p--] = nums2[p_n--];
            }
        }
        // getting the stragglers into the remaining part
        System.arraycopy(nums2, 0, nums1, 0, p_n + 1);

    }
}
