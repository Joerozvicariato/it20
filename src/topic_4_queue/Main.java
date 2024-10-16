/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package topic_4_queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import java.util.Scanner;
/**
 *
 * @author joeroz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Customer> queue = new LinkedList<>(); // Use LinkedList as the Queue implementation
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to the Customer joeroz System!");
        do {
            System.out.print("Enter command (add, serve, display, exit): ");
            command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "add":
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    queue.add(new Customer(name)); // Enqueue customer
                    System.out.println("Customer " + name + " added to the queue.");
                    break;
                case "serve":
                    Customer servedCustomer = queue.poll(); // Dequeue customer
                    if (servedCustomer != null) {
                        System.out.println("Serving customer: " + servedCustomer.getName());
                    } else {
                        System.out.println("No customers in the queue.");
                    }
                    break;
                case "display":
                    System.out.println("Current queue: " + queue);
                    break;
                case "exit":
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        } while (!command.equalsIgnoreCase("exit"));

        scanner.close();
    }
}