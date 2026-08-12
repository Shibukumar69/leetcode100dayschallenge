class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr=head;
        ListNode back=null;
        ListNode temp=head;
        int size=1;
        if(head==null){
            return null;
        }
        while(temp.next!=null){
             temp=temp.next;
             size++;
        }
         for(int i=1;i<=size;i++){
            if(curr.val==val){
                   if(back==null){
                     head = curr.next;
                    curr = curr.next;
                   }
                    else{

                 back.next=curr.next;
                 curr=curr.next;
                    }
                 
            } else {
             back=curr;
             curr=curr.next;
            }
         } 
          return head;
    }
}