class Solution {
    public int removeElement(int[] nums, int val) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right){ 
            if(nums[right] == val) right--; 
            //We need right to be at a place where the element is not val so we can switch
            else if(nums[left] != val) left++;
            //We need to make sure left is at val so we can switch
            else{
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }
}
