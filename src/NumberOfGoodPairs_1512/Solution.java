package NumberOfGoodPairs_1512;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int value = map.get(nums[i]) + 1;
                map.put(nums[i], value);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value > 1) {
                count += value * (value - 1) / 2;
            }
        }
        return count;
    }
}
