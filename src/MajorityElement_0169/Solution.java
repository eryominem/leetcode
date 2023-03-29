package MajorityElement_0169;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = countsNums(nums);

        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry: counts.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }
        return majorityEntry.getKey();
    }

    public Map<Integer, Integer> countsNums(int[] nums) {
        Map<Integer, Integer> elements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!elements.containsKey(nums[i])) {
                elements.put(nums[i], 1);
            }
            elements.put(nums[i], elements.get(nums[i]) + 1);
        }

        return elements;
    }
}
