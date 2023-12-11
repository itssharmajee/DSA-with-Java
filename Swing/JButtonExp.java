package Swing;

import javax.swing.*;
import java.awt.*;

public class JButtonExp {
    public static void main(String[] args) {
        // JFrame frame=new JFrame("Button example");
        // JButton b=new JButton("click me !");// with parameter
        // JButton c=new JButton();// with parameter
        // JButton d=new JButton(new ImageIcon("C:\\Users\\Gautam Kumar Sharma\\Desktop\\lordKrishna.jpg"));// with img as parameter
        // JButton e=new JButton("Lord Krishna",new ImageIcon("C:\\Users\\Gautam Kumar Sharma\\Desktop\\R.png"));// both together
        // frame.setVisible(true);
        // frame.add(b);
        // frame.add(c);
        // frame.add(d);
        // frame.add(e);
        // b.setPreferredSize(new Dimension(100,30));// fixing button size of b
        // c.setPreferredSize(new Dimension(100,30));
        // d.setPreferredSize(new Dimension(200,300));
        // e.setPreferredSize(new Dimension(600,400));

        // frame.setSize(1100,1500);
        // frame.setLayout(new FlowLayout());
        // frame.setDefaultCloseOperation(3);
        Demop p=new Demop();

    }
}


// Above JFrame can implement using class as well or without class just write extends JFrame with class name


class Demop extends JFrame{
    public Demop(){ 
    JButton b=new JButton("click me !");// with parameter
        JButton c=new JButton();// with parameter
        JButton d=new JButton(new ImageIcon("C:\\Users\\Gautam Kumar Sharma\\Desktop\\lordKrishna.jpg"));// with img as parameter
        JButton e=new JButton("Lord Krishna",new ImageIcon("C:\\Users\\Gautam Kumar Sharma\\Desktop\\R.png"));// both together
        setVisible(true);
        add(b);
        add(c);
        add(d);
        add(e);
        b.setPreferredSize(new Dimension(100,30));// fixing button size of b
        c.setPreferredSize(new Dimension(100,30));
        d.setPreferredSize(new Dimension(200,300));
        e.setPreferredSize(new Dimension(600,400));

        setSize(1100,1500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);


    }

}
