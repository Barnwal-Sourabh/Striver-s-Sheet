




class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        //Approch 1
        // ListNode curr = head;
        // ListNode prev = null;
        // ListNode fwd = null;

        // while(curr != null){
        // fwd = curr.next;
        // curr.next = prev;
        // prev = curr;
        // curr = fwd;
        // }
        // return prev;

        //Approch 2
        ListNode    temp = head.next;
        ListNode ans = reverseList(head.next);
        temp.next = head;
        head.next = null;
        return ans;
    }
}