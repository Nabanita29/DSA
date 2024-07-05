class Solution {
    public String largestOddNumber(String num) {
        int x = -1;
        
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) % 2 == 1) {
                x = i;
                break;
            }
        }

       return num.substring(0,x+1);
    }
}
