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

    public Node nthToLastElement(LinkedList ll,int n){
        //Node nod=new Node();
        Node curr=head;
        Node follower=head;
        for(int i=0;i<n;i++){
            if(curr==null){
                return null;
            }curr=curr.next;
        }

        while(curr!=null){
            curr=curr.next;
            follower=follower.next;
        }
        return follower;
    }
    
}




public class NthTolast {
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

        Node q=ll.nthToLastElement(ll, 2);
        //nthToLastElement nte=new nthTolastElement();
        System.out.println("Element from last at index 2 is: "+ q.data);

     }
}
