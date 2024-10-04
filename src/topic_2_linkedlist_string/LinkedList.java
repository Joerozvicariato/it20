/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package topic_2_linkedlist_string;

/**
 *
 * @author asus
 */
public class LinkedList {
      private Node head;
    
    public LinkedList() {
        this.head = null;
    }
    
    public void addNode(String data) {
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
        System.out.println("Node added: " + data);
    }
    
    public void removeNode(String data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        
        if (head.data.equals(data)) {
            head = head.next;
            System.out.println("Node removed: " + data);
            return;
        }
        
        Node current = head;
        Node prev = null;
        
        while (current != null && !current.data.equals(data)) {
            prev = current;
            current = current.next;
        }
        
        if (current == null) {
            System.out.println("Node not found: " + data);
        } else {
            prev.next = current.next;
            System.out.println("Node removed: " + data);
        }
    }
    
    public void displayList() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Node current = head;
            System.out.print("List: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}


