class Solution(object):
    def combinationSum(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        result = []
        self.find_combinations(candidates, target, [], result, 0)
        return result

    def find_combinations(self, candidates, target, current, result, index):
        # Base case: if target is 0, add the current combination to the result
        if target == 0:
            result.append(list(current))
            return
        # If index exceeds array length or target becomes negative, return
        if index >= len(candidates) or target < 0:
            return
        # Pick the element: include candidates[index] in the current combination
        current.append(candidates[index])
        self.find_combinations(candidates, target - candidates[index], current, result, index)
        # Backtrack: remove the last added element
        current.pop()
        # Don't pick the element: move to the next index
        self.find_combinations(candidates, target, current, result, index + 1)
