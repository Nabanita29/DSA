class Solution {
    public int countOdds(int low, int high) {
        
        // Adjust the low to the first odd if even
        if(low % 2 == 0){
            low++;
        }
        // Adjust the high to a odd if even
        if(high % 2 == 0){
            high--;
        }

        // Stop condition
        if(low > high){
            return 0;
        }

        return(high - low)/2 + 1;
        
    }
}