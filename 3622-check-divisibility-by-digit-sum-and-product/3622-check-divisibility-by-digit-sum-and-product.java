class Solution {
    public boolean checkDivisibility(int n) {
        // if(n < 10) {
        //     return false;
        // }
        // if(n%10 == 0) return true;
        int s = 0;
        int p = 1;
        int temp = n;
        while(temp > 0) {
            int d = temp % 10;
            s += d;
            p *= d;
            temp /= 10;
        }
        int a = s+p;
        return n%a == 0;
    }
}