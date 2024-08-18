class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int length = 0;
        Set<Character> frequence = new HashSet<>();

        for(int i = 0; i < jewels.length(); i++){
            frequence.add(jewels.charAt(i));
        }

        for(int j = 0; j < stones.length(); j++){
            if(frequence.contains(stones.charAt(j))){
                length++;
            }
        }
        return length;
    }
}