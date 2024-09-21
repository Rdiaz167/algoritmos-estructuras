package _01_remove_dups;

import java.util.HashSet;

import _00_linkedlist.Node;

public class RemoveDups {

    public void removeDups(Node head) {
        HashSet<Integer> valuesFound = new HashSet<>();
        valuesFound.add(head.value);

        Node current = head;
        while(current != null && current.next != null) {
            if(!valuesFound.add(current.next.value)) {
                current.next = current.next.next;
            }
            current = current.next;
        }
    }    
}
