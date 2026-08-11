public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode pre=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
          }
           if(slow!=fast){
            return null;
           } 
            while(pre!=slow){
                pre=pre.next;
                slow=slow.next;
            }
            return pre;
          

    }
}