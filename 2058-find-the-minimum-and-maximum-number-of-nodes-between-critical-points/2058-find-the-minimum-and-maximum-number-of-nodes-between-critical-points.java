class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null) {
            return new int[]{-1, -1};
        }

        List<Integer> criticalpoint = new ArrayList<>();

        ListNode prev = head;
        ListNode curr = head.next;
        int i = 1;

        while (curr!=null && curr.next != null) {

            // local maximum
            if (curr.val > prev.val && curr.val > curr.next.val) {
                criticalpoint.add(i);
            }

            // local minimum
            if (curr.val < prev.val && curr.val < curr.next.val) {
                criticalpoint.add(i);
            }

            prev = curr;
            curr = curr.next;
            i++;
        }

        if (criticalpoint.size() < 2) {
            return new int[]{-1, -1};
        }

        int min_dis = Integer.MAX_VALUE;

        for (int j = 1; j < criticalpoint.size(); j++) {
            min_dis = Math.min(
                min_dis,
                criticalpoint.get(j) - criticalpoint.get(j - 1)
            );
        }

        int max_dis = criticalpoint.get(criticalpoint.size() - 1)
                     - criticalpoint.get(0);

        return new int[]{min_dis, max_dis};
    }
}