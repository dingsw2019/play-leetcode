public class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public void deleteNode(ListNode node) {

        ListNode delNode = node.next;
        node.val = delNode.val;
        node.next = delNode.next;
        delNode.next = null;
    }
}
