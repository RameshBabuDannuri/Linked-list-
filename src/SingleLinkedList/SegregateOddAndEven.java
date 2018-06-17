package SingleLinkedList;

public class SegregateOddAndEven {
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    static Node head;
    void segregate(){
        Node end = head;
        Node prev = null;
        Node current = head;
        while(end.next!=null)
        {
            end= end.next;
        }
        Node new_end = end;

        while (current.data%2 == 0 && current != end){
            new_end.next = current;
            current = current.next;
            new_end.next.next = null;
            new_end = new_end.next;
        }
        if (current.data %2 ==0)
        {
            head = current;

            // now curr points to first even node
            while (current != end)
            {
                if (current.data % 2 == 0)
                {
                    prev = current;
                    current = current.next;
                }
                else
                {
                    prev.next = current.next;

                    current.next = null;
 
                    new_end.next = current;
 
                    new_end = current;

                    current = prev.next;
                }
            }
        }
 
        else prev = current;

        if (new_end != end && end.data %2 != 0)
        {
            prev.next = end.next;
            end.next = null;
            new_end.next = end;
        }

    }
    void push(int new_data)
    {
        Node new_node = new Node(new_data);

        new_node.next = head;

        head = new_node;
    }

    void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String args[])
    {
        SegregateOddAndEven llist = new SegregateOddAndEven();
        llist.push(1);
        llist.push(2);
        llist.push(8);
        llist.push(6);
        llist.push(3);
        llist.push(2);
        llist.push(12);
        System.out.println("Origional Linked List");
        llist.printList();

        llist.segregate();

        System.out.println("Modified Linked List");
        llist.printList();
    }

}
