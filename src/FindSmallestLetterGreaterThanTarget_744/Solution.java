package FindSmallestLetterGreaterThanTarget_744;

public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            char guess = letters[middle];

            if (guess > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return letters[left % letters.length];
    }
}