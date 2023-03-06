package IntersectionOfTwoArrays_0349;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (Integer n : nums1) {
            set1.add(n);
        }

        Set<Integer> set2 = new HashSet<>();
        for (Integer n : nums2) {
            set2.add(n);
        }

        Set<Integer> resultSet = set1.stream().filter(set2::contains).collect(Collectors.toSet());

        int[] arr = new int[resultSet.size()];

        int j = 0;
        for (Integer n : resultSet) {
            arr[j] = n;
            j++;
        }

        return arr;
    }
}
