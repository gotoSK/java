package eventhandle;

import java.awt.event.*;
import javax.swing.*;

public class ItemEventDemo extends JFrame implements ItemListener {
    JLabel label;
    JCheckBox checkBox1, checkBox2;
    JRadioButton radioButton1, radioButton2;
    ButtonGroup radioGroup;
    JComboBox<String> comboBox;

    ItemEventDemo() {
        // Set the title
        super("Item Event Demo");

        // Create components
        label = new JLabel("Select an option:");
        label.setBounds(50, 30, 200, 20);

        checkBox1 = new JCheckBox("Option 1");
        checkBox1.setBounds(50, 70, 100, 20);

        checkBox2 = new JCheckBox("Option 2");
        checkBox2.setBounds(50, 100, 100, 20);

        radioButton1 = new JRadioButton("Radio 1");
        radioButton1.setBounds(50, 140, 100, 20);

        radioButton2 = new JRadioButton("Radio 2");
        radioButton2.setBounds(50, 170, 100, 20);

        // Group radio buttons
        radioGroup = new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);

        comboBox = new JComboBox<>(new String[]{"Select", "Option A", "Option B"});
        comboBox.setBounds(50, 210, 150, 20);

        // Add item listeners
        checkBox1.addItemListener(this);
        checkBox2.addItemListener(this);
        radioButton1.addItemListener(this);
        radioButton2.addItemListener(this);
        comboBox.addItemListener(this);

        // Add components to frame
        add(label);
        add(checkBox1);
        add(checkBox2);
        add(radioButton1);
        add(radioButton2);
        add(comboBox);

        // Set frame properties
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == checkBox1) {
            label.setText("Checkbox 1: " + (checkBox1.isSelected() ? "Selected" : "Deselected"));
        } else if (e.getSource() == checkBox2) {
            label.setText("Checkbox 2: " + (checkBox2.isSelected() ? "Selected" : "Deselected"));
        } else if (e.getSource() == radioButton1) {
            label.setText("Radio Button 1 Selected");
        } else if (e.getSource() == radioButton2) {
            label.setText("Radio Button 2 Selected");
        } else if (e.getSource() == comboBox) {
            label.setText("ComboBox Selected: " + comboBox.getSelectedItem());
        }
    }
}
