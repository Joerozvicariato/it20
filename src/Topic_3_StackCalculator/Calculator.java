
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

        @Override
        public void actionPerformed(ActionEvent ae) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
}
}



