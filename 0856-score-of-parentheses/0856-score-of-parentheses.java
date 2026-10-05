class Solution {
    public int scoreOfParentheses(String s) {
        int n = 0;
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                n++;
            } else {
                n--;
                if (s.charAt(i - 1) == '(') {
                    c += 1 << n;
                }
            }
        }
        return c;
    }
}