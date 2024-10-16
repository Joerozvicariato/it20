package topic_3_StackCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class StackCalculator extends JFrame implements ActionListener {
    private Stack<Integer> stack;
    private JTextArea display;

    // Constructor for StackCalculator
    public StackCalculator() {
        stack = new Stack<>();
        setupFrame();
        setupDisplay();
        setupButtons();
    }

    // Setup frame properties
    private void setupFrame() {
        setTitle("Stack Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        setResizable(false);
    }

    // Setup the display area
    private void setupDisplay() {
        display = new JTextArea(3, 20);
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 16));
        display.setMargin(new Insets(10, 10, 10, 10));
        JScrollPane scrollPane = new JScrollPane(display);
        add(scrollPane, BorderLayout.NORTH);
    }

    // Setup buttons for digits 0-9 and arithmetic operations
    private void setupButtons() {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 3, 5, 5));

        // Adding buttons 0-9
        for (int i = 0; i <= 9; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        // Add buttons for arithmetic operations (+, -, *, /)
        String[] operations = {"+", "-", "*", "/"};
        for (String op : operations) {
            JButton button = new JButton(op);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        // Add button panel to the frame
        add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        String buttonText = button.getText();

        // Handle number button presses
        if (Character.isDigit(buttonText.charAt(0))) {
            stack.push(Integer.parseInt(buttonText));
            display.append(buttonText + "\n");
        } 
        // Handle arithmetic operation buttons
        else if ("+".equals(buttonText) || "-".equals(buttonText) || "*".equals(buttonText) || "/".equals(buttonText)) {
            performOperation(buttonText);
        }
    }

    // Method to perform the selected arithmetic operation
    private void performOperation(String operator) {
        if (stack.size() < 2) {
            display.append("Error: Not enough operands\n");
            return;
        }

        int num2 = stack.pop(); // Second operand
        int num1 = stack.pop(); // First operand
        int result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    display.append("Error: Division by zero\n");
                    stack.push(num1); // Push numbers back to stack if error
                    stack.push(num2);
                    return;
                }
                result = num1 / num2;
                break;
        }

        stack.push(result);
        display.append(num1 + " " + operator + " " + num2 + " = " + result + "\n");
    }

    /**
     * Main method to launch the calculator.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StackCalculator calculator = new StackCalculator();
            calculator.setVisible(true);
        });
    }
}
