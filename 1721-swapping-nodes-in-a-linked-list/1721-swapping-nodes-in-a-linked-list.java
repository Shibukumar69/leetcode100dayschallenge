class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first=head;
        ListNode second=head;
        ListNode temp=head;
        int n=1;
        if(head==null || head.next==null){
            return head;
        }
        // used for finding length og ll
        while(temp!=null && temp.next!=null){
            n++;
            temp=temp.next;
        }
         for(int i=1;i<=k-1;i++){
           first=first.next;
         }
        for(int j=1;j<=n-k;j++){
            second=second.next;
        }
         int swap=first.val;
         first.val=second.val;
         second.val=swap;
         return head;
    }
}