package swingapps;

// Option Dialogs, Creating Dialogs, File Choosers, Color Choosers

import javax.swing.*;
import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

public class Menu3 {
    public static void menu3() {
        // Create the main frame
        JFrame frame = new JFrame("Swing Dialog Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Option Dialog Button
        JButton optionDialogButton = new JButton("Show Option Dialog");
        optionDialogButton.addActionListener(e ->
            JOptionPane.showOptionDialog(
                    frame,
                    "Choose an option:",
                    "Option Dialog",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new String[]{"Yes", "No", "Cancel"},
                    "Yes"
            )
        );

        // Custom Dialog Button
        JButton customDialogButton = new JButton("Show Custom Dialog");
        customDialogButton.addActionListener(e -> {
            JDialog dialog = new JDialog(frame, "Custom Dialog", true);
            dialog.setSize(300, 200);
            dialog.setLayout(new FlowLayout());
            dialog.add(new JLabel("This is a custom dialog!"));
            JButton okButton = new JButton("OK");
            okButton.addActionListener(event -> dialog.dispose());
            dialog.add(okButton);
            dialog.setLocationRelativeTo(frame);
            dialog.setVisible(true);
        });

        // File Chooser Button
        JButton fileChooserButton = new JButton("Open File Chooser");
        fileChooserButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(frame);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                JOptionPane.showMessageDialog(frame, "Selected File: " + fileChooser.getSelectedFile().getPath());
            } else {
                JOptionPane.showMessageDialog(frame, "File selection cancelled.");
            }
        });

        // Color Chooser Button
        JButton colorChooserButton = new JButton("Open Color Chooser");
        colorChooserButton.addActionListener(e -> {
            Color selectedColor = JColorChooser.showDialog(frame, "Choose a Color", Color.WHITE);
            if (selectedColor != null) {
                JOptionPane.showMessageDialog(frame, "Selected Color: " + selectedColor);
            } else {
                JOptionPane.showMessageDialog(frame, "No color selected.");
            }
        });

        // Add buttons to the frame
        frame.add(optionDialogButton);
        frame.add(customDialogButton);
        frame.add(fileChooserButton);
        frame.add(colorChooserButton);

        // Display the frame
        frame.setVisible(true);
    }    
}
