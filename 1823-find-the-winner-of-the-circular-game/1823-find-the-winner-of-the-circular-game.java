class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        // entering the number in queue;
        for(int i=1;i<=n;i++){
            q.add(i);
        }
         // jab tak ek element n bachye queue me 
         while(q.size()>1){
            for(int i=1;i<=k-1;i++){
                q.add(q.remove()); // pichye wapas add ho raha hia remove karke
            }
             q.remove(); // ek element ko hamesha ke leye nekal  de rahe hai
         }
         return q.peek(); // answer
    }
}