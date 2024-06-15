import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count occurrences of each number in nums1
        for (int i = 0; i < nums1.length; i++){
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }

        // Check for intersections with nums2 and update the map
        for (int x : nums2){
            if(map.containsKey(x) && map.get(x) > 0){
                result.add(x);
                map.put(x, map.get(x) - 1); // Remove one occurrence from the map
            }
        }

        // Convert the result list to an array
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }

        return answer;
    }
}
