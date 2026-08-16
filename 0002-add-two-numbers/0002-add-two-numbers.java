class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3= new ListNode(-1);
        ListNode head=l3;
        int carry=0;
        while(l1 !=null || l2 !=null || carry!=0){
            int sum=0+carry;
            if(l1!=null){
               sum=sum+l1.val;
               l1=l1.next;
            }
            if(l2!=null){
               sum=sum+l2.val;
               l2=l2.next;
            }
            carry=sum/10;
            sum=sum%10;
           l3.next = new ListNode(sum);;
            l3=l3.next;
        } 
         head=head.next;
         return head;
    }
}