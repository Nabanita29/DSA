class Solution {
    public boolean rotateString(String s, String goal) {
        int index = -1;
        if(s.length() != goal.length()){
            return false;
        }
        else{
            String test = s.concat(s);
            if(test.contains(goal)){
                return true;
            }
            else{
                return false;
            }
        }
    }
}