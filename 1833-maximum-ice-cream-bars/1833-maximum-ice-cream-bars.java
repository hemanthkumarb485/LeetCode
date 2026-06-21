class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int c = 0;
        int ct = 0;
        for (int i : costs) {
            c += i;
            if (c <= coins) {
                ct++;
            }
            else{
                break;
            }
        }
        return ct;
    }
}