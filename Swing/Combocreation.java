package Swing;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Combocreation {
    private JFrame frame;
    private JComboBox<String> comboBox;
    private JTextField textField;

    public Combocreation() {
        frame = new JFrame("Dynamic JComboBox Example");
        frame.setLayout(null);

        comboBox = new JComboBox<>();
        comboBox.setBounds(50, 50, 150, 25);

        textField = new JTextField();
        textField.setBounds(50, 100, 150, 25);

        JButton addButton = new JButton("Add Item");
        addButton.setBounds(50, 150, 100, 25);

        JButton removeButton = new JButton("Remove Item");
        removeButton.setBounds(160, 150, 120, 25);

        frame.add(comboBox);
        frame.add(textField);
        frame.add(addButton);
        frame.add(removeButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addItem();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeItem();
            }
        });

        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void addItem() {
        String newItem = textField.getText();
        if (!newItem.isEmpty()) {
            comboBox.addItem(newItem);
            textField.setText("");
        }
    }

    private void removeItem() {
        int selectedIndex = comboBox.getSelectedIndex();
        if (selectedIndex != -1) {
            comboBox.removeItemAt(selectedIndex);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Combocreation();
            }
        });
    }
}
