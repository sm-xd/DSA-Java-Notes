// Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

// There may be duplicates in the original array.

// Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.

class Solution {
    public boolean check(int[] nums) {
        int size = nums.length;
        int count=0;
        for(int i=1;i<size;i++){
            if(nums[i-1]>nums[i]){
                count++;
            }
        }
        if(nums[size-1]>nums[0]){
            count++;
        }
        return count<2;
    }
}

class _01_ArraySortedAndRotated {
        public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 1, 3, 4};
        //more testcases
        int[] nums1 = {3, 4, 5, 1, 2};
        int[] nums2 = {1, 2, 3, 4, 5};
        int[] nums3 = {2, 3, 4, 5, 1};
        int[] nums4 = {1, 2, 3, 4, 5, 6};
        System.out.println(solution.check(nums)); // Output: false
        System.out.println(solution.check(nums1)); // Output: true
        System.out.println(solution.check(nums2)); // Output: true  
        System.out.println(solution.check(nums3)); // Output: true
        System.out.println(solution.check(nums4)); // Output: true
    }
}