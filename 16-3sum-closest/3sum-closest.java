class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2];  // Initialize with the first possible sum

        for(int i = 0; i < n - 2; i++){
            int low = i + 1;
            int high = n - 1;

            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];

                if(Math.abs(sum - target) < Math.abs(closestSum - target)){
                closestSum = sum;
                }

                if(sum < target){
                    low++;
                }
                else if(sum > target){
                    high--;
                }
                else {
                    return target;
                }
            }

        }

        return closestSum;
        
    }
}