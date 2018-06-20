package SingleLinkedList;

import java.util.Stack;

public class ReverseKSubLists {
    Node reverse(Node head, int k){
        Node current = head;
        Node prev = null;
        Stack<Node> s = new Stack<>();
        while (current!=null){
            int count  = 0;
            while (current!=null&& count<k){
                s.push(current);
                current = current.next;
                count++;
            }
            while (s.size()>0){
                if (prev == null){
                    prev = s.peek();
                    head = prev;
                    s.pop();
                }
                else {
                    prev.next = s.peek();
                    prev = prev.next;
                    s.pop();
                }
            }
        }
        prev.next = null;
        return head;

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
        ReverseKSubLists list = new ReverseKSubLists();
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
