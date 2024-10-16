
package Topic_3_StackCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Calculator {

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
        @Override
        public void actionPerformed(ActionEvent ae) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
}
}



