package swingapps;

// Pop-up Menus, Keyboard Mnemonics and Accelerators, Toolbars, Tooltips

import javax.swing.*;
import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

public class Menu2 {
    public static void menu2() {
        // Create the main frame
        JFrame frame = new JFrame("Swing App Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create the "File" menu
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic('F'); // Mnemonic for File menu

        // Add menu items with accelerators
        JMenuItem newItem = new JMenuItem("New");
        newItem.setAccelerator(KeyStroke.getKeyStroke("ctrl N"));
        newItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "New File Created"));
        fileMenu.add(newItem);

        JMenuItem openItem = new JMenuItem("Open");
        openItem.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
        openItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "File Opened"));
        fileMenu.add(openItem);

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setAccelerator(KeyStroke.getKeyStroke("ctrl Q"));
        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);

        // Create a toolbar
        JToolBar toolbar = new JToolBar("Toolbar");
        JButton newButton = new JButton("New");
        newButton.setToolTipText("Create a new file (Ctrl+N)");
        newButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "New File Created"));
        toolbar.add(newButton);

        JButton openButton = new JButton("Open");
        openButton.setToolTipText("Open a file (Ctrl+O)");
        openButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "File Opened"));
        toolbar.add(openButton);

        JButton exitButton = new JButton("Exit");
        exitButton.setToolTipText("Exit the application (Ctrl+Q)");
        exitButton.addActionListener(e -> System.exit(0));
        toolbar.add(exitButton);

        // Create a pop-up menu
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem cutItem = new JMenuItem("Cut");
        cutItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Cut Selected"));
        popupMenu.add(cutItem);

        JMenuItem copyItem = new JMenuItem("Copy");
        copyItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Copy Selected"));
        popupMenu.add(copyItem);

        JMenuItem pasteItem = new JMenuItem("Paste");
        pasteItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Paste Selected"));
        popupMenu.add(pasteItem);

        // Add a text area to demonstrate the pop-up menu
        JTextArea textArea = new JTextArea();
        textArea.setComponentPopupMenu(popupMenu); // Attach the pop-up menu to the text area

        // Add components to the frame
        frame.add(toolbar, BorderLayout.NORTH);
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Set the menu bar
        frame.setJMenuBar(menuBar);

        // Display the frame
        frame.setVisible(true);
    }
}
