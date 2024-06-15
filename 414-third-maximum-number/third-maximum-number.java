class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        // Add all unique numbers to the set
        for (int num : nums) {
            set.add(num);
        }
        
        // Convert the set to a list and sort it in reverse order
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        
        // If there are less than 3 unique numbers, return the maximum
        if (list.size() < 3) {
            return list.get(0);
        } else {
            // Otherwise, return the third maximum number
            return list.get(2);
        }
    }
}
