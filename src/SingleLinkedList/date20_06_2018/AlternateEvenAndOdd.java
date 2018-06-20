package SingleLinkedList.date20_06_2018;

import java.util.Stack;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class AlternateEvenAndOdd {
    Node head;
    Node newHead;
    void add(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }
    Node reverse(Node node){
        Node current = node;
        Node next = null;
        Node prev = null;
        while (current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    public void display(Node head){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+"->");
            n=n.next;
        }
        System.out.println();
    }
   Node alternate(Node node){
       if (node == null||node.next == null || node.next.next == null){
           return null;
       }
       Stack<Node> even = new Stack<>();
       Stack<Node> odd = new Stack<>();
       while (node!=null){
           if (node.data % 2 ==0){
               even.push(node);
           }
           else {
               odd.push(node);
           }
           node = node.next;
       }

       while (!even.isEmpty()&&!odd.isEmpty()){

           Node Etemp = even.peek();
               Etemp.next = newHead;
               newHead = Etemp;
               even.pop();

           Node Otemp = odd.peek();
               Otemp.next = newHead;
               newHead = Otemp;
               odd.pop();

       }
       while (!odd.isEmpty()){
           Node temp = odd.peek();

           temp.next = newHead;
           newHead = temp;
           odd.pop();
       }
       while (!even.isEmpty()){
           Node temp = even.peek();
           temp.next = newHead;
           newHead = temp;
           even.pop();
       }
       return newHead;
   }
   public static void main(String args[]){
       AlternateEvenAndOdd list = new AlternateEvenAndOdd();
       list.add(80);
       list.add(77);
       list.add(55);
       list.add(33);
       list.add(40);
       list.add(20);
       list.add(21);
       list.add(11);
       list.display(list.head);
       Node x = list.alternate(list.head);
       x = list.reverse(x);
       list.display(x);

   }
}
