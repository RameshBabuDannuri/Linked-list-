package SingleLinkedList;

public class PairWiseSwap {
    static Node head;

    void add(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    void swap(Node head) {
        Node current = head;
        while (current != null && current.next != null) {
            int temp = current.data;
            current.data = current.next.data;
            current.next.data = temp;
            current = current.next.next;
        }
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        PairWiseSwap list = new PairWiseSwap();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println("before swap");
        list.printList();
        list.swap(head);
        System.out.println("After swap");
        list.printList();

    }
}
