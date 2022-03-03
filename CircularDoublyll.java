class Node{
    Object data;
    Node next;
    Node prev;
}

class CirDoull{
    Node head;
    Node tail;
    int size;

    public Node create(Object nodevalue) {
        Node node=new Node();
        node.data=nodevalue;
        node.next=node;
        node.prev=node;
        this.head=node;
        this.tail=node;
        size=1;
        return head;

    }

    public void Insert(Object nodevalue,int location){
        Node node=new Node();
        node.data=nodevalue;
        if(this.head==null){
    create(nodevalue);
    return;
        }else if(location==0){
            node.prev=tail;
            node.next=head;
            head.prev=node;
            head=node;
            tail.next=node;
        }else if(location>=size){
            tail.next=node;
            node.prev=tail;
            node.next=head;
            head.prev=node;
            tail=node;
        }else{
            Node temp=head;
            for(int i=0;i<location-1;i++){
                temp=temp.next;
            }
            node.prev=temp;
            node.next=temp.next;
            temp.next=node;
            node.next.prev=node;
        }
        size++;
    }

    public void traverse(){
        if(this.head==null){
            System.out.println("ll is empty");
        }
    Node temp=head;
    for(int i=0;i<size;i++){
        System.out.println("element "+i+" is: "+ temp.data);
        temp=temp.next;
    }
    System.out.println();
    }

    public void reversetraversal(){
        if(this.head==null){
            System.out.println("ll is empty");
        }
        Node temp=tail;
        for(int i=0;i<size;i++){
            System.out.println("element "+i+" is: "+ temp.data);
            temp=temp.prev;
        }
        System.out.println();

    }

    public void search(Object value){
        if(this.head==null){
            System.out.println("ll is empty");
        }
        Node temp=head;
        for(int i=0;i<size;i++){
            if(temp.data==value){
                System.out.println("element "+temp.data+" is found at index "+ i);
            }
            temp=temp.next;
        }
        System.out.println();
    }

    public void delete(int location){
        if(this.head==null){
            System.out.println("ll is empty");
        }else if(location==0){
            if(size==0){
                head.prev=null;
                head.next=null;
                head=null;
                tail=null;
            }
            else{
                head=head.next;
                head.prev=tail;
                tail.next=head;
            }

        }else if(location>=size){
            if(size==0){
                head.prev=null;
                head.next=null;
                head=null;
                tail=null;
            }
            else{
                tail=tail.prev;
                tail.next=head;
                head.prev=tail;
            }
        }else{
            Node temp=head;
            for(int i=0;i<location-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.prev=temp;
        }
        
    }





}


public class CircularDoublyll {
    public static void main(String[] args) {
        CirDoull cdll=new CirDoull();
        cdll.create(5);
        System.out.println(cdll.head.data);
        cdll.Insert(6, 1);
        System.out.println(cdll.head.next.data);
        cdll.Insert(6, 2);
        cdll.Insert(7, 3);
        cdll.Insert(8, 4);
        cdll.Insert(9, 5);
        cdll.Insert(1, 6);
        cdll.Insert(2, 7);
        cdll.Insert(3, 8);
        cdll.traverse();
        System.out.println();
        System.out.println("reverse traversal: ");
        cdll.reversetraversal();
        cdll.search(3);


    }
}
