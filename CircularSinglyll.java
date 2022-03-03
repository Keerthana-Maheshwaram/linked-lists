class Node{
    public Object data;
    public Node next;
}

class CirSingll{
    public Node head;
    public Node tail;
    public int size;

    public Node createsingll(Object Nodevalue){
        Node node=new Node();
        node.data=Nodevalue;
        node.next=node;
        this.head=node;
        this.tail=node;
        size=1;
        return head;

    }

    public void Insert(Object Nodevalue,int location){
        Node node=new Node();
        node.data=Nodevalue;
        if(head==null){
            createsingll(Nodevalue);
            return;
        }else if(location==0){
            node.next=this.head;
            this.head=node;
            this.tail=this.head;
        }else if(location>=size){
            tail.next=node;
            this.tail=node;
            node.next=this.head;
        }else{
            Node temp=head;
            for(int i=0;i<location-1;i++){
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next=node;
        }
        size++;

    }

    public void Traverse(){
        if(head==null){
            System.out.println("linked list doesnt exist");

        }
        Node temp=head;
        // for(int i=0;i<size;i++){
        //     System.out.println("element: " + i+ " "+ temp.data + " " );
        //     temp=temp.next;
        // }
        while(temp.next!=this.head){
            System.out.println("element: " + temp.data + " ");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

    public void search(Object value){
        if(head==null){
            System.out.println("linked list doesnt exist");

        }
        Node temp=head;
        while(temp.next!=this.head){
            if(temp.data==value){
                System.out.println("element: " + temp.data + " is found");
            }
           
            temp=temp.next;
        }
        if(temp.data==value){
            System.out.println("element: " + temp.data + " is found");
        }
        
    }

    public void delete(Object value){
        if(head==null){
            System.out.println("linked list doesnt exist");

        }

        Node temp=head;
        while(temp.next!=this.head){
            if(temp.next.data==value){
                temp.next=temp.next.next;
                System.out.println("element: " + temp.data + " is deleted");
                break;
            }
           
            temp=temp.next;
        }
        if(temp.data==value){
            temp.next=temp.next.next;
                System.out.println("element: " + temp.data + " is deleted");
            
        }
        size--;

    }
}

public class CircularSinglyll{

    public static void main(String[] args) {
        CirSingll csll=new CirSingll();
   csll.createsingll(7); 
   csll.Insert("ana", 1);
   csll.Insert("xyz", 2);
   csll.Insert("apoi", 3);
   csll.Insert("anaddfdf", 4);
   csll.Insert("anasddd", 5);
   csll.Traverse();
   csll.search("ana");
   csll.delete("xyz");
   csll.Traverse();

   System.out.println(csll.head.data);
    }
    
}