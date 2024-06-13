class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m - 1;
        int right = n - 1;
        int index = m + n - 1;
        // Start from end and keep filling the elements
        while (left >= 0 && right >= 0){
            if(nums2[right] > nums1[left]){
                nums1[index] = nums2[right];
                right--;
            } else {
                nums1[index] = nums1[left];
                left--;
            }
            index--;
        }
        // If there are remaining elements in nums2 copy them
        while (right >= 0) {
            nums1[index] = nums2[right];
            index--;
            right--;
        }
        
        
    }
}