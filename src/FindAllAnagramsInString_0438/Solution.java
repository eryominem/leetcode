package FindAllAnagramsInString_0438;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> indexes = new ArrayList<>();

        if (s.length() < p.length()) {
            return indexes;
        }

        int[] hashmap = new int[128];

        for (Character ch : p.toCharArray()) {
            hashmap[ch]++;
        }

        int start = 0, end = 0, counter = p.length();

        while (end < s.length()) {
            if (hashmap[s.charAt(end++)]-- > 0)
                counter--;

            if (counter == 0)
                indexes.add(start);

            if (end - start == p.length() && hashmap[s.charAt(start++)]++ >= 0)
                counter++;
        }

        return indexes;
    }
}