class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length];
        for(int j = 0; j < nums1.length; j++){
            result[j] = checkGreater(nums1[j], nums2);
        }
        return result;
    }

    public int checkGreater(int x, int[] nums2){
        int ans = -1; // Initialize ans to -1 assuming there might be no greater element
        for(int i = 0; i < nums2.length; i++){
            if(nums2[i] == x){
                for(int j = i + 1; j < nums2.length; j++){
                    if(nums2[j] > x){
                        ans = nums2[j];
                        break;
                    }
                }
                break;
            }
        }
        return ans;
    }
}
