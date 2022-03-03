class DoublyNode {
    public Object data;
    public DoublyNode next;
    public DoublyNode prev;
}

class DoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    public void create(Object nodevalue) {
        DoublyNode node = new DoublyNode();
        node.data = nodevalue;
        node.next = null;
        node.prev = null;
        head = node;
        this.tail = node;
        size = 1;
        System.out.println(this.head.data);
        // System.out.println( );

    }

    public void Insert(Object nodevalue, int location) {
        DoublyNode node = new DoublyNode();
        node.data = nodevalue;
        if (head == null) {
            create(nodevalue);
            return;
        } else if (location == 0) {
            node.prev = null;
            node.next = head;
            head.prev = node;
            head = node;
            // System.out.println(head.data);

        } else if (location >= size) {
            node.next = null;
            node.prev = tail;
            tail.next = node;
            tail = node;

        } else {
            DoublyNode temp = this.head;
            for (int i = 0; i < location - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            node.prev = temp;
            node.next.prev = node;
            temp.next = node;

        }
        size++;
        // System.out.println( );
    }

    public void traverse() {
        if (head == null) {
            System.out.println("linked list doesnt exist");
        }

        DoublyNode temp = head;
        while (temp != null) {
            System.out.println("element: " + temp.data);
            temp = temp.next;
        }
        System.out.println();

    }

    public void reversetraversal() {
        if (head != null) {
            DoublyNode temp = tail;
            while (temp != null) {
                System.out.println("reverse elements: " + temp.data);
                temp = temp.prev;
            }
        }
        System.out.println();
    }

    public void search(Object value) {
        if (head == null) {
            System.out.println("linked list doesnt exist");
            return;
        }
        DoublyNode temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.data == value) {
                System.out.println("element is found at index " + i);

            }
            temp = temp.next;
        }
        System.out.println();

    }

    public void delete(int index) {
        if (head == null) {
            System.out.println("linked list is empty");
            return;
        } else if (index == 0) {
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;

            } else {
                head = head.next;
                head.prev = null;
                size--;
            }

        } else if (index >= size) {
            DoublyNode temp = tail.prev;
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;

            } else {
                temp.next = null;
                tail = temp;
                size--;
            }
        } else {
            DoublyNode temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
            size--;
        }
        System.out.println("element is deleted");

        System.out.println();

    }

}

public class DoublyLinList {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.create(5);
        dll.Insert(6, 1);
        dll.Insert(7, 2);
        dll.Insert(8, 3);
        dll.Insert(1, 4);
        dll.Insert(2, 5);
        dll.Insert(3, 6);
        dll.Insert(4, 7);
        System.out.println(dll.head.next.data);
        // System.out.println(dll.head.data);
        dll.traverse();
        dll.reversetraversal();
        dll.search(7);
        System.out.println("size of the linked list is: " + dll.size);
        dll.delete(7);
        dll.traverse();
    }

}
