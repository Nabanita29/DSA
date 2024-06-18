class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {

        int profitmax = 0;

        for (int i = 0; i < worker.length; i++) {
            int maximumprofit = 0; // Initialize maximumprofit outside the inner loop
            for (int j = 0; j < difficulty.length; j++) {
                if (worker[i] >= difficulty[j]) {
                    maximumprofit = Math.max(maximumprofit, profit[j]);
                }
            }
            profitmax += maximumprofit; // Add the maximum profit for each worker
        }
        return profitmax;
    }
}
