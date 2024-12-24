package eventhandle;

import java.awt.*;
import java.awt.event.*;

public class ActionEventDemo extends Frame implements ActionListener {
    TextField tf;

    ActionEventDemo() {
        // create components
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);
        Button b = new Button("Click Me!");
        b.setBounds(100, 120, 80, 30);

        // register listener
        b.addActionListener(this);

        // add components & set size, layout, visibility
        add(tf); add(b);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome.");
    }
}
