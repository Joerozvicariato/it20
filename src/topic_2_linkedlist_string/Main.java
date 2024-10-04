/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package topic_2_linkedlist_string;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
         
        while (true) {
            System.out.println("\n1. Add node");
            System.out.println("2. Remove node");
            System.out.println("3. Display list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter data to add: ");
                    String data = scanner.nextLine();
                    list.addNode(data);
                    break;
                case 2:
                    System.out.print("Enter data to remove: ");
                    data = scanner.nextLine();
                    list.removeNode(data);
                    break;
                case 3:
                    list.displayList();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
