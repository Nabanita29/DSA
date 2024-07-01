class Solution {
public:
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>> result;
        vector<int> current;
        findCombinations(candidates, target, current, result, 0);
        return result;
    }

private:
    void findCombinations(vector<int>& candidates, int target, vector<int>& current, vector<vector<int>>& result, int index) {
        // Base case: if target is 0, add the current combination to the result
        if (target == 0) {
            result.push_back(current);
            return;
        }
        // If index exceeds array length or target becomes negative, return
        if (index >= candidates.size() || target < 0) {
            return;
        }
        // Pick the element: include candidates[index] in the current combination
        current.push_back(candidates[index]);
        findCombinations(candidates, target - candidates[index], current, result, index);
        // Backtrack: remove the last added element
        current.pop_back();
        // Don't pick the element: move to the next index
        findCombinations(candidates, target, current, result, index + 1);
    }
};
