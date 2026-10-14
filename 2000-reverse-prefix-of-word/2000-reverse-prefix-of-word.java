class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st= new Stack<>();
        int n=-1;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)!=ch){
                st.push(word.charAt(i));
            } else{
                st.push(word.charAt(i));
                n=i;
                break;
            }
        }
        if(n==-1){
            return word;
        }
        String ans="";
        while(!st.isEmpty()){
            ans=ans+st.pop();
        }
         for(int i=n+1;i<word.length();i++){
            ans=ans+word.charAt(i);
         }
         
         return ans;
        
    }
}