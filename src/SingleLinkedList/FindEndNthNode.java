package SingleLinkedList;

public class FindEndNthNode {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head;

    void push(int new_data) {
        Node new_node = new Node(new_data);

        new_node.next = head;

        head = new_node;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    Node findNthEnd(Node node , int n){
        Node slow = head;
        Node fast = head;
        int count = 0;
        while (count != n){
            count++;
            fast = fast.next;
        }
        while (fast!=null){
            fast = fast.next;
            slow = slow.next;

        }
        return slow;
    }
    int CountGivenNumber(Node node , int k){
        if (node == null){
            return -1;
        }
        int count = 0;
        while (node!=null){
            if (node.data == k){
                count++;
            }
            node = node.next;
        }
        return count;
    }

    public static void main(String args[]) {
        FindEndNthNode list = new FindEndNthNode();
        list.push(1);
        list.push(2);
        list.push(1);
        list.push(6);
        list.push(1);
        list.push(2);
        list.push(12);
        System.out.println("Original Linked List");
        list.printList();
        Node nthNode = list.findNthEnd(head , 3);
        System.out.println("end nth node is : "+nthNode.data);
        System.out.println("given number count is : "+list.CountGivenNumber(head , 1));
    }
}
