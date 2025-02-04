public class product_of_array_except_self {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int count = 1, temp = 0;
        for (int i = 0; i < n; i++){
            if (nums[i] != 0){
                count *= nums[i];
            }
            else temp += 1;
        }
        for (int i = 0; i < n; i++){
            if (temp > 1){
                answer[i] = 0;
            }
            else if (nums[i] == 0){
                answer[i] = count;
            }
            else if (temp > 0 && nums[i] != 0){
                answer[i] = 0;
            }
            else answer[i] = count / nums[i];
        }
        return answer;
    }
}
