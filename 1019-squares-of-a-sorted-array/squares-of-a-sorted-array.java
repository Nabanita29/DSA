class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;    
        int n = nums.length;
        int[] result = new int[n];
        int index = n - 1;

        while (left <= right) {  
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;  
                right--;
            }
            index--;
        }
        return result;
    }
}
