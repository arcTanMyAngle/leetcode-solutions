class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        number_map = {}
        for i, n in enumerate(nums):
            comp = target - n
            if comp in number_map:
                return [number_map[comp], i]
            number_map[n] = i
        return []
