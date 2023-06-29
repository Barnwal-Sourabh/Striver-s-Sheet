
public class ReverseLinkedListingroupsofSizeK {
    public static int listNodeLength(ListNode head){
        int count = 0;

        while(head != null){
            count++;
            head = head.next;
        }

        return count;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k == 1){
            return head;
        }

        int length = listNodeLength(head);
        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;
        ListNode pre = dummyhead;
        ListNode curr = null, nex = null;

        while(length >= k){
            curr = pre.next;
            nex = curr.next;

            for(int i=1; i<k; i++){
                curr.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = curr.next;
            }
            pre = curr;
            length -= k;
        }

        return dummyhead.next;
    }    
}
