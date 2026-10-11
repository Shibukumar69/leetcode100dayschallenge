class Solution {
    public String simplifyPath(String path) {
        Deque<String> st= new ArrayDeque<>();
        String[] parts= path.split("/");
         for(String part:parts){
            if(part.equals("")){
                continue;
            } 
            if(part.equals(".")){
                continue;
            }
            if(st.isEmpty() && part.equals("..") ){
                continue;
            }
            if(!st.isEmpty() && part.equals("..")){
                st.pop();
            } else{
                st.push(part);
            }
         }
         if(st.isEmpty()){
            return "/";
         }
           else{

         StringBuilder res=new StringBuilder();
         while(!st.isEmpty()){
            res.append("/");
            res.append(st.removeLast());
            
         }
         return res.toString();
           }

    }
}