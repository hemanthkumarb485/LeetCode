class Solution {
    public int gcdOfOddEvenSums(int n) {
        int os = 0;
        int es = 0;
        for (int i = 1; i <= n + n; i++) {
            if (i % 2 == 0) {
                es += i;
            }
            else {
                os += i;
            }
        }
        while (es != 0) {
            int temp = es;
            es = os % es;
            os = temp;
        }
        return os;
    }
}