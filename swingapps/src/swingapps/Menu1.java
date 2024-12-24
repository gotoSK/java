package swingapps;

// Menu, Menu Item, Icons in Menu Items, Check Box and Radio Buttons in Menu Items, Enabling and Disabling Menu Items

import javax.swing.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

public class Menu1 {
    public static void menu1() {
        // Create the main frame
        JFrame frame = new JFrame("Simplified Swing Menu Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create the "File" menu
        JMenu fileMenu = new JMenu("File");

        // Add a menu item with an icon
        JMenuItem newItem = new JMenuItem("New", new ImageIcon("path/to/icon.png"));
        newItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "New File Created"));
        fileMenu.add(newItem);

        // Add a check box menu item
        JCheckBoxMenuItem enableEditing = new JCheckBoxMenuItem("Enable Editing");
        enableEditing.addActionListener(e -> {
            if (enableEditing.isSelected()) {
                JOptionPane.showMessageDialog(frame, "Editing Enabled");
            } else {
                JOptionPane.showMessageDialog(frame, "Editing Disabled");
            }
        });
        fileMenu.add(enableEditing);

        // Add radio button menu items
        ButtonGroup themeGroup = new ButtonGroup();
        JRadioButtonMenuItem lightTheme = new JRadioButtonMenuItem("Light Theme");
        JRadioButtonMenuItem darkTheme = new JRadioButtonMenuItem("Dark Theme");

        lightTheme.setSelected(true); // Default selection
        themeGroup.add(lightTheme);
        themeGroup.add(darkTheme);

        lightTheme.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Light Theme Selected"));
        darkTheme.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Dark Theme Selected"));

        fileMenu.add(lightTheme);
        fileMenu.add(darkTheme);

        // Add a menu item that can be enabled/disabled
        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.setEnabled(false); // Initially disabled
        enableEditing.addActionListener(e -> saveItem.setEnabled(enableEditing.isSelected()));
        fileMenu.add(saveItem);

        // Add the "File" menu to the menu bar
        menuBar.add(fileMenu);

        // Set the menu bar for the frame
        frame.setJMenuBar(menuBar);

        // Display the frame
        frame.setVisible(true);
    }
}
