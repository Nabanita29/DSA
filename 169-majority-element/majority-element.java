class Solution {
    public int majorityElement(int[] nums) {
        int x = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < x ; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }

        int majorityElement = nums[0];
        int max = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > x/2 && entry.getValue() > max){
                max = entry.getValue();
                majorityElement = entry.getKey();
            }
        }

        return majorityElement;
    }
}