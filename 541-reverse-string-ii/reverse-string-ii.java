class Solution {
    public String reverseStr(String s, int k) {
        // Convert the input string to a StringBuilder for easier modification
        StringBuilder sb = new StringBuilder(s);

        // Iterate through the string in steps of 2*k
        // i is the start of the current 2*k segment
        for (int i = 0; i < sb.length(); i = i + 2 * k) {
            // Calculate the end index for the segment to be reversed
            // The end index is either (i + k - 1) or the last character of the string, whichever is smaller
            int end = Math.min(i + k - 1, sb.length() - 1);

            // Reverse the segment from index i to end
            reverse(sb, i, end);
        }

        // Convert the StringBuilder back to a string and return it
        return sb.toString();
    }

    // Helper function to reverse characters in the StringBuilder between indices start and end
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
