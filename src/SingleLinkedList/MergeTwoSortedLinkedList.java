package SingleLinkedList;

public class MergeTwoSortedLinkedList {
   static Node head1;
    static Node head2;
   void print(Node temp){
       while (temp!=null){
           System.out.print(temp.data+" ");
           temp = temp.next;
       }
       System.out.println();
   }
    Node merge(Node l1, Node l2){
        Node head = new Node(0);
        Node  p = head;
        while (l1!= null && l2!=null){
                if (l1.data < l2.data){
                    p.next = l1;
                    l1 = l1.next;
                }
                else {
                    p.next = l2;
                    l2 = l2.next;
                }
                p = p.next;
        }
        if (l1==null){
            p.next = l2;
        }
        if (l2==null){
            p.next = l1;
        }
        return head.next;
    }
    public static void main(String args[]){
        MergeTwoSortedLinkedList list = new MergeTwoSortedLinkedList();
        head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(40);
        list.print(head1);

        head2 = new Node(5);
        head2.next = new Node(22);
        head2.next.next = new Node(33);
        head2.next.next.next = new Node(44);
        head2.next.next.next.next= new Node(45);
        head2.next.next.next.next.next = new Node(46);
        list.print(head2);

        Node newHead= list.merge(head1,head2);
        list.print(newHead);
    }
}
