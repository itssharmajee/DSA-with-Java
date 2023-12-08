package Swing;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;
import java.awt.*;

public class JComboboxExp {
    JFrame f;
    JButton jb;
    final JLabel l;
    JComboboxExp(){
        // Implemetation of JComboBox without ActionListener


        /*f=new JFrame("example");
        String subject[]={"English","Math","Biology","Hindi","Hinglish","Chemistry","Physics"};
        JComboBox jc=new JComboBox(subject);
        jc.setBounds(0,0,200,20);// we are adjusting the position of the combobox on frame 
        f.add(jc);
        f.setLayout(null);// if we set layout as null you will have to provide setBounds(x-co-ordinate,y-co-ordinate,width of box,height of box);
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        */
        

        // Implemetation of JComboBox without ActionListener
        f=new JFrame("example");
        l=new JLabel(" ");
        jb=new JButton("Display");
        String subject[]={"English","Math","Biology","Hindi","Hinglish","Chemistry","Physics"};
        final JComboBox jc=new JComboBox(subject);
        jc.setBounds(50,50,200,20);// we are adjusting the position of the combobox on frame 
        jb.setBounds(90, 90, 100, 100);
        l.setBounds(200, 200, 520, 100);
        f.add(jc);
        f.add(jb);
        f.add(l);
        f.setLayout(null);// if we set layout as null you will have to provide setBounds(x-co-ordinate,y-co-ordinate,width of box,height of box);
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);

        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // This block of code is executed when an item in the JComboBox is selected
        
                // Get the selected item from the JComboBox
                String message = "You have selected " + jc.getItemAt(jc.getSelectedIndex());
        
                // Update the label (assuming l is an instance of JLabel)
                l.setText(message);
            }
        });
        


    }

    public static void main(String[] args) {
        new JComboboxExp();
    }
}
