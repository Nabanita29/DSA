class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        int i = 0;
        
        // Walk up the mountain
        while (i + 1 < arr.length && arr[i] < arr[i + 1]) {
            i++;
        }
        
        // Peak cannot be the first or last element
        if (i == 0 || i == arr.length - 1) {
            return false;
        }
        
        // Walk down the mountain
        while (i + 1 < arr.length && arr[i] > arr[i + 1]) {
            i++;
        }
        
        // If we reached the end, it means it is a valid mountain array
        return i == arr.length - 1;
    }
}
