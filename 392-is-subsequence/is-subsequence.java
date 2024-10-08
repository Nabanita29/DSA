class Solution {
    public boolean isSubsequence(String s, String t) {

        int low = 0;
        int high = 0;

        while(low < s.length() && high < t.length()){
            if(s.charAt(low) != t.charAt(high)){
                high++;
            } else {
                low++;
                high++;
            }
        }
        return low == s.length();
    }
}