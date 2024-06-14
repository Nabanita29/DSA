class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Handle edge case of empty array
        
        int index = 1; // Start from the second position for unique elements
        int left = 0; // Start from the first element
        
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] != nums[left]) {
                left++; // Move the left pointer to the next unique element
                nums[index] = nums[right]; // Place the unique element at the index
                index++; // Increment the index for the next unique element
            }
        }
        
        return index; // The index represents the number of unique elements
    }
}
