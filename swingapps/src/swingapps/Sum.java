package swingapps;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sum extends KeyAdapter {
    JFrame frame = new JFrame();
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    Sum(){
        frame.setTitle("Adder");
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(6, 1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Enter first number: ");
        l2 = new JLabel("Enter second number: ");
        l3 = new JLabel("Enter any key to get result: ");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(l3);
        frame.add(t3);

        t3.addKeyListener(this);

        frame.setVisible(true);
    }
    public void keyPressed(KeyEvent e) {
      try{
         double num1 = Double.parseDouble(t1.getText());
         double num2 = Double.parseDouble(t2.getText());
         double result = num1 + num2;
         JOptionPane.showMessageDialog(frame, "Result = " + result);
         t3.setText(null);
      }
      catch (Exception ex) {
         JOptionPane.showMessageDialog(frame, "Invalid number format!");
         t3.setText(null);
      }
    }
}
