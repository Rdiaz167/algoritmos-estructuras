package _05_swap_nodes_in_pairs;

public class SwapNodesInPairs {

    public Node swapNodesInPairs(Node head) {
        if(head == null || head.next == null) return head;

        Node temp = head.next.next;
        head.next.next = head;
        head = head.next;
        head.next.next = swapNodesInPairs(temp);
        return head;
    }
}
