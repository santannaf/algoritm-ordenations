package ordination.linked_list;

public class LinkedList {

    int size = 0;
    Node head;

    public LinkedList() {}

    public void add(int value) { // O(n)
        if (this.head == null) this.head = new Node(value);
        else {
            Node pointer = this.head;

            while (pointer.next != null) {
                pointer = pointer.next;
            }

            pointer.next = new Node(value);
        }

        size ++;
    }
}
