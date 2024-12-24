package layoutmgt;
import java.awt.*;
public class BorderLayoutDemo extends Frame{
    Button b1, b2, b3, b4, b5;

    BorderLayoutDemo() {
        setSize(500, 250);
        setTitle("BorderLayout Demo");
        setLayout(new BorderLayout());
    
        b1 = new Button("Button1");
        b2 = new Button("Button2");
        b3 = new Button("Button3");
        b4 = new Button("Button4");
        b5 = new Button("Button5");
    
        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);
    
        setVisible(true);
    }
    
}
