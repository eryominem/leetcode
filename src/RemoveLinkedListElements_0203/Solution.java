package RemoveLinkedListElements_0203;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode result = new ListNode();
        ListNode curr = result;

        while (head != null) {
            if (head.val != val) {
                curr.next = new ListNode(head.val);
                curr = curr.next;
            }
            head = head.next;
        }

        return result.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}