class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int low = 0;
        int high = numbers.length - 1;

        while (low < high) {
            int answer = numbers[low] + numbers[high];
            if (answer == target) {
                result[0] = low + 1;
                result[1] = high + 1;
                return result;  
            } else if (answer < target) {
                low++;
            } else {
                high--;
            }
        }

        return result;  // Return the result array.
    }
}
