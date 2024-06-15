class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        // Calculate total sum of all elements in nums
        for (int num : nums) {
            sum += num;
        }
        
        int leftSum = 0;
        int rightSum = sum; // Initialize rightSum to total sum of nums
        
        for (int i = 0; i < nums.length; i++) {
            rightSum = rightSum - nums[i]; // Update rightSum excluding current nums[i]
            
            if (leftSum == rightSum) {
                return i;
            }
            
            leftSum += nums[i]; // Update leftSum for the next iteration
        }
        
        return -1; // No pivot index found
    }
}
