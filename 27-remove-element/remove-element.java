class Solution {
    public int removeElement(int[] nums, int val) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right){ 
            if (nums[right] == val) right--;
            else if (nums[left] != val) left++;
            else if (nums[left] == val && nums[right] != val) {
                int temp = nums[left];
                nums[left] = nums[right]; // Corrected the swap logic
                nums[right] = temp;
                left++; // Move left pointer after swapping
                right--; // Move right pointer after swapping
            }
        }
        return left; // Return the correct count
    }
}
