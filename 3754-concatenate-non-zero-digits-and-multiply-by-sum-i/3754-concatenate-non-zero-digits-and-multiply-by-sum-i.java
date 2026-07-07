class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);
        long d = 0;
        long c = 0;
        for (char ch : s.toCharArray()) {
            if (ch != '0') {
                int temp = ch - '0';
                d = d * 10 + temp;
                c += temp;
            }
        }
        return d * c;
    }
}