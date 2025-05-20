class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int totalSum = (size*(size+1))/2;
        for(int ele: nums){
            totalSum -=ele;
        }
        return totalSum;
    }
}

public class _02_MissingNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 0, 1};
        //more testcases
        int[] nums1 = {0, 1};
        int[] nums2 = {9,6,4,2,3,5,7,0,1};
        int[] nums3 = {0};
        System.out.println(solution.missingNumber(nums)); // Output: 2
        System.out.println(solution.missingNumber(nums1)); // Output: 2
        System.out.println(solution.missingNumber(nums2)); // Output: 8
        System.out.println(solution.missingNumber(nums3)); // Output: 1
    }
}
