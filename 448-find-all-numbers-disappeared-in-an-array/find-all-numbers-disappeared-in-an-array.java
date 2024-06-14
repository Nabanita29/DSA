class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] x = new int[nums.length];
        ArrayList result = new ArrayList();

        for(int i = 0; i < nums.length; i++){
            x[i] = i + 1;
        }

        HashSet<Integer> set = new HashSet();
        for (int num : nums){
            set.add(num);
        }
        for(int num : x){
            if(!set.contains(num)){
                result.add(num);
            } set.add(num);
        }

        return result;
    }
}