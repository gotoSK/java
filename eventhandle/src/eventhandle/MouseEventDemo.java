package eventhandle;

import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener, MouseMotionListener {
    Label l;

    MouseEventDemo() {
        // Create a label
        l = new Label("Mouse Event Demo");
        l.setBounds(50, 200, 200, 20);

        // Register listeners
        addMouseListener(this);
        addMouseMotionListener(this);

        // Add components and set properties
        add(l);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    // Handle mouse click
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    // Handle mouse press
    public void mousePressed(MouseEvent e) {
        // l.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    // Handle mouse release
    public void mouseReleased(MouseEvent e) {
        // l.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    // Handle mouse enter
    public void mouseEntered(MouseEvent e) {
        // l.setText("Mouse Entered the Frame");
    }

    // Handle mouse exit
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited the Frame");
    }

    // Handle mouse move
    public void mouseMoved(MouseEvent e) {
        l.setText("Mouse Moved at (" + e.getX() + ", " + e.getY() + ")");
    }

    // Handle mouse drag
    public void mouseDragged(MouseEvent e) {
        // l.setText("Mouse Dragged at (" + e.getX() + ", " + e.getY() + ")");
    }
}
