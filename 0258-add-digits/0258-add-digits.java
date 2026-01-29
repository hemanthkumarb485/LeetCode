class Solution {
    public int addDigits(int n) {
        
        while(n >= 10){
            int a = n % 10;
            int b = n / 10;
            int c = a+b;
            int d = c % 10;
            int e = c / 10;
            n = d + e;
        }
            return n;
    }
}