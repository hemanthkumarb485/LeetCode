class Solution {
    public int mirrorDistance(int num) {
        int mirror = 0;
        int real = num;
        while (num != 0) {
            int digit = num % 10;
            mirror = mirror * 10 + digit;
            num = num / 10;
        }
        int b = Math.abs(mirror - real);
        return b;
    }
}