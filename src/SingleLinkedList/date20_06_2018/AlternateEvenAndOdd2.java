package SingleLinkedList.date20_06_2018;

public class AlternateEvenAndOdd2 {
    Node head;
    Node even;
    Node odd;


    Node add(Node head , int data){
        Node x = new Node(data);
        if (head == null){
            head = x;
            return head;
        }
        x.next = head;
        head = x;
        return head;
    }
    public void display(Node head){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+"->");
            n=n.next;
        }
        System.out.println();
    }
    void separete(){
        if (head == null || head.next == null || head.next.next==null){
            return;
        }
        while (head!=null){
            if (head.data%2 == 0){
                even = add(even,head.data);
            }
            else {
                odd = add(odd, head.data);
            }
            head = head.next;
        }
    }

    Node alternate(Node even , Node odd){
        Node head = even;
        Node prev = head;
        while (even!=null && odd!=null){

            even = even.next;

            prev.next  = odd;
            prev = prev.next;

            odd = odd.next;

             if (even!=null){
                 prev.next = even;
                 prev = prev.next;
             }

        }
        return head;
    }

    public static void main(String args[]){
        AlternateEvenAndOdd2 list = new AlternateEvenAndOdd2();
     list.head = list.add(list.head,80);
        list.head =   list.add(list.head,77);
        list.head =    list.add(list.head,55);
        list.head =   list.add(list.head,33);
        list.head =  list.add(list.head,40);
        list.head =  list.add(list.head,20);
        list.head =  list.add(list.head,22);
       list.head =  list.add(list.head,11);
       list.display(list.head);
       list.separete();
       list.display(list.even);
       list.display(list.odd);
       Node x = list.alternate(list.even , list.odd);
       list.display(x);

    }

}
