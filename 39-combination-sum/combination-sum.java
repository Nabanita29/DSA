import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(candidates, target, new ArrayList<>(), result, 0);
        return result;
    }

    private void findCombinations(int[] candidates, int target, List<Integer> current, List<List<Integer>> result, int index) {
        // Base case: if target is 0, add the current combination to the result
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        // If index exceeds array length or target becomes negative, return
        if (index >= candidates.length || target < 0) {
            return;
        }
        // Pick the element: include candidates[index] in the current combination
        current.add(candidates[index]);
        findCombinations(candidates, target - candidates[index], current, result, index);
        // Backtrack: remove the last added element
        current.remove(current.size() - 1);
        // Don't pick the element: move to the next index
        findCombinations(candidates, target, current, result, index + 1);
    }
}

