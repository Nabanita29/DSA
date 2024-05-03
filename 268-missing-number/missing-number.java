class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        // XOR all numbers from 0 to n
        int xor1 = 0;
        for (int i = 0; i <= n; i++) {
            xor1 ^= i;
        }
        
        // XOR all numbers in the input array
        int xor2 = 0;
        for (int num : nums) {
            xor2 ^= num;
        }
        
        // XOR of xor1 and xor2 will give the missing number
        return xor1 ^ xor2;
    }
}
