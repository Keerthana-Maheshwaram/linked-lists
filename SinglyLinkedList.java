import java.util.*;

class Node {
    public int value;
    public Node next;
}

class Singlyll {
    public Node head;
    public Node tail;
    public int size;

    public Node createsinglyll(int nodevalue) {
        Node node = new Node();
        node.next = null;
        node.value = nodevalue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertSinglyll(int nodeValue, int Location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createsinglyll(nodeValue);
            return;
        } else if (Location == 0) {
            node.next = head;
            head = node;
        } else if (Location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < Location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
        //System.out.println("the size of the ll is:" + size);
    }

    public void Traversell() {
        if (head == null) {
            System.out.println("Linked List does not exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.println("Element " + i + "is " + tempNode.value);
                tempNode = tempNode.next;
            }
        }
        System.out.println();
    }

    public int searchValue(int search) {
        if (this.head.value == search) {
            return 0;
        }
        Node temp = this.head;
        for (int i = 1; i < this.size; i++) {
            temp = temp.next;
            if (temp.value == search) {
                return i;
            }
        }
        return -1;
    }

    public void DeleteNode(int indexToDel){
        if(indexToDel<0 || indexToDel>=this.size){
            System.out.println("Invalid index");
        }
       
     Node temp=head;
     for(int i=0;i<indexToDel-1;i++){
        temp=temp.next;
     }
     temp.next=temp.next.next;
     this.size--;

    }

    public void DeleteEntiresll(){
        this.head=null;
        this.tail=null;
        System.out.println("Successfully deleted linked list");

    }

}

public class SinglyLinkedList {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter value of first node: ");
        int num = scn.nextInt();
        Singlyll sll = new Singlyll();

        System.out.println("Value of first node: " + sll.createsinglyll(num).value);

        System.out.println("Enter the number of nodes you want to add: ");
        int sizell = scn.nextInt();

        for (int i = 0; i < sizell; i++) {
            System.out.println("enter value at location: " + (i + 1));
            int valuell = scn.nextInt();
            sll.insertSinglyll(valuell, i + 1);
        }

        sll.Traversell();

        System.out.println(sll.searchValue(2));

        sll.DeleteNode(2);
        System.out.println("elements after deletion");
        sll.Traversell();

        sll.DeleteEntiresll();
        sll.Traversell();
        

    }
}
