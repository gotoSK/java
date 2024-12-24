package swingapps;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.TitledBorder;

public class GUIControls {
    public static void guiControls() {
        // Create the frame
        JFrame frame = new JFrame("Swing Components Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLayout(new FlowLayout());

        // Label
        JLabel label = new JLabel("Name:");
        frame.add(label);

        // Text Field
        JTextField textField = new JTextField(20);
        frame.add(textField);

        // Password Field
        JLabel passLabel = new JLabel("Password:");
        frame.add(passLabel);
        JPasswordField passwordField = new JPasswordField(20);
        frame.add(passwordField);

        // Text Area with Scroll Pane
        JLabel bioLabel = new JLabel("Bio:");
        frame.add(bioLabel);
        JTextArea textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);

        // Check Box
        JCheckBox checkBox = new JCheckBox("Subscribe to Newsletter");
        frame.add(checkBox);

        // Radio Buttons with ButtonGroup
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        JRadioButton otherButton = new JRadioButton("Other");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderGroup.add(otherButton);
        frame.add(maleButton);
        frame.add(femaleButton);
        frame.add(otherButton);

        // Combo Box
        JLabel comboLabel = new JLabel("Country:");
        frame.add(comboLabel);
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"USA", "Canada", "UK", "Australia"});
        frame.add(comboBox);

        // Slider
        JLabel sliderLabel = new JLabel("Age:");
        frame.add(sliderLabel);
        JSlider slider = new JSlider(0, 100, 25);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        frame.add(slider);

        // Border
        JPanel borderedPanel = new JPanel();
        borderedPanel.setBorder(new TitledBorder("Hobbies"));
        borderedPanel.add(new JCheckBox("Reading"));
        borderedPanel.add(new JCheckBox("Traveling"));
        borderedPanel.add(new JCheckBox("Cooking"));
        frame.add(borderedPanel);

        // Make frame visible
        frame.setVisible(true);
    }  
}
