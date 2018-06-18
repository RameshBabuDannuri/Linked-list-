package SingleLinkedList;

public class InterSectionOfLinkedList {
    static Node head1;
    static Node head2;
    static Node head3;
    Node add(Node head, int data){
        Node node = new Node(data);
        if (head == null){
            head = new Node(data);
            return head;
        }
        node.next = head;
        head = node;
        return head;
    }
    void interSection(Node p,Node q){
        while (p!=null && q!=null){
            if (p.data == q.data){
               head3 = add(head3, p.data);
                p = p.next;
                q = q.next;
            }
            else if(p.data<q.data){
                p = p.next;
            }
            else {
                q = q.next;
            }

        }
    }
    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
            InterSectionOfLinkedList list = new InterSectionOfLinkedList();
            head1 =list.add(head1,6);
        head1 =list.add(head1,4);
        head1 =  list.add(head1,3);
        head1 = list.add(head1,2);
        head1 =  list.add(head1,1);

         head2 =  list.add(head2,8);
        head2 = list.add(head2,6);
        head2 =  list.add(head2,4);
        head2 =  list.add(head2,2);

        list.printList(head1);
        list.printList(head2);
        list.interSection(head1,head2);
        list.printList(head3);


    }
}
