class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Handle edge case of empty array
        
        int index = 1; // Start from the second position for unique elements
        int left = 1; // Start from the second element
        
        while (left < nums.length) {
            // If current element is not equal to the element at index - 1,
            // it means we found a new unique element
            if (nums[left] != nums[index - 1]) {
                nums[index] = nums[left]; // Assign the unique element to the next index
                index++; // Increment the index for the next unique element
            }
            left++; // Move to the next element in the array
        }
        
        return index; // The index represents the number of unique elements
    }
}
