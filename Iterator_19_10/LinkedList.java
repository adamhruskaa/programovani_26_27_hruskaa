package Iterator_19_10;

public class LinkedList {
    private Node head;

    private static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("A");
        list.add("B");
        list.add("C");

        Node current = list.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
