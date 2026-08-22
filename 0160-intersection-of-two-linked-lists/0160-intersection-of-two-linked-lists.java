public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
       ListNode A=headA; 
       ListNode B=headB; 
       while(A!=null && B!=null){
        A=A.next;
        B=B.next;
       }
      // agar koye listnode pahle he null of jaye
       if(A==null){
        int bextra=0;
        while(B!=null){
            bextra++;
            B=B.next;
        }
          while(bextra-->0){
            headB=headB.next;
          }

       } else{
       int aextra=0;
        while(A!=null){
            aextra++;
            A=A.next;
        }
         while(aextra-->0){
            headA=headA.next;
         }

       }
        while(headA!=null && headB!=null){
              if(headA==headB){
                return headA;
              }else{
                 headA=headA.next;
                 headB=headB.next;
              }
        }
        return null;
    }
}