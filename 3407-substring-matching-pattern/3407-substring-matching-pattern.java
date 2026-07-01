class Solution {
    public boolean hasMatch(String s, String p) {
        int h = p.indexOf("*");
        int a = s.indexOf(p.substring(0, h));
        int b = s.indexOf(p.substring(h + 1), a + h);
        return a != -1 && b != -1;
    }
}