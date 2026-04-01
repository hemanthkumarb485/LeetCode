class Solution {
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        int f = 2;
        int s = 1;
        int t = 0;
        for (int i = 3; i <= n; i++) {
            t = f + s;
            s = f;
            f = t;
        }

        return t;
    }
}