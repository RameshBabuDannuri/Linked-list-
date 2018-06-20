package SingleLinkedList.date20_06_2018;

public class DeleleteNodeWhichHaveNextGreaterValue {
    Node head;

    class Node
    {
        int data;
        Node next;
        Node(int d)  { data = d; next = null; }
    }
    void push(int new_data)
    {
        Node new_node = new Node(new_data);

        new_node.next = head;

        head = new_node;
    }

    void reverseList()
    {
        Node current = head;
        Node prev = null;
        Node next;
        while (current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    void delete(){
        Node current = head;
        Node temp ;
        Node maxNode = head;
        while (current!=null && current.next!=null){
            if (current.next.data<maxNode.data){
                temp = current.next;
                current.next = temp.next;
                temp = null;
            }
            else {
                current = current.next;
                maxNode = current;
            }
        }
    }

    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        DeleleteNodeWhichHaveNextGreaterValue llist =
                new DeleleteNodeWhichHaveNextGreaterValue();

        llist.push(3);
        llist.push(2);
        llist.push(6);
        llist.push(5);
        llist.push(11);
        llist.push(10);
        llist.push(15);
        llist.push(12);

        System.out.println("Given Linked List");
        llist.printList();

        llist.reverseList();
        llist.delete();
        llist.reverseList();

        System.out.println("Modified Linked List");
        llist.printList();
    }
}
