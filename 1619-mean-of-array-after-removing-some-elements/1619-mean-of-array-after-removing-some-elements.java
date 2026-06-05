class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int r = n / 20;
        int c = 0;
        for (int i = r; i < n - r; i++) {
            c += arr[i];
        }
        return (double)c/(n - 2 * r);
    }
}