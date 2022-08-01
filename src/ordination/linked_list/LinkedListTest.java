package ordination.linked_list;

import java.util.Random;

public class LinkedListTest {

    public static void main(String[] args) {
        var linkedList = new LinkedList();

        linkedList.add( new Random().nextInt(25));
        linkedList.add( new Random().nextInt(15));
        linkedList.add( new Random().nextInt(15));
        linkedList.add( new Random().nextInt(15));
        linkedList.add( new Random().nextInt(15));
        linkedList.add( new Random().nextInt(15));
        linkedList.add( new Random().nextInt(15));
        linkedList.add( new Random().nextInt(15));
        linkedList.add( new Random().nextInt(15));
        linkedList.add( new Random().nextInt(15));

        System.out.println(linkedList.size);

        Node pointer = linkedList.head;

        while (pointer != null) {
            System.out.print(pointer.element + " ");
            pointer = pointer.next;
        }

        System.out.println();

    }
}
