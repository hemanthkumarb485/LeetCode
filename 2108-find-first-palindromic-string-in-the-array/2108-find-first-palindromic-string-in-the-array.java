class Solution {
    public String firstPalindrome(String[] words) {
        for(String s : words) {
            String a = s;
            StringBuilder sb = new StringBuilder(a);
            sb.reverse();
            String b = sb.toString();
            if(a.equals(b)) {
                return a;
            }
        }
        return "";
    }
}