class Stack{
    int[] arr;
    int topOfStack;

    public Stack(int size){
        this.arr=new int[size];
        this.topOfStack=-1;
        System.out.println("The stack is created with a size of: "+ size);
    }

    public boolean isEmpty(){
        if(topOfStack==-1){
            System.out.println("Stack is Empty");
            return true;
        }else{
            //System.err.println("Stack is not empty");
            return false;
        }
    }

    public boolean isFull(){
        if(topOfStack==arr.length-1){
           // System.out.println("The Stack is full");
            return true;
        }else{
            //System.out.println("Stack is not full");
            return false;
        }
    }

    public void Push(int value){
        if(isFull()){
            System.out.println("The stack is full");
            return;
        }else{
            arr[topOfStack+1]=value;
            topOfStack++;
            System.out.println(value+" is successfully inserted!");
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }else{
            int topStack=arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    public int peep(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }else{
            return arr[topOfStack];
        }
    }

    public void delete(){
        arr=null;
        System.out.println("stack deleted");
    }
}

public class StackusingArray {
    public static void main(String[] args) {
        Stack s=new Stack(5);
        boolean result=s.isEmpty();
        System.out.println(result);
        boolean res=s.isFull();
        System.out.println(res);
        s.Push(5);
        s.Push(6);
        s.Push(7);
        s.Push(8);
        s.Push(9);
        // s.Push(1);
        // s.Push(2);
        // s.Push(3);
        // s.Push(4);
        int poping=s.pop();
        System.out.println("The element which is poped/deleted is :  "+poping);
        int peep1=s.peep();
        System.out.println("Element at the top of the stack is: " +peep1);
        
        //if we call pop methos again it will delete the last element ,which is 3
        int poping1=s.pop();
        System.out.println("The element which is poped/deleted is: " + poping1);
        int peep2=s.peep();
        System.out.println("Element at the top of the stack is: "+ peep2);

        s.delete();
        boolean result1=s.isEmpty();
        System.out.println(result1);
}
}