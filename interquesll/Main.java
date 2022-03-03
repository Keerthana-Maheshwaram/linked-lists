
public class Main {
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

        Removedupli rd=new Removedupli();
        rd.deldups(ll);
        ll.traversal();
    }
   


}
