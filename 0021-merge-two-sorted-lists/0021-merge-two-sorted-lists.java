class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3=new ListNode(-1);
        ListNode anshead=list3;
        ListNode anstail=list3;
        while(list1 != null && list2!=null){
            if(list1.val<list2.val){
                anstail.next=list1;
                list1=list1.next;
                anstail=anstail.next;
            } else{
                  anstail.next=list2;
                  list2=list2.next;
                  anstail=anstail.next;
            }
        }
            // agar list1 pahle null ho jaye tab
            if(list1==null){
                anstail.next=list2;
            }
            // yadi list2 khaili hua toh
            if(list2==null){
               anstail.next=list1;
            }
             anshead=anshead.next;
             return anshead;

        
    }
}