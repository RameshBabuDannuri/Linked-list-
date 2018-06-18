package SingleLinkedList;

public class SegregateOddAndEven2 {

    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
     static Node head;
     static Node evenHead = null;
     static  Node oddHead = null;

    static  Node insert(Node node ,int data){
        Node newNode = new Node(data);
        if (node == null){
            node = newNode;
            return node;
        }
        newNode.next = node;
        node = newNode;
        return node;
    }
   Node segregate(Node head){
       Node current = null;
        if (head== null){
            return null;
        }
        while (head!=null){
            if (head.data%2 == 0){
               evenHead =  insert(evenHead , head.data);
            }
            else{
              oddHead = insert(oddHead , head.data);
            }
            head = head.next;
        }

       Node temp = oddHead;
       while (temp.next!=null){
            temp = temp.next;
       }
       temp.next = evenHead;
        return oddHead;
    }
    void printList(Node node)
    {
        Node temp = node;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
       SegregateOddAndEven2 obj = new SegregateOddAndEven2();
      for (int i =10 ; i>0 ;i--){
          head = insert(head , i);
      }
        obj.printList(head);
        head = obj.segregate(head);
        obj.printList(head);



    }
}
