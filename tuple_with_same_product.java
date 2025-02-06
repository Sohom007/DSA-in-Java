import java.util.Arrays;
import java.util.HashMap;

public class tuple_with_same_product {
        public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;
        HashMap<Integer, Integer> productCount = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++){
                int temp = nums[i] * nums[j];
                if (productCount.containsKey(temp)){
                    count += productCount.get(temp) * 8;
                }
                productCount.put(temp, productCount.getOrDefault(temp, 0) + 1);
            }
        }
        return count;
    }
}
