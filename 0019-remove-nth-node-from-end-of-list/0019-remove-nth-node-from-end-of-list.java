class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        ListNode prev=head;
        ListNode forward=head;
        int size=1;
        while(temp.next!=null){
         temp=temp.next;
         size++;
        } 
         if(n==size){
            head=head.next;
            return head;
         }
         for(int i=1;i<size-n;i++){
             prev=prev.next;
         }
          forward=prev.next.next;
          prev.next=forward;
     return head;

    }

}