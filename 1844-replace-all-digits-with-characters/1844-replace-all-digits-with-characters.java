class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        char c = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                ch = (char)(c + (ch - '0'));
                sb.append(ch);
            }
            else {
                c = ch;
                sb.append(c);
            }
        }
        return sb.toString();
    }
}