package layoutmgt;

import java.awt.*;

public class Layoutmgt {
    public static void no_layout(){
        Frame frame = new Frame("NoLayout Test");
        frame.setLayout(null);
        Label label = new Label("First Name:");
        label.setBounds(30, 50, 100, 20);
        TextField textField = new TextField();
        textField.setBounds(150, 50, 100, 20);
        frame.add(label);
        frame.add(textField);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        // no_layout();
        // new FlowLayoutDemo();
        // new BorderLayoutDemo();
        new GridBagDemo();
    }
}
