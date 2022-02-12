class DoublyNode{
    public Object data;
    public DoublyNode next;
    public DoublyNode prev;
}

class DoublyLinkedList{
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    public void create(Object nodevalue){
        DoublyNode node=new DoublyNode();
        node.data=nodevalue;
        node.next=null;
        node.prev=null;
        head=node;
        this.tail=node;
        size=1;
        System.out.println(this.head.data);


    }

    public void Insert(Object nodevalue,int location){
        DoublyNode node=new DoublyNode();
        node.data=nodevalue;
        if(head==null){
            create(nodevalue);
            return;
        }
        else if(location==0){
            node.prev=null;
            node.next=head;
            head.prev=node;
            head=node;
            //System.out.println(head.data);

        }else if(location>=size){
            node.next=null;
            node.prev=tail;
            tail.next=node;
            tail=node;

        }else{
            DoublyNode temp=this.head;
            for(int i=0;i<location-1;i++){
                temp=temp.next;
            }
            node.next=temp.next;
            node.prev=temp;
            node.next.prev=node;
            temp.next=node;


        }
        size++;
    }

    public void traverse(){
        if(head==null){
            System.out.println("linked list doesnt exist");
        }

        DoublyNode temp=head;
        for( temp=head;temp.next !=head;temp=temp.next ){
            System.out.println("element: " + temp.data);
        }
        System.out.println("element: " + temp.data);

    }


}

public class DoublyLinList {
    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.create(5);
        dll.Insert(6, 1);
        System.out.println(dll.head.next.data);
        //System.out.println(dll.head.data);
        dll.traverse();
        
    }
    
}
