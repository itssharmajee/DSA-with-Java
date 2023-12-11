package Swing;
// Implementation of JColorChooser that changes the BackgroundColor
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class JColorExp extends JFrame implements ActionListener{
    JButton b;
    Container c;// it is an interface between the components and its platform 

    JColorExp(){
        c=getContentPane();// 
        c.setLayout(new FlowLayout());
        b=new JButton("Select color");
        b.addActionListener(this);
        c.add(b);
    }

    public void actionPerformed(ActionEvent e){
        Color intialColor=Color.GREEN;
        Color color=JColorChooser.showDialog(this, "select a color", intialColor);
        c.setBackground(color);


    }
    public static void main(String[] args) {
        JColorExp ch=new JColorExp();
        ch.setVisible(true);
        ch.setSize(400,400);
        ch.setDefaultCloseOperation(3);

    }
}
