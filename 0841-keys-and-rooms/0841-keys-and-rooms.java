class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n= rooms.size();
        boolean[] visited=new boolean[n];
        visited[0]=true;
        bfs(rooms,visited,0);
        for(int i=0;i<n;i++){
             if(visited[i]==false){
                return false;
             }
        }
        return true;
    }

    public void bfs(List<List<Integer>> rooms, boolean[]  visited,int start){
         Queue<Integer> q= new LinkedList<>();
         q.add(start);
         while(q.size()>0){
            int front=q.remove();
            for(int ele: rooms.get(front)){
                if(!visited[ele]){
                    q.add(ele);
                    visited[ele]=true;
                }
            }
         }
    }
}