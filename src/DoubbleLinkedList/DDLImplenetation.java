package DoubbleLinkedList;

public class DDLImplenetation {
    Node head;
   void insertAtBegin(int data){
       Node node = new Node(data);
        if (head ==null){
            head = node;
            return;
        }
        else{
            node.next = head;
            head.prev = node;
            head = node;
            return;
        }
    }
    void insertAtEnd(int data){
       Node node  = new Node(data);
       if (head == null){
           head = node;
           return;
       }
       else {
           Node temp = head;
           while (temp.next!=null){
               temp = temp.next;
           }
           temp.next = node;
           node.prev = temp;
       }
    }
    void insertAtMiddle(int data, int k){
        Node node = new Node(data);
        if (head == null){
            head = node;
            return;
        }
        if (k == 1){
            node.next = head;
            head.prev = node;
            head = node;
            return;
        }
        int count = 1;
        Node p = head;
        Node q = head;
        while(count!=k && q.next!=null){
            ++count;
            p = q;
            q = q.next;
        }
        if (q.next == null){
            q.next  = node;
            node.prev = q;
            return;
        }
            p.next = node;
            node.prev = p;
            node.next = q;
            q.prev = node;
    }
    void print(Node node){
        while (node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }

    }
    int delete(int k){
        Node temp = head;
        Node p = head;
        while (temp.data != k){
            p = temp;
            temp = temp.next;
        }
        if (temp == null){
            System.out.println("delete element is not available");
            return -1;
        }
        p.next.next = temp.next;
        temp = temp.next;
        temp.prev = p;
        return temp.data;

    }

    void deleteNode(Node head_ref, Node del) {

        /* base case */
        if (head == null || del == null) {
            return;
        }

        /* If node to be deleted is head node */
        if (head == del) {
            head = del.next;
        }

        /* Change next only if node to be deleted is NOT the last node */
        if (del.next != null) {
            del.next.prev = del.prev;
        }

        /* Change prev only if node to be deleted is NOT the first node */
        if (del.prev != null) {
            del.prev.next = del.next;
        }

        /* Finally, free the memory occupied by del*/
        return;
    }
    public static void main(String args[]){
        DDLImplenetation dbl = new DDLImplenetation();
        dbl.insertAtEnd(10);
        dbl.insertAtEnd(20);
        dbl.insertAtEnd(30);
        dbl.insertAtEnd(40);
        dbl.insertAtBegin(5);
        dbl.insertAtMiddle(25,1);
        dbl.insertAtMiddle(35,2);
        dbl.print(dbl.head);
        dbl.deleteNode(dbl.head , dbl.head.next.next.next);
        dbl.print(dbl.head);
    }
}
