class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList result = new ArrayList();
        int x = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < x ; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }

        int majorityElement = nums[0];
        int max = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > x/3){
                result.add(entry.getKey()); 
            }
        }
        return result;
    }
}