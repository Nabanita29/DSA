class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        return helper(s, 0, s.length()-1);
               
    }
    
    private boolean helper(String s, int start, int end){
        if(start > end) return true;
        if(s.charAt(start) != s.charAt(end)) return false;
        return helper(s, start+1, end-1);
        
    

}}