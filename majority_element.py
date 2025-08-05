class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        count = 1
        candidate = nums[0]
        for e in nums[1:]:
            if e == candidate:
                count += 1
            elif count > 0:
                count -= 1
            else:
                candidate = e
                count = 1
        return candidate

