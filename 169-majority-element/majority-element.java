class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;    
        int element = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                count = 1;
                element = nums[i];
            }
            else if(element == nums[i]){
                count++;
            } else {
                count--;
            }
        }

        int count1 = 0;
        for (int num : nums){
            if(num == element){
                count++;
            }
        }

        int major = n / 2;
        if(count > major){
            return element;
        } else {
            return -1;
        }
        
    }
}