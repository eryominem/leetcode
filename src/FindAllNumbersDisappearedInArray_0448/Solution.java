package FindAllNumbersDisappearedInArray_0448;

import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(Integer n : nums) {
            set.add(n);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }

        return list;
    }
}
