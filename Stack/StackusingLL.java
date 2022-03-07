import java.util.*;

class Stack{

    public class Node{
        Object data;
        Node next;
    }

    Node top;

    public Stack(){
        this.top=null;
    }

    public boolean isEmpty(){
        if(top==null){
            return true;
        }
        return false;
    }

    public void push(int value){
        Node temp=new Node();
        
          
            temp.data=value;
            temp.next=top;
            top=temp;
         
         
        }

        public void display(){
            if(isEmpty()){
                System.out.println("stack is empty");
                
            }
            else{
                Node temp=top;
                //temp=top;
                while(temp!=null){
                    System.out.print(temp.data + "->");
                    temp=temp.next;
                }
                System.out.println(" ");
            }
        }

     public void pop(){
         if(isEmpty()){
             System.out.println("Stack is empty");
         }
            top=top.next;
        }

        public Object peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            
            return top.data; 
        }

        public void deleteall(){
            top=null;
            System.out.println("stack is deleted");
        }


}


public class StackusingLL {
   public static void main(String[] args) {
    Stack s=new Stack();
    s.push(5);
    s.push(6);
    s.push(9);
    s.display();
    Object result2=s.peek();
    System.out.println("The first element in stack is: "+result2);
    s.pop();
    s.display();
    Object result1=s.peek();
    System.out.println("The first element in stack is: "+result1);
    boolean result= s.isEmpty();
    System.out.println(result);

   }

    
}