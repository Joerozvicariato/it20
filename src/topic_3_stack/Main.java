/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package topic_3_stack;
import java.util.Scanner;
/**
 *
 * @author Joeroz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt(); 
        Stack stack = new Stack(size); 
    }   
}
