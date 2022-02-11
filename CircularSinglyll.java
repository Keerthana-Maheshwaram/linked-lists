import java.util.*;

import javax.xml.stream.Location;

class Node{
    public Object data;
    public Node next;
}

class Circularsll{
    public Node head;
    public Node tail;
    public int size;

    public Node createCsll(Object Nodevalue){
        Node node=new Node();
        node.data=Nodevalue;
        node.next=node;
        this.head=node;
        this.tail=node;
        this.size=1;
        return head;
    }

    public void Insert(Object NodeValue, int location){
        Node node=new Node();

        if(this.head==null){
            this.createCsll(NodeValue);
            return;

        }else if(location==0){
            node.next=this.head;
            this.head=node;
            this.tail.next=this.head;

        }else if(location>=this.size){
            this.tail.next=node;
            this.tail=node;
            this.tail.next=this.head;
        }else{
            Node temp=this.head;
            for(int i=0;i<location-1;i++){
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next=node;

    

        }

        
    }

    public void Traversecll(){
        if(head==null){
            System.err.println("Linked list doesnt exist");
        }
        Node temp=head;
        Node newNode=head;
        while(temp.next!=head){
            System.out.println(temp+" ");
            temp=temp.next;
        }
        System.out.println();

    }

    public void Search(Object value){
        if(head==null){
            System.err.println("Linked list doesnt exist");
        }
        Node temp=head;
        for(int i=0;i<size-1;i++){
            if(temp.value==value){
                
            }
        }
    }


}

public class CircularSinglyll {

    
    public static void main(String[] args) {
        
    }
}
