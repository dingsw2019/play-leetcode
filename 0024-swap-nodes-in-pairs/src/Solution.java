public class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode swapPairs(ListNode head) {

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode prevNode = dummyHead;
        while (head != null && head.next != null) {

            ListNode firstNode = head;
            ListNode secondNode = head.next;

            // swap
            prevNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            prevNode = firstNode;
            head = firstNode.next;
        }

        return dummyHead.next;
    }
}
