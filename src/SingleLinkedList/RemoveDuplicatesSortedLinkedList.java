package SingleLinkedList;

public class RemoveDuplicatesSortedLinkedList {
    static Node head;
    void remove(Node head){
        Node current = head;
        Node temp;
        while (current.next!=null){
            if (current.data == current.next.data){
                temp = current.next.next;
                current.next = null;
                current.next = temp;
            }
            else {
                current = current.next;
            }
        }
    }
    void add(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void print(Node head){
        Node temp = head;
        if (temp == null){
            return;
        }
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String args[]){
        RemoveDuplicatesSortedLinkedList list = new RemoveDuplicatesSortedLinkedList();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.print(head);
        list.remove(head);
        System.out.println();
        list.print(head);

    }
}
