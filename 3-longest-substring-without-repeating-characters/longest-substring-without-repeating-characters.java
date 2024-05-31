import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashMap to store the last index of each character
        HashMap<Character, Integer> map = new HashMap<>();
        // Left boundary of the current window
        int l = 0;
        // Maximum length of substring without repeating characters
        int maxLen = 0;

        // Iterate through the string with the right boundary of the window
        for (int r = 0; r < s.length(); r++) {
            char currentChar = s.charAt(r);
            
            // If the character is already in the map and its index is within the current window
            if (map.containsKey(currentChar) && map.get(currentChar) >= l) {
                // Move the left boundary to the right of the previous index of currentChar
                l = map.get(currentChar) + 1;
            }
            
            // Update the last index of the current character
            map.put(currentChar, r);
            // Calculate the length of the current window
            int len = r - l + 1;
            // Update the maximum length found so far
            maxLen = Math.max(maxLen, len);
        }
        
        return maxLen;
    }
}
