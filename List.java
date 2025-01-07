import java.util.HashSet;

public class List {
    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    Node head;

    void add(int number) {
        Node newNode = new Node(number);
        if (head == null) {
            head = newNode;
        }
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // The function to print the List
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
    }

    // The function to remove the List
    public void removeDuplicates() {
        HashSet<Integer> duplicateSet = new HashSet<>();
        Node current = head;
        Node previous = null;
        while (current != null) {
            int value = current.value;
            if (!duplicateSet.contains(value)) {
                duplicateSet.add(value);
                previous = current;
            }
            else {
                previous.next = current.next;
            }
            current = current.next;
        }
    }

    // The function to reverse the List
    public void reverseList() {
        Node current = head;
        Node previous = null;
        Node temp;
        while (current != null) {
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        head = previous;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 2, 3, 4, 8, 1 };
        List list = new List();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        list.print();
        list.removeDuplicates();
        System.out.println();
        list.print();
        System.out.println();
        list.reverseList();
        list.print();
    }
}

