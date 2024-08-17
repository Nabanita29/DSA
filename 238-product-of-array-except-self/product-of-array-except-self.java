class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

         // Initialize the prefix array to store products of elements to the right
        int[] prefix = new int[n];
        prefix[n - 1] = 1;
        for(int i = n - 2; i >= 0; i--){
            prefix[i] = prefix[i + 1] * nums[i + 1];
        }

        int[] suffix = new int[n];
        suffix[0] = 1;
        for(int i = 1; i < n ; i++){
            suffix[i] = suffix[i - 1] * nums[i - 1];
        }

        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            result[i] = prefix[i] * suffix[i];
        }

        return result;

    }
}