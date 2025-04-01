class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null)
            return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy.next.next;
        ListNode slow = dummy.next;

        while (fast != null) {
            int temp = fast.val;
            fast.val = slow.val;
            slow.val = temp;
            slow = slow.next.next;
            if (slow == null) break;
            fast = fast.next.next;
        }
        return dummy.next;
    }
}