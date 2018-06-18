package SingleLinkedList;

public class PrintReverseInRecursion {
    Node head;
    void print(Node head){
        if (head == null){
            return;
        }
        print(head.next);

        System.out.print(head.data+" ");
    }
    void add(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }
    public static void main(String args[])
    {
        // Let us create linked list 1->2->3->4
        PrintReverseInRecursion llist = new PrintReverseInRecursion();
        llist.add(4);
        llist.add(3);
        llist.add(2);
        llist.add(1);

        llist.print(llist.head);
    }
}
