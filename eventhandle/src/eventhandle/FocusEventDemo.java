package eventhandle;

import java.awt.*;
import java.awt.event.*;

public class FocusEventDemo extends Frame implements FocusListener {
    TextField tf1, tf2;
    Label l1, l2;

    FocusEventDemo() {
        // Create components
        tf1 = new TextField("TextField 1");
        tf1.setBounds(60, 50, 150, 20);
        l1 = new Label("Focus Status");
        l1.setBounds(60, 70, 200, 20);
        
        tf2 = new TextField("TextField 2");
        tf2.setBounds(60, 120, 150, 20);
        l2 = new Label("Focus Status");
        l2.setBounds(60, 140, 200, 20);

        // Register listeners
        tf1.addFocusListener(this);
        tf2.addFocusListener(this);

        // Add components & set size, layout, visibility
        add(tf1); add(tf2); add(l1); add(l2);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    // Handle focusGained
    public void focusGained(FocusEvent e) {
        if (e.getSource() == tf1) {
            l1.setText("Focus Gained");
        } else if (e.getSource() == tf2) {
            l2.setText("Focus Gained");
        }
    }

    // Handle focusLost
    public void focusLost(FocusEvent e) {
        if (e.getSource() == tf1) {
            l1.setText("Focus Lost");
        } else if (e.getSource() == tf2) {
            l2.setText("Focus Lost");
        }
    }
}
