// iteration method
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode prev=null;
//         ListNode curr=head;
//         while(curr!=null){
//         ListNode forward=curr.next;
//           curr.next=prev;
//           prev=curr;
//           curr=forward;
//         }
//         return prev;
        
//     }
// }

// recursive method
class Solution {

   public ListNode solve(ListNode prev,ListNode curr){
    if(curr==null){
        return prev;
    }
     ListNode forward=curr.next;
     curr.next=prev;
     prev=curr;
     curr=forward;
      ListNode ans=solve(prev,curr);
      return ans;
   } 
    

    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
    ListNode ans= solve(prev,curr);
    return ans;
        
    }
}