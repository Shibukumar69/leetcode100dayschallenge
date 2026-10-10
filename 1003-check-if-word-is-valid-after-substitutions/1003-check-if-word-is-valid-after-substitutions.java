class Solution {
    public boolean isValid(String s) {
        Deque<Character> st=new ArrayDeque<>();
        for(char ch:s.toCharArray()){
            if(ch=='a' || ch=='b'){
                st.push(ch);
            } else{
                if (st.size() < 2) {
                    return false;
                }
                char top1=st.peek();//b
                st.pop();
                char top2=st.peek();//a
                 st.pop();
                if(top1!='b' || top2!='a'){
                   return false;
                }

            }

        }
        
         return st.isEmpty();

    }
}