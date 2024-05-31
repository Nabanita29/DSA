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
        int RightIndex = n - 1;
        for (int i = k - 1; i >= 0; i--) {
            LeftSum = LeftSum - cardPoints[i]; // Remove from the left side
            RightSum = RightSum + cardPoints[RightIndex]; //Add to right
            maxSum = Math.max(maxSum, LeftSum + RightSum);
            RightIndex--;
        }

        return maxSum;
    }
}
