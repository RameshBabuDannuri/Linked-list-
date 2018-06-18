package SingleLinkedList;

import java.util.HashSet;

public class RemoveDuplicateUnSortedList {
    static Node head;
    void remove(Node head){
        Node current = head;
        Node prev = null;
        if (current==null && current.next==null){
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        while (current!=null){
            int val = current.data;
            if (set.contains(val)){
                prev.next = current.next;
            }
            else {
                set.add(val);
                prev = current;
            }
            current = current.next;
        }
    }
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
    public static void main(String args[]){
        RemoveDuplicateUnSortedList list = new RemoveDuplicateUnSortedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(5);
        list.print(head);
        list.remove(head);
        System.out.println();
        list.print(head);

    }
}
