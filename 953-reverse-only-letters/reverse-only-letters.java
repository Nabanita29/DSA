class Solution {
    public String reverseOnlyLetters(String s) {

        StringBuilder sb = new StringBuilder(s);

        int low = 0;
        int high = sb.length() - 1;

        while (low <= high) {
            if (!isAlphabet(sb.charAt(low))) {
                low++;
            } else if (!isAlphabet(sb.charAt(high))) {
                high--;
            } else {
                char temp = sb.charAt(low);
                sb.setCharAt(low, sb.charAt(high));
                sb.setCharAt(high, temp);
                low++;
                high--;
            }
        }
        return sb.toString();
    }

    // Method to check if a character is an alphabet letter
    private boolean isAlphabet(char c) {
        return Character.isLetter(c);
    }
}
