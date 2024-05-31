class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        // Calculate the initial sum of the first k cards
        int LeftSum = 0;
        for (int i = 0; i < k; i++) {
            LeftSum += cardPoints[i];
        }

        // Initialize maxSum to the initial LeftSum
        int maxSum = LeftSum;

        // Calculate the sums by sliding the window from left to right
        int RightSum = 0;
        for (int i = 0; i < k; i++) {
            RightSum += cardPoints[n - 1 - i]; // Add from the right side
            LeftSum -= cardPoints[k - 1 - i]; // Remove from the left side
            maxSum = Math.max(maxSum, LeftSum + RightSum);
        }

        return maxSum;
    }
}
