package eventhandle;

import java.awt.*;
import java.awt.event.*;

public class WindowEventDemo extends Frame implements WindowListener {
    Label l;

    WindowEventDemo() {
        // Create a label
        l = new Label("Window Event Demo");
        l.setBounds(50, 100, 300, 20);

        // Register the window listener
        addWindowListener(this);

        // Add components and set properties
        add(l);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    // Handle window opened
    public void windowOpened(WindowEvent e) {
        l.setText("Window Opened");
    }

    // Handle window closing
    public void windowClosing(WindowEvent e) {
        l.setText("Window Closing...");
        dispose(); // Close the window
    }

    // Handle window closed
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }

    // Handle window iconified (minimized)
    public void windowIconified(WindowEvent e) {
        l.setText("Window Minimized");
    }

    // Handle window deiconified (restored)
    public void windowDeiconified(WindowEvent e) {
        l.setText("Window Restored");
    }

    // Handle window activated
    public void windowActivated(WindowEvent e) {
        l.setText("Window Activated");
    }

    // Handle window deactivated
    public void windowDeactivated(WindowEvent e) {
        l.setText("Window Deactivated");
    }
}
