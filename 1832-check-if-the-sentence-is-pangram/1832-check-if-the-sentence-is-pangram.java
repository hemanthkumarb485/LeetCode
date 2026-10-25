class Solution {
    public boolean checkIfPangram(String s) {
        char[] arr = s.toCharArray();
        int[] num = new int[26];
        for (char ch : arr) {
            num[ch - 'a']++;
        }
        boolean bool = true;
        for (int i : num) {
            if (i == 0) {
                bool = false;
            }
        }
        return bool;
    }
}