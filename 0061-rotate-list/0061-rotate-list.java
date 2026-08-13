class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode tail=head;
        int len=1;
        while(tail.next!=null){
            tail=tail.next;
            len++;
        } 
         k=k%len;
         tail.next=head;
         
         ListNode newtail=head;
          for(int i=1;i<len-k;i++){
             newtail=newtail.next;
          }
           ListNode  newhead=newtail.next;
           newtail.next=null;
       return newhead;  
    }
}