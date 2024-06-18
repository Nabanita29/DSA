class NumArray {
    private int[] prefixSums;

    public NumArray(int[] nums) {
        // Initialize the prefix sums array with an extra element at the beginning
        prefixSums = new int[nums.length + 1];
        // Compute the prefix sums
        for (int i = 0; i < nums.length; i++) {
            prefixSums[i + 1] = prefixSums[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        // Calculate the sum using the prefix sums
        return prefixSums[right + 1] - prefixSums[left];
    }
}