import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestPalindrome(String s) {
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        // Count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        boolean oddFound = false;

        // Calculate the length of the longest palindrome
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            
            // Add the even part of the frequency
            result += value / 2 * 2;
            
            // Check if there is any odd frequency to add one as the center of the palindrome
            if (value % 2 == 1) {
                oddFound = true;
            }
        }

        // If there is an odd frequency, add one to the result
        if (oddFound) {
            result += 1;
        }

        return result;
    }
}
