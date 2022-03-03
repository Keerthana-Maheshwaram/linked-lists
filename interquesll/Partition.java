class Node {
    public int data;
    public Node next;
    public Node prev;
}

class LinkedList {
    public Node head;
    public Node tail;
    int size;

    public Node create(int nodevalue){
        Node node=new Node();
        node.data=nodevalue;
        node.next=null;
        head=node;
        tail=node;
        size=1;
        return head;
    }

    public void insert(int nodevalue){
        Node node=new Node();
        node.data=nodevalue;
        node.next=null;
        tail.next=node;
        tail=node;
        size++;
    }


    public void traversal(){
        Node temp=head;
        for(int i=0;i<size;i++){
            System.out.println(temp.data);
            temp=temp.next;
        }
        
        
    }


    
}


class part{
    public void parti(LinkedList ll, int nodevalue){
        Node curr=ll.head;
        ll.tail=ll.head;
        while(curr!=null){
            Node next=curr.next;
            if(curr.data<nodevalue){
                
            }
        }
    }
}




public class Partition {
    public static void main(String[] args) {
        
    }
}
