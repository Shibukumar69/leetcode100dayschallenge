class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode write=head;
        ListNode read=head.next;
        while(read!=null){
            int sum=0;
            while( read.val != 0){
                sum=sum+read.val;
                read=read.next;
            }
            write.val=sum;
            read = read.next;
            write.next = read;
            write = write.next;
        }
         return head;
        
    }
}