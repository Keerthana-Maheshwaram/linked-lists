import java.util.HashSet;

class Node {
    public int data;
    public Node next;
    public Node prev;
}

class LinkedList {
    public Node head;
    public Node tail;
    int size;

    public void create(int nodevalue){
        Node node=new Node();
        node.data=nodevalue;
        node.next=null;
        head=node;
        tail=node;
        size=1;
        //return head;
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

class Removeduplicates {
    void deldups(LinkedList ll){
        HashSet<Integer> hs=new HashSet<Integer>();
        Node temp=ll.head;
        Node prev=null;
        while(temp!=null){
            int tempval=temp.data;
            if(hs.contains(tempval)){
                prev.next=temp.next;
                ll.size--;
            }else{
                hs.add(tempval);
                prev=temp;
            }
            temp=temp.next;
        }
    }
}



public class Removedupli{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.create(5);
        ll.insert(9);
        ll.insert(10);
        ll.insert(4);
        ll.insert(6);
        ll.insert(5);
        ll.insert(4);
        ll.traversal();

        Removeduplicates rd=new Removeduplicates();
        System.out.println("after removing duplicates");
        rd.deldups(ll);
        ll.traversal();
    }
   


}


