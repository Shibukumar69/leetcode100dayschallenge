class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int len=0;
        ListNode temp=head;
        // calculating the length of linkedlist
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        // case 1 if k greater than len og ll
        if(k>len){
            return head;
        }
        // reversing the first grop;
        ListNode prev=null;
        ListNode curr=head;
        for(int i=1;i<=k;i++){
          ListNode forward=curr.next;
          curr.next=prev;
          prev=curr;
          curr=forward;
        }
        ListNode Ans=reverseKGroup(curr,k);
        head.next=Ans;
        return prev;
    }
}