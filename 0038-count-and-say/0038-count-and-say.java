// class Solution {
//     public String countAndSay(int n) {
//       if(n==1) return "1";
//      String result="1";
//     for(int i=2;i<=n;i++){
//         StringBuilder sb= new StringBuilder();
//         char [] arr= result.toCharArray();
//         int count=1;
//          for(int j=1;j<arr.length;j++){
//              if(arr[j]==arr[j-1]){ 
//                     count++;
//              } else{
//                   sb.append(count).append(arr[j-1]);
//                   count=1;
//              }
//          }
//            sb.append(count).append(arr[arr.length-1]);
//            result=sb.toString();
        
//     } 
//     return result;
//     }
// }   // method 2

class Solution {
    public String countAndSay(int n) {
      if(n==1){
        return "1";
      }
       String says= countAndSay(n-1);
        String result="";
        for(int i=0;i<says.length();i++){
            int count=1;
            char ch= says.charAt(i);
             while(i<says.length()-1 && says.charAt(i)==says.charAt(i + 1)){
                count++;
                i++;
             }
             result= result + count;
             result+= ch;
        }
         return result;
    }
}