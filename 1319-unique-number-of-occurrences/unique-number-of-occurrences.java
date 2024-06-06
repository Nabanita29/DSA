import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // Step 1: Count the occurrences of each number using a HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Step 2: Check if all occurrence counts are unique using a HashSet
        HashSet<Integer> result = new HashSet<>();
        for (int count : map.values()) {
            if (!result.add(count)) {
                return false; // If adding count to the set fails, it means the count is not unique
            }
        }

        return true; // All counts are unique
    }
}
