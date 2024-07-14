import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Create a HashMap to store the frequency of each character in the magazine
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Populate the HashMap with the frequency of each character in the magazine
        for (char c : magazine.toCharArray()) {
            // If the character is already in the map, increment its count by 1
            // If not, add it to the map with a count of 1
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Check each character in the ransom note
        for (char c : ransomNote.toCharArray()) {
            // If the character is in the map and its count is greater than 0
            if (charCountMap.containsKey(c) && charCountMap.get(c) > 0) {
                // Decrease the count of the character in the map by 1
                charCountMap.put(c, charCountMap.get(c) - 1);
            } else {
                // If the character is not in the map or its count is 0, return false
                return false;
            }
        }

        // If we can match all characters in the ransom note with those in the magazine, return true
        return true;
    }
}
