package SingleLinkedList.date20_06_2018;

public class DeleteAlternativeNodes {
    static Node head;
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    void print(Node temp){
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void deleteAlternate(Node node){
        Node current = node;
        Node now = current.next;
        while (current!=null && current.next!=null){
            current.next = now.next;
            now = null;
            current = current.next;
            if (current!=null){
                now = current.next;
            }
        }
    }
    public static void main(String args[]){
        DeleteAlternativeNodes list = new DeleteAlternativeNodes();
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        list.push(0);
        list.print(head);
        list.deleteAlternate(head);
        list.print(head);




    }
}
