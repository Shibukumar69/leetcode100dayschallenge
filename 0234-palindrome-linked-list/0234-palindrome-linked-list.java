class Solution {
    ArrayList<Integer> arr=new ArrayList<>();
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
       int j=arr.size()-1;
       int i=0;
       boolean ans=true;
       while(i<j) {
        if(arr.get(i)!=arr.get(j)){
            return false;
        } 
         i++;
         j--;
       }
        return true;
    }

}