class Solution {
    public String reverseOnlyLetters(String s) {

        StringBuilder sb = new StringBuilder(s);

        int low = 0;
        int high = sb.length() - 1;

        while (low <= high) {
            if (!Character.isLetter(sb.charAt(low))) {
                low++;
            } else if (!Character.isLetter(sb.charAt(high))) {
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

}
