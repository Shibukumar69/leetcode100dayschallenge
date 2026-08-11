class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode slowprev=null;
        while(fast!=null && fast.next!=null){
            slowprev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
         slowprev.next=slow.next;
          return head;
    }
}