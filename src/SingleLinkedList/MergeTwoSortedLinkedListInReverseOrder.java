package SingleLinkedList;
//solution 1
//step 1:merger two list
//step 2:revere new list;

//solution 2
public class MergeTwoSortedLinkedListInReverseOrder {
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
        if (l1==null && l2==null){
            return null;
        }
        Node head = null;
        while (l1!=null && l2!=null){
            if (l1.data<=l2.data){
                Node temp = l1.next;
                l1.next = head;
                head = l1;
                l1=temp;
            }
            else {
                Node temp = l2.next;
                l2.next = head;
                head = l2;
                l2 = temp;
            }

        }
        while (l1!=null){
            Node temp = l1.next;
            l1.next = head;
            head = l1;
            l1 = temp;
        }
        while (l2!=null){
            Node temp = l2.next;
            l2.next = head;
            head = l2;
            l2 = temp;
        }
        return head;
    }

    public static void main(String args[]){
        MergeTwoSortedLinkedListInReverseOrder list = new MergeTwoSortedLinkedListInReverseOrder();
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
        //newHead = list.reverse(newHead);
        //list.print(newHead);
    }
}
