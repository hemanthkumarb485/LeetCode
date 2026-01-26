class Solution {
    public int lengthOfLastWord(String s) {
        String[] ch = s.split(" ");
        int n = ch.length;
        // String a = ch[n-1];
        return ch[n-1].length();
    }
}