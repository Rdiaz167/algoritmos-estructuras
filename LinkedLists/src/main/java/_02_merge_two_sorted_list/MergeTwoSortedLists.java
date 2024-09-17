package _02_merge_two_sorted_list;

public class MergeTwoSortedLists {

    public Node mergeTwoLists(Node list1, Node list2) {
        Node aux = new Node(-1);
        Node current = aux;
    
        while(list1 != null && list2 != null) {
          if(list1.value <= list2.value) {
            current.next = list1;
            list1 = list1.next;
          } else {
            current.next = list2;
            list2 = list2.next;
          }
          current = current.next;
        }
        if(list1 == null) {
          appendToList(current, list2);
        } else {
          appendToList(current, list1);
        }
        return aux.next;
      }
    
      private void appendToList(Node current, Node listToAppend) {
        while(listToAppend != null) {
          current.next = listToAppend;
          listToAppend = listToAppend.next;
          current = current.next;
        }
      }

}
