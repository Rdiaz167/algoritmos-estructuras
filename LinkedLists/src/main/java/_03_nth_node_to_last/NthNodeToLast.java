package _03_nth_node_to_last;

import _00_linkedlist.Node;

/*
 * Dada una lista enlazada simple y un valor N, devuelve el nodo N empezando por el final
 *
 * Ejemplo:
 *  Input: 1->2->4->6, 2
 *  Output: 4
 */

public class NthNodeToLast {
    
    public Node nthNodeToLast(Node head, int n) {
        Node p1 = head;
        Node p2 = head;

        // Avanzamos n posiciones con el primer puntero
        for(int i = 0; i < n; i++) {
            if(p1 == null) {
                return null;
            }
            p1 = p1.next;
        }
        // Avanzamos ambos al mismo ritmo hasta que el puntero avanzado llegue al final
        while(p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}
