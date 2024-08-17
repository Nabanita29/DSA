class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int target = 0;
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> x = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate elements for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == target) {
                    List<Integer> result = Arrays.asList(nums[i], nums[left], nums[right]);
                    x.add(result);

                    // Skip duplicate elements for left and right
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    // Move pointers after processing
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;  // Need a larger sum, move left pointer to the right
                } else {
                    right--;  // Need a smaller sum, move right pointer to the left
                }
            }
        }

        return x;
    }
}
