class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head.next;
        ListNode forw=head;
        while(forw!=null && forw.next!=null){
            if(temp.val==forw.val){
                forw.next=temp.next;
                temp=temp.next;
            } else{
                forw=temp;
                temp=temp.next;
            }
        }
        return head;
    }
}