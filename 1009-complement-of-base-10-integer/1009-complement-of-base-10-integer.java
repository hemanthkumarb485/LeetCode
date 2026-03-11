class Solution {
    public int bitwiseComplement(int n) {
        String a = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        int c = 0;
        for(char ch : a.toCharArray()) {
            if(ch == '0') {
                sb.append('1');
            }
            else {
                sb.append('0');
            }
        }
        String b = sb.toString();
        return Integer.parseInt(b, 2);
    }
}