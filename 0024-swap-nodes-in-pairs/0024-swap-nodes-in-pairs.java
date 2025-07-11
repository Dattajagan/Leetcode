class Solution {
    public ListNode swapPairs(ListNode head) {
      if(head==null || head.next==null) return head;
      ListNode newHead=head.next;
      ListNode front=newHead.next;
      newHead.next=head;  
      head.next=swapPairs(front);
      return newHead;
    }
}