import java.util.Arrays;

public class longest_consecutive_sequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int max = 0;
        int streak = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] == nums[i-1]) {
                continue;
            }
            if (nums[i] - nums[i-1] == 1){
                streak += 1;
            }else{
                max = Math.max(streak, max);
                streak = 1;
            }
            max = Math.max(streak, max);
        }
        return Math.max(streak, max);
    }
}
