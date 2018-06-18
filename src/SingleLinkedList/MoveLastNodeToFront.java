package SingleLinkedList;

public class MoveLastNodeToFront {
    static Node head;

    void add(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void move(){
        Node current = head;
        Node prev = null;
        while (current.next!=null){
            prev = current;
            current = current.next;
        }
        prev.next = null;
        current.next = head;
        head = current;
    }

    public static void main(String args[]) {

        MoveLastNodeToFront list = new MoveLastNodeToFront();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.printList();
        list.move();
        list.printList();
    }
}