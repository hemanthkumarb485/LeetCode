class Solution {
    public int maxProduct(int n) {
        int a = 0;
        int b = 0;
        while (n > 0) {
            int temp = n % 10;
            if (temp >= a) {
                b = a;
                a = temp;
            }
            else if (temp > b) {
                b = temp;
            }
            n /= 10;
        }
        return a * b;
    }
}