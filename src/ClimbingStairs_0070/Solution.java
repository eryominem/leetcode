package ClimbingStairs_0070;

public class Solution {
    public int climbStairs(int n) {
        int[] steps = new int[n+1];
        steps[0] = 1;
        steps[1] = 1;
        for (int i = 2; i < steps.length; i++) {
            steps[i] = steps[i-1] + steps[i-2];
        }
        return steps[steps.length-1];
    }
}
