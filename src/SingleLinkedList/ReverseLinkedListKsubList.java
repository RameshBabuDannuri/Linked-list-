package SingleLinkedList;
/*
Example:
Inputs:  1->2->3->4->5->6->7->8->NULL and k = 3
Output:  3->2->1->6->5->4->8->7->NULL.

Inputs:   1->2->3->4->5->6->7->8->NULL and k = 5
Output:  5->4->3->2->1->8->7->6->NULL.
 */
public class ReverseLinkedListKsubList {

    Node reverse(Node head , int k){
        int count  = 0;
        Node current = head;
        Node next = null;
        Node prev = null;

        while (current!=null && count<k){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if (next!=null){
            head.next = reverse(next , k);
        }
        return prev;
    }
    public void display(Node head){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+"->");
            n=n.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        ReverseLinkedListKsubList list = new ReverseLinkedListKsubList();
        Node head = new Node(1);
        head.next =  new Node(2);
        head.next.next =  new Node(3);
        head.next.next.next =  new Node(4);
        head.next.next.next.next =  new Node(5);
        head.next.next.next.next.next =  new Node(6);
        head.next.next.next.next.next.next =  new Node(7);
        head.next.next.next.next.next.next.next =  new Node(8);
        Node x = list.reverse(head, 3);
        list.display(x);

    }

}

