class Solution {
    public String reverseWords(String s) {
        // Convert the input string to a StringBuilder for easier modification
        StringBuilder sb = new StringBuilder(s);

        // Initialize the start of the first word
        int start = 0;

        // Iterate through the string to find spaces that denote word boundaries
        for (int i = 0; i <= sb.length(); i++) {
            // When a space or the end of the string is found, reverse the word
            if (i == sb.length() || sb.charAt(i) == ' ') {
                int end = i - 1; // Set end to the last character of the word
                reverse(sb, start, end); // Reverse the word between start and end
                start = i + 1; // Move start to the beginning of the next word
            }
        }

        // Convert the StringBuilder back to a string and return it
        return sb.toString();
    }

    // Helper function to reverse characters in the StringBuilder 
    // between indices start and end
    private void reverse(StringBuilder sb, int start, int end) {
        // Swap characters from the start and end, moving towards the center
        while (start < end) {
            // Temporarily hold the character at the start index
            char temp = sb.charAt(start);

            // Set the character at the start index to the one at the end index
            sb.setCharAt(start, sb.charAt(end));

            // Set the character at the end index to the one temporarily held
            sb.setCharAt(end, temp);

            // Move the start index forward and the end index backward
            start++;
            end--;
        }
    }
}
