# Time: O(n) | Space: O(1)
class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        if n == 0: return
        k %= n
        self.rvrs(nums, 0, n - 1)
        self.rvrs(nums, 0, k - 1)
        self.rvrs(nums, k, n - 1)

    def rvrs(self, a: List[int], l: int, r: int) -> None:
        while(l < r):
            a[l], a[r] = a[r], a[l]
            l+=1
            r-=1
