class Solution {
    public int minAddToMakeValid(String s) {
         Deque<Character> st= new ArrayDeque<>();
          int extra=0;
          for(char ch:s.toCharArray()){
             if(ch=='('){
                st.push(ch);
                 
             } else if(!st.isEmpty()){
                 st.pop();
             }
              else{
                extra++;
              }
             }
              return Math.abs(extra+st.size());
              
          }
    }
