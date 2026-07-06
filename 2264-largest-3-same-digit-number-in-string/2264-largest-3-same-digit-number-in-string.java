class Solution {
    public String largestGoodInteger(String num) {
        String c = "";
        for (int i = 0; i + 2 < num.length(); i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)) {
                c = c.compareTo(num.substring(i, i + 3)) > 0 ? c : num.substring(i, i + 3);
            }
        }
        return c;
    }
}