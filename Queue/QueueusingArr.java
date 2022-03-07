class Queue{
    int arr[];
    int topOfQ;
    int BeginningOfQ;

    public Queue(int size){
        this.arr=new int[size];
        this.topOfQ=-1;
        this.BeginningOfQ=-1;
    }

    public boolean isFull(){
        if(topOfQ==arr.length-1){
            System.out.println("queue is full");
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if((BeginningOfQ== -1) || (BeginningOfQ==arr.length)){
            return true;
        }
        return false;
    }

    public void enQ(int value){
        if(isFull()){
            System.out.println("the queue is full");
        }else if(isEmpty()){
            this.BeginningOfQ=0;
            this.topOfQ++;
            arr[topOfQ]=value;
            System.out.println("successfully inserted"+value+"in the queue");
        }else{
            this.topOfQ++;
            arr[topOfQ]=value;
            System.out.println("successfully inserted"+value+"in the queue");

        }
    }

    public int deQueue(){
        if(isEmpty()){
            System.out.println("the queue is empty");
            return -1;
        }else{
            int result=arr[BeginningOfQ];
            this.BeginningOfQ++;
            if(this.BeginningOfQ>this.topOfQ){
                this.BeginningOfQ=this.topOfQ=-1;
            }
            return result;


        }
    }

    public int peek(){
        if(!isEmpty()){
            return arr[BeginningOfQ];
        }else{
            System.out.println("the queue is empty");
            return -1;
        }
    }


    public void deleteq(){
        arr=null;
        System.out.println("queue is sussessfully deleted");
    }
}

public class QueueusingArr {
    public static void main(String[] args) {
        Queue q=new Queue(4);
        q.enQ(5);
        q.enQ(6);
        q.enQ(9);
        q.enQ(10);
        q.enQ(8);
        boolean result= q.isEmpty();
        System.out.println(result);
        q.isFull();
        q.deQueue();
        boolean result1= q.isEmpty();
        System.out.println(result1);
        //System.out.println(result1);
    }
    
}
