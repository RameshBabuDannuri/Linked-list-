package SingleLinkedList;

public class DetectLoop {
    static Node head;

    static class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }


    static public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    boolean detectLoop(Node head){
        Node slow = head;
        Node fast = head;

        while (slow!=null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args)
    {
        DetectLoop llist = new DetectLoop();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);


        llist.head.next.next.next.next = llist.head;

        if (llist.detectLoop(head))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");

    }
}
