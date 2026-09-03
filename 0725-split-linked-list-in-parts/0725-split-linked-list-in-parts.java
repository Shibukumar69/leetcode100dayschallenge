
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
       ListNode[] ans = new ListNode[k];
        int index=0;
        ListNode temp=head;
        // length  of linkedlist
        int length=0;
        while(temp!=null){
           length++;
           temp=temp.next;
        }

        int baselength=length/k;
        int extraNode=length%k;
        // main logic
        ListNode curr=head;
        ListNode prev=null;

        for(int part=0;part<k;part++){
           if(curr==null){
            ans[part]=curr;
            continue;
           }
           ans[part]=curr;
           int width=baselength+(extraNode>0?1:0);
           extraNode--;
           for(int i=1;i<=width;i++){
             prev=curr;
             curr=curr.next;
           }
           prev.next=null;

        }
        return ans;

    }
}