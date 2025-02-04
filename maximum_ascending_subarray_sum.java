public class maximum_ascending_subarray_sum {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int count = nums[0];
        int curSum = nums[0];
        for (int i = 1; i < n; i++){
            if (nums[i] > nums[i-1]){
                curSum += nums[i];
                if (curSum > count) count = curSum;
            } else{
                count = Math.max(count, curSum);
                curSum = nums[i];
            } 
        }
        return count;
    }
}
