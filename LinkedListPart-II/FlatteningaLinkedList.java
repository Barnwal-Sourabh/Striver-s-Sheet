import java.util.*;

class Node {
    int data;
    Node next;
    Node bottom;

    Node(int d) {
        data = d;
        next = null;
        bottom = null;
    }
}

class FlatteningaLinkedList {
    Node flatten(Node root) {
        List<Integer> list = new ArrayList<>();
        Node curr = root;
        Node currBottom = null;
        while (curr != null) {
            currBottom = curr;
            while (currBottom != null) {
                list.add(currBottom.data);
                currBottom = currBottom.bottom;
            }
            curr = curr.next;
        }

        Node ans = new Node(0);
        Collections.sort(list);
        root = ans;
        // System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            // root.data = list.get(i);
            ans.bottom = new Node(list.get(i));
            ans = ans.bottom;
        }

        return root.bottom;
    }
}