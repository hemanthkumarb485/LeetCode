class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        char ch[]=s.toCharArray();
        if(ch.length%2==1){
            return false;
        }
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='{'||ch[i]=='['||ch[i]=='('){
                st.push(ch[i]);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                if((st.peek()=='('&&ch[i]==')')||(st.peek()=='{'&&ch[i]=='}')||(st.peek()=='['&&ch[i]==']')){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}