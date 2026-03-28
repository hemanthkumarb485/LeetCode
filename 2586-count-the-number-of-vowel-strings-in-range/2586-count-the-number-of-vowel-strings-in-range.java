class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int c = 0;
        for(int i = left; i <= right; i++) {
            String a = words[i];
            int n = a.length();
            char first = a.charAt(0);
            char last = a.charAt(n - 1);
            if(isVowel(first) && isVowel(last)) {
                c++;
            }
        }
        return c;
    }
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u';
    }
}