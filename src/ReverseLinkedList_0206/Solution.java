package ReverseLinkedList_0206;

//нужно развернуть все указатели в обратную сторону, по итогу prev - станет началом списка.
//prev каждый раз меняем местами с current, и идём дальше менять ссылки аналогично с помощью current.next
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}

//Definition for singly-linked list.
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
