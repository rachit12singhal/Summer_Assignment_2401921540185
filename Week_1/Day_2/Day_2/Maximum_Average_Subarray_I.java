class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for(int i = 0; i < k; i++){
            sum = sum + nums[i];
        }
        double maxsum = sum;
        for(int i = k; i < nums.length; i++){
            sum = sum - nums[i-k];
            sum = sum + nums[i];
            maxsum = Math.max(maxsum,sum);
        }
        return maxsum/k;
    }
}