import java.util.*;

class Node{
    public int value;
    public Node next;
}

class Singlyll{
    public Node head;
    public Node tail;
    public int size;

    public Node createsinglyll(int nodevalue){
        Node node=new Node();
        node.next=null;
        node.value=nodevalue;
        head=node;
        tail=node;
        size=1;
        return head;
    }

    public void insertSinglyll(int nodeValue,int Location){
        Node node=new Node();
        node.value=nodeValue;
        if(head==null){
            createsinglyll(nodeValue);
            return;
        }else if(Location==0){
            node.next=head;
            head=node;
        }else if(Location>=size){
            node.next=null;
            tail.next=node;
            tail=node;
        }else{
            Node tempNode=head;
            int index=0;
            while(index<Location-1){
                tempNode=tempNode.next;
                index++;
            }
            Node nextNode=tempNode.next;
            tempNode.next=node;
            node.next=nextNode;
        }
        size++;
    }

    public void Traversell(){
        if(head==null){
            System.out.println("Linked List does not exist");
        }else{
            Node tempNode=head;
            for(int i=0;i<size;i++){
                System.out.println("element "+i+" is"+tempNode.value);
                tempNode=tempNode.next;
            }

        }
        



    }
    

}

public class SinglyLinkedList{
    public static void main(String[] args) {
        System.out.println();
        
    }
}
