class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int low = m - 1; 
        int high = n - 1;
        int index = m + n - 1; //Last place in nums1

        while(high >= 0 && low >= 0){ 
            // Start from the end compare nums2 with nums1
            if(nums2[high] > nums1[low]){
                nums1[index] = nums2[high];
                high--;
            } else {
                nums1[index] = nums1[low];
                low--;
            }
            index--;
        }

        while(high >= 0){
            nums1[index] = nums2[high];
            high--;
            index--;
        }


      
    }
}