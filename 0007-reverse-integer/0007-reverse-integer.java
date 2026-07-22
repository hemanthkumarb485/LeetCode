class Solution {
    public int reverse(int x) {
        int n = 1;
        if (x < 0) {
            n = x * -1;
        }
        else {
            n = x;
        }
        int c = 0;
        while (n != 0) {
            int temp = n % 10;
            n /= 10;
            if (c > Integer.MAX_VALUE / 10 || (c == Integer.MAX_VALUE / 10 && temp > 7)) {
                return 0;
            }
            if (c < Integer.MIN_VALUE / 10 || (c == Integer.MIN_VALUE / 10 && temp < -8)) {
                return 0;
            }
            c = c * 10 + temp;
        } 
        if (x < 0) {
            return c * -1;
        }
        return c;
    }
}