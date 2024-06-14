class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] x = new int[nums.length];
        ArrayList result = new ArrayList();

        HashSet<Integer> set = new HashSet();
        for (int num : nums){
            set.add(num);
        }
        for(int i = 1; i <= nums.length; i++){
            if(!set.contains(i)){
                result.add(i);
            } set.add(i);
        }

        return result;
    }
}