class Solution {

    ArrayList<Integer> arr = new ArrayList<>();

    public Solution(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }
    }
    public int getRandom() {
        Random rand = new Random();
        int n = arr.size();
        int index = rand.nextInt(n);
         return arr.get(index);
    }
}