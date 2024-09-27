/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Joeroz
 */
public class ItemManager {
private static ArrayList<String> items = new ArrayList<>();
  private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        
      boolean running = true;
        while (running) {
            
            System.out.println("\nItem Manager");
            System.out.println("1. Display items");
            System.out.println("2. Insert item");
            System.out.println("3. Update item");
            System.out.println("4. Find item");
            System.out.println("5. Delete item");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

             int choice = scanner.nextInt();
            scanner.nextLine();
           switch (choice) {
                case 1:
                    displayItems();
                    break;
                case 2:
                    insertItem();
                    break;
                case 3:
                    updateItem();
                    break;
               
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("Thank you for using Item Manager!");
    }     
       private static void displayItems() { 
        if (items.isEmpty()) {
            System.out.println("No items to display.");
        } else {
            System.out.println("Items:");
            for (int i = 0; i < items.size(); i++) {
                System.out.println((i + 1) + ". " + items.get(i));
            }
        }
    }

    private static void insertItem() {
        System.out.print("Enter item name to insert: ");
        String item = scanner.nextLine();
        items.add(item);
        System.out.println("Item inserted successfully.");
    }

    private static void updateItem() {
        displayItems();
        if (!items.isEmpty()) {
            System.out.print("Enter the number of the item to update: ");
            int index = scanner.nextInt() - 1;
            scanner.nextLine(); // Consume newline
            if (index >= 0 && index < items.size()) {
                System.out.print("Enter new item name: ");
                String newItem = scanner.nextLine();
                items.set(index, newItem);
                System.out.println("Item updated successfully.");
            } else {
                System.out.println("Invalid item number.");
            }
        }
    }

}
      
    
    

