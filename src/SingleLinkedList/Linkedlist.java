package SingleLinkedList;

public class Linkedlist {
 static Node head;
 void insert(int data){
     if (head == null){
         head = new Node(data);
     }
     else{
         Node temp = new Node(data);
         temp.next = head;
         head = temp;
     }
 }
 void print(Node temp){
     while (temp!=null){
         System.out.print(temp.data+" ");
         temp = temp.next;
     }
 }
 int delete(int data){
     if (head == null){
         return -1;
     }
     else {
         Node temp = head;
         Node prev = head;
         if (head.data == data){
             head = head.next;
         }
         while (temp!=null){
             if (temp.data == data){
                 int d = temp.data;
                 prev.next = prev.next.next;
                 return d;
             }
             prev = temp;
             temp = temp.next;
         }
     }
     return -1;
 }
 int middle(Node temp){
     if (temp == null){
         return -1;
     }
     Node slow = temp;
     Node fast = temp;
     while (fast!=null && fast.next!=null){
         fast = fast.next.next;
         slow = slow.next;
     }
     return slow.data;
 }
 public static void main(String args[]){
     Linkedlist list = new Linkedlist();
     list.insert(10);
     list.insert(20);
     list.insert(30);
     list.insert(40);
     list.insert(50);
     list.insert(60);
     list.insert(70);
     //list.print(head);
     list.print(head);
     System.out.println( list.delete(30));
     list.print(head);
     System.out.println("middle node: "+ list.middle(head));
     list.print(head);
     System.out.println( list.delete(70));
     list.print(head);
     System.out.println("middle node: "+ list.middle(head));

     list.print(head);
 }
}
