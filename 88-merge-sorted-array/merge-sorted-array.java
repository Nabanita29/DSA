import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int[m + n]; // Initialize arr with the correct size

        // Copy elements from nums1 to arr
        for(int i = 0; i < m; i++) {
            arr[i] = nums1[i];
        }

        // Copy elements from nums2 to arr
        for(int i = 0; i < n; i++) {
            arr[i + m] = nums2[i]; 
        }

        // Sort the combined array
        Arrays.sort(arr);

        // Copy the sorted elements back to nums1
        for(int i = 0; i < m + n; i++) {
            nums1[i] = arr[i];
        }
    }
}
