package SingleLinkedList;

public class IsPalindromOrNot{
    class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data =data;
            this.next = null;
        }
    }
    static ListNode head;
    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return true;

        ListNode p = head;
        ListNode prev = new ListNode(head.data);

        while(p.next != null){
            ListNode temp = new ListNode(p.next.data);
            temp.next = prev;
            prev = temp;
            p = p.next;
        }

        ListNode p1 = head;
        ListNode p2 = prev;

        while(p1!=null){
            if(p1.data != p2.data)
                return false;

            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }
    void insert(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }
    public static void main(String args[]){
        IsPalindromOrNot list = new IsPalindromOrNot();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(2);
        list.insert(1);
        if (list.isPalindrome(head)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}