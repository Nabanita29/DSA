import java.util.HashMap;
import java.util.Map;

class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Populate the map with the frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int result = -1;
        int maxFrequency = 0;
        
        // Iterate through the map entries
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            
            // Check if the key is even and if it has a higher frequency or 
            // if the frequency is the same and the key is smaller than the current result
            if (key % 2 == 0) {
                if (value > maxFrequency || (value == maxFrequency && key < result)) {
                    maxFrequency = value;
                    result = key;
                }
            }
        }
        
        return result;
    }
}
