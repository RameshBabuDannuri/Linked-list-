package SingleLinkedList;

public class SwapTwoNodes {
    static Node head;
    void add(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void print(Node head){
        Node temp = head;
        if (temp == null){
            return;
        }
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    void swap(int x , int y){
        Node currX = head;
        Node prevX = null;
        while (currX!=null&&currX.data!=x){
            prevX = currX;
            currX = currX.next;
        }
        Node currY = head;
        Node prevY = null;
        while (currY!=null && currY.data!=y){
            prevY = currY;
            currY = currY.next;
        }
        if (currX==null||currY==null){
            return;
        }
        if (prevX!=null){
            prevX.next = currY;
        }
        else {
            head = currY;
        }
        if (prevY!=null){
            prevY.next = currX;
        }
        else {
            head = currX;
        }

        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }
    public static void main(String args[]){
        SwapTwoNodes list = new SwapTwoNodes();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println("Befor swap");
        list.print(head);
        list.swap(3,6);
        System.out.println("after swap");
        list.print(head);
        list.swap(3,6);
        System.out.println("after swap");
        list.print(head);

    }
}
