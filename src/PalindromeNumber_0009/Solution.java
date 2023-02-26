package PalindromeNumber_0009;

public class Solution {
    public boolean isPalindrome(int x) {
        String forward = String.valueOf(x);
        for (int i = 0; i < forward.length() / 2; i++) {
            if (forward.charAt(i) != forward.charAt(forward.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
