package SingleLinkedList;

public class FindInterSectionPoint {
     Node head1;
     Node head2;
    int count(Node node){
        int count = 0;
        if (node == null){
            return -1;
        }
        while (node!=null){
            count++;
            node = node.next;

        }
        return count;
    }
     int getNode(){
         int pc = count(head1);
         int qc = count(head2);
         int d = 0;
         if (pc<qc){
             d = qc - pc;
            return interSectionPoint(d,head2, head1);
         }
         else {
             d = pc-qc;
            return interSectionPoint(d,head1,head2);
         }


     }

    int interSectionPoint(int d,Node p , Node q){
         int i;
        Node current1 = p;
        Node current2 = q;
         for ( i =0 ; i<d ; i++){
           if (current1 == null){
               return -1;
           }
           current1 = current1.next;
         }
         while (current1!=null&& current2!=null){
             if (current1.data == current2.data){
                 return current1.data;
             }
             current1 = current1.next;
             current2 = current2.next;
         }
         return -1;


    }

    public static void main(String args[]){
        FindInterSectionPoint list = new FindInterSectionPoint();
        list.head1 = new Node(3);
        list.head1.next = new Node(6);
        list.head1.next.next = new Node(15);
        list.head1.next.next.next = new Node(15);
        list.head1.next.next.next.next = new Node(30);

        // creating second linked list
        list.head2 = new Node(10);
        list.head2.next = new Node(15);
        list.head2.next.next = new Node(30);
        System.out.println("intersection point "+list.getNode());
    }
}
