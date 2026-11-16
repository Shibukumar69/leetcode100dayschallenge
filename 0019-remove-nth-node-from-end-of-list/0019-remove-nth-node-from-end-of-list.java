class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode prev=head;
       ListNode curr=head;
       ListNode forw=head;
       ListNode temp=head;
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
       forw=prev.next.next;
       prev.next=forw;
       return head;

    }

}