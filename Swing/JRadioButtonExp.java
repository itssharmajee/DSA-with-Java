package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JRadioButtonExp {
    public static void main(String[] args) {
        JradioButton r = new JradioButton();
    }

}

class JradioButton extends JFrame {
    JTextField t1;
    JButton b;
    JRadioButton r1, r2;
    JLabel l;

    public JradioButton() {
        t1 = new JTextField(20);
        b = new JButton("ok");
        r1 = new JRadioButton("male");
        r2 = new JRadioButton("female");
        l = new JLabel("Greetings");

        add(t1);
        add(r1);
        add(r2);
        add(b);
        add(l);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = t1.getText();

                if (r1.isSelected()) {
                    name = "Mr. " + name;
                } else {
                    name = "Mrs. " + name;
                }
                l.setText(name);
            }
        });
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
