// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {
//         int n=temperatures.length;
//         int [] ans= new int[n];
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(temperatures[j]>temperatures[i]){
//                     int days=j-i;
//                     ans[i]=days;
//                     break;
//                 }
//             }
//         }
//             return ans;
//     }
// }

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                int idx = st.pop();
                ans[idx] = i - idx;
            }
            st.push(i);
        }
        return ans;
    }
}