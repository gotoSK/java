package eventhandle;

import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo extends Frame implements KeyListener {
    TextField tf; Label l;

    KeyEventDemo() {
        // create components
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);
        l = new Label("Event Status");
        l.setBounds(100, 120, 80, 30);

        // register listener
        tf.addKeyListener(this);

        // add components & set size, layout, visibility
        add(tf); add(l);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    // Implement all methods of KeyListener
    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed");
    }
    public void keyReleased(KeyEvent e) {
        l.setText("Key Released");
    }
    public void keyTyped(KeyEvent e) {
        // l.setText("Key Typed");
    }
}
