class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        
        // Initialize the prefix array to store products of elements to the right
        int[] prefix = new int[n];
        prefix[n - 1] = 1; // Last element in prefix array should be 1 (no elements to the right)
        
        // Fill the prefix array from right to left
        for(int i = n - 2; i >= 0; i--){
            // Each element is the product of the next element's prefix and the next element in nums
            prefix[i] = prefix[i + 1] * nums[i + 1];
        }

        // Initialize the suffix array to store products of elements to the left
        int[] suffix = new int[n];
        suffix[0] = 1; // First element in suffix array should be 1 (no elements to the left)
        
        // Fill the suffix array from left to right
        for(int i = 1; i < n; i++){
            // Each element is the product of the previous element's suffix and the previous element in nums
            suffix[i] = suffix[i - 1] * nums[i - 1];
        }

        // Initialize the result array to store the final products
        int[] result = new int[n];
        
        // Multiply the corresponding elements of prefix and suffix arrays to get the result
        for(int i = 0; i < n; i++){
            result[i] = prefix[i] * suffix[i];
        }

        // Return the final result array
        return result;
    }
}
