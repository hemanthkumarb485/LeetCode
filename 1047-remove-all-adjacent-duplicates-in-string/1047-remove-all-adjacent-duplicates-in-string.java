class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        // char[] arr = s.toCharArray();
        for (char ch : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == ch) {
                st.pop();
            }
            else {
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}