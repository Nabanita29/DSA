class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> frequency = new HashMap();
        for(int num : arr){
            frequency.put(num , frequency.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> x = new HashSet<>();
        for (Map.Entry<Integer,Integer> entry : frequency.entrySet()){
            int value = entry.getValue();
            if(x.contains(value)){
                return false;
            }
            x.add(value);
        }
        return true;
    }
}