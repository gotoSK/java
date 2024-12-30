package swingapps;

// Internal Frames, Frames, Tables, Trees, and Tables.

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class Menu4 {
    public static void menu4() {
        // Create the main frame
        JFrame mainFrame = new JFrame("Swing Demo App");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(800, 600);
        mainFrame.setLayout(new BorderLayout());

        // Create a desktop pane for internal frames
        JDesktopPane desktopPane = new JDesktopPane();

        // Add an internal frame
        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame.setSize(300, 200);
        internalFrame.setVisible(true);
        internalFrame.setLayout(new FlowLayout());
        internalFrame.add(new JLabel("This is an internal frame."));
        desktopPane.add(internalFrame);

        // Create a table
        String[] columnNames = {"ID", "Name", "Age"};
        Object[][] data = {
            {1, "Alice", 24},
            {2, "Bob", 30},
            {3, "Charlie", 28},
            {1, "Alice", 24},
            {2, "Bob", 30},
            {3, "Charlie", 28},
            {1, "Alice", 24},
            {2, "Bob", 30},
            {3, "Charlie", 28},
            {1, "Alice", 24},
            {2, "Bob", 30},
            {3, "Charlie", 28},
            {1, "Alice", 24},
            {2, "Bob", 30},
            {3, "Charlie", 28},
            {1, "Alice", 24},
            {2, "Bob", 30},
            {3, "Charlie", 28},
            {1, "Alice", 24},
            {2, "Bob", 30},
            {3, "Charlie", 28},
            {1, "Alice", 24},
            {2, "Bob", 30},
            {3, "Charlie", 28},
            {1, "Alice", 24},
            {2, "Bob", 30},
            {3, "Charlie", 28},
            {1, "Alice", 24},
            {2, "Bob", 30},
            {3, "Charlie", 28},
            {1, "Alice", 24},
            {2, "Bob", 30},
            {3, "Charlie", 28},
            {1, "Alice", 24},
            {2, "Bob", 30},
            {3, "Charlie", 28},
            {1, "Alice", 24},
            {2, "Bob", 30},
            {3, "Charlie", 28},
            {1, "Alice", 24},
            {2, "Bob", 30},
            {3, "Charlie", 28},
            {1, "Alice", 24},
            {2, "Bob", 30},
            {3, "Charlie", 28},
            {1, "Alice", 24},
            {2, "Bob", 30},
            {3, "Charlie", 28},
            {1, "Alice", 24},
            {2, "Bob", 30},
            {3, "Charlie", 28},
            {1, "Alice", 24},
            {2, "Bob", 30},
            {3, "Charlie", 28},
            {1, "Alice", 24},
            {2, "Bob", 30},
            {3, "Charlie", 28},
        };
        JTable table = new JTable(new DefaultTableModel(data, columnNames));
        JScrollPane tableScrollPane = new JScrollPane(table);

        // Add a tree
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node 1");
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Node 2");
        rootNode.add(node1);
        rootNode.add(node2);
        node1.add(new DefaultMutableTreeNode("Child 1"));
        node1.add(new DefaultMutableTreeNode("Child 2"));
        node2.add(new DefaultMutableTreeNode("Child 3"));

        JTree tree = new JTree(rootNode);
        JScrollPane treeScrollPane = new JScrollPane(tree);

        // Create a panel to hold the table and tree side by side
        JPanel panel = new JPanel(new GridLayout(1, 2));
        panel.add(tableScrollPane);
        panel.add(treeScrollPane);

        // Add components to the main frame
        mainFrame.add(desktopPane, BorderLayout.CENTER);
        mainFrame.add(panel, BorderLayout.SOUTH);

        // Display the main frame
        mainFrame.setVisible(true);
    }    
}
