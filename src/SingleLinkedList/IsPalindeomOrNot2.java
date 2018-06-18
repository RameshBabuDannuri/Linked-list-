package SingleLinkedList;

public class IsPalindeomOrNot2 {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    public boolean isPalindrome(Node head) {

        if(head == null || head.next==null)
            return true;

        //find list center
        Node fast = head;
        Node slow = head;

        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        Node secondHead = slow.next;
        slow.next = null;

        //reverse second part of the list
        Node p1 = secondHead;
        Node p2 = p1.next;

        while(p1!=null && p2!=null){
            Node temp = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = temp;
        }

        secondHead.next = null;

        //compare two sublists now

        Node p = (p2==null?p1:p2);
        Node q = head;
        while(p!=null){
            if(p.data != q.data)
                return false;

            p = p.next;
            q = q.next;

        }

        return true;
    }

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }


    void printList(Node ptr)
    {
        while (ptr != null)
        {
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }


    public static void main(String[] args) {


        IsPalindeomOrNot2 list = new IsPalindeomOrNot2();

        int arr[] = {1,2,3,2,1};
        for (int i = 0; i< arr.length ; i++) {
            list.push(arr[i]);
        }
        list.printList(head);

        if (list.isPalindrome(head) != false)
        {
            System.out.println("Is Palindrome");
            System.out.println("");
        }
        else
        {
            System.out.println("Not Palindrome");
            System.out.println("");
        }
    }

}
