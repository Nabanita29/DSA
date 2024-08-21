class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        int start = 0;
        for(int i = 0; i <= sb.length(); i++){  
            if(i == sb.length() || sb.charAt(i) == ' '){
                int end = i - 1;
                reverse(sb, start, end);
                start = i + 1;
            }
            
        }
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