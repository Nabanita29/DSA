class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         // Create an array to count the frequency of each character in the magazine
        int[] charCount = new int[26];
        
        // Count the frequency of each character in the magazine
        for (char ch : magazine.toCharArray()) {
            charCount[ch - 'a']++;
        }
        
        // Check if ransomNote can be constructed
        for (char ch : ransomNote.toCharArray()) {
            if (charCount[ch - 'a'] == 0) {
                return false;  // Not enough characters in magazine
            }
            charCount[ch - 'a']--;  // Use up one character
        }
        
        return true;  // All characters in ransomNote are matched
    }
}