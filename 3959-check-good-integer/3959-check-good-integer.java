class Solution {
    public boolean checkGoodInteger(int n) {
        int d = 0;
        int s = 0;
        while (n > 0) {
            int temp = n % 10;
            d += temp;
            s += temp * temp;
            n /= 10;
        }
        return (s - d) >= 50;
    }
}