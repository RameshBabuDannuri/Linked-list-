package SingleLinkedList;

public class ReversekAlternativeNodes {
    static Node head;

    Node reverse(Node head, int k){
        Node next;
        Node current = head;
        Node prev = null;
        int count = 0;
        while (current!=null && count<k){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if (head!=null){
            head.next = current;
        }
        count = 0;
        while (count<k-1 && current!=null){
            current = current.next;
            count++;
        }
        if (current!=null){
            current.next = reverse(current.next , k);
        }
        return prev;
    }
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    void push(int newdata) {
        Node mynode = new Node(newdata);
        mynode.next = head;
        head = mynode;
    }

    public static void main(String[] args) {
        ReversekAlternativeNodes list = new ReversekAlternativeNodes();


        for (int i = 20; i > 0; i--) {
            list.push(i);
        }
        System.out.println("Given Linked List :");
        list.printList(head);
        head = list.reverse(head, 4);
        System.out.println("");
        System.out.println("Modified Linked List :");
        list.printList(head);

    }
}

