package DoubbleLinkedList;

public class ReverseDLL {
   static Node head;
    void reverse(){
        Node temp = null;
        Node current = head;
        while (current != null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp!=null){
            head = temp.prev;
        }

    }
    void insert(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
        }
        else{
            node.next = head;
            head.prev = node;
            head = node;
        }
    }
    void print(){
        if (head == null){
            return;
        }
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String args[]){
        ReverseDLL list = new ReverseDLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.print();
        System.out.println();
        list.reverse();
        list.print();
    }
}
