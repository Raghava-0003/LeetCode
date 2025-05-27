class Solution {
    public double findMaxAverage(int[] arr, int k) {
         int n = arr.length;
        if (k > n) {
            throw new IllegalArgumentException("k should not be greater than the array length.");
        }
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum); 
        }

        return (double)maxSum/k;
    }
        
    
}