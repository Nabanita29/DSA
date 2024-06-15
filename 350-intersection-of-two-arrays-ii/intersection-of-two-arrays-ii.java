import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else if (nums1[i] == nums2[j]){
                result.add(nums1[i]);
                i++;
                j++;
            }
        }
        
        

        // Convert the result list to an array
        int[] answer = new int[result.size()];
        for (int f = 0; f < result.size(); f++){
            answer[f] = result.get(f);
        }

        return answer;
    }
}
