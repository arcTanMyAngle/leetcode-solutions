class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        point1 = m - 1
        point2 = n - 1
        point = m + n - 1
        
        while point1 >= 0 and point2 >= 0:
            if nums1[point1] > nums2[point2]:
                nums1[point] = nums1[point1]
                point1 -= 1
            else:
                nums1[point] = nums2[point2]
                point2 -= 1
            point -= 1

        # append any stragglers 
        nums1[:point2 + 1] = nums2[:point2 + 1]
