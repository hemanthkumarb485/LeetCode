class Solution {
    public int binaryGap(int n) {
        String b = Integer.toBinaryString(n);
        int c = -1;
        int max = 0;
        for(int i = 0; i < b.length(); i++) {
            if(b.charAt(i) == '1') {
                if(c != -1) {
                    max = Math.max(max, i - c);
                }
                c = i;
            }
        }
        return max;
    }
}