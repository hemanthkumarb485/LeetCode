class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for (String s : words) {
            int c = 0;
            for (char ch : s.toCharArray()) {
                c += weights[ch - 'a'];
            }
            int num = c % 26;
            char l = (char)('z' - num);
            sb.append(l);
        }
        return sb.toString();
    }
}