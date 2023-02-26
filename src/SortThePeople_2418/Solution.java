package SortThePeople_2418;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> personInfo = new TreeMap<>(Collections.reverseOrder());
        String[] sortNames = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            personInfo.put(heights[i], names[i]);
        }

        int i = 0;
        for (Integer height : personInfo.keySet()) {
            sortNames[i] = personInfo.get(height);
            i++;
        }
        return sortNames;
    }
}
