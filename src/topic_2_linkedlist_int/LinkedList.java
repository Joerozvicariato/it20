

package topic_2_linkedlist_int;


public class LinkedList {
    private Node head;

    // Node class representing each element in the linked list
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to add a new node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to delete a node by value
    public void deleteByValue(int value) {
        if (head == null) return;

        // If the head needs to be removed
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == value) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    // Method to move a node from one position to another
    public void moveNodePointer(int currentIndex, int newIndex) {
        if (head == null || currentIndex == newIndex) return;

        Node current = head;
        Node prev = null;
        Node movingNode = null;
        Node movingPrev = null;
        // Find the node to move
        for (int i = 0; current !=