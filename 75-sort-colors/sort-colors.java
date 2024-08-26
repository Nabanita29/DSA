class Solution {
    public void sortColors(int[] nums) {

        // Dutch National Flag Algorithm
        // The logic is that everything from 0 to low - 1 -> '0'
        // low to mid - 1 -> '1'
        // mid to high -> unsorted
        // high + 1 to n - 1 -> '2'

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 2){
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }

    }
}