package SingleLinkedList.date20_06_2018;

public class AlternativeSplit {
    static Node head;
    Node a;
    Node b;
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
    void split(Node node){
        if (node == null || node.next == null){
            return;
        }
         a = head;
         b = head.next;
        Node slow = a;
        Node fast = b;
        while (slow!=null && fast!=null) {
            slow.next = fast.next;
            slow = slow.next;
            if (slow != null) {
                fast.next = slow.next;
                fast = fast.next;
            }
        }
    }
    public static void main(String args[]){
        AlternativeSplit list = new AlternativeSplit();
       // list.push(9);
        list.push(8);
        list.push(7);
        list.print(head);
        list.split(head);
        list.print(list.a);
        list.print(list.b);

        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        list.print(head);
        list.split(head);
        list.print(list.a);
        list.print(list.b);



    }
}
