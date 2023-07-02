

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

public class RotateaLinkedList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0 || head.next == null) {
            return head;
        }

        int length = 1;
        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
            ++length;
        }

        temp.next = head;
        k = k % length; // when k is more than length of list
        int end = length - k; // to get end of the list
        while (end-- != 0)
            temp = temp.next;
        // breaking last node link and pointing to NULL
        head = temp.next;
        temp.next = null;

        return head;

    }
}
