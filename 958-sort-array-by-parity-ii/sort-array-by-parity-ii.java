class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < nums.length && right > 0){
            if(left % 2 == 0 && nums[left] % 2 == 0){
                left = left + 2;
            }
            else if(right % 2 == 1 && nums[right] % 2 == 1){
                right = right - 2;
            }
            else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        return nums;
    }
}