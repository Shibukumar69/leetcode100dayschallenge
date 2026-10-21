class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
       return createbst(list,0,list.size()-1);
        
    }
    public TreeNode createbst(List<Integer> list,int start,int end){
        if(start>end) return null;
        int mid=(start+end)/2;
        TreeNode root=new TreeNode(list.get(mid));
        root.left= createbst(list,start,mid-1);
        root.right=createbst(list,mid+1,end);
        return root;
       
    }

}