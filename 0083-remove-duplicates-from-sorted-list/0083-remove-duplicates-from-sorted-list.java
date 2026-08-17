class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head.next;
        ListNode curr=head;
        while(curr!=null && curr.next!=null){
            if(temp.val==curr.val){
                curr.next=temp.next;
                temp=temp.next;
            } else{
                curr=temp;
                temp=temp.next;
            }
        }
        return head;
    }
}