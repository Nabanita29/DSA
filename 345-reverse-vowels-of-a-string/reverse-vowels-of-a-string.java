class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        char[] ch = s.toCharArray();
        int low = 0;
        int high = n - 1;

        while (low < high) {
            // Move low pointer to the next vowel
            if (!isVowel(ch[low])) {
                low++;
            }
            // Move high pointer to the previous vowel
            else if (!isVowel(ch[high])) {
                high--;
            }
            // If both pointers are at vowels, swap them
            else {
                char temp = ch[low];
                ch[low] = ch[high];
                ch[high] = temp;
                low++;
                high--;
            }
        }

        return new String(ch);
    }

    // Method to check if a character is a vowel (both lower and upper case)
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
