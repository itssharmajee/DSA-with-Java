package Swing;

// Swing is used to implement the GUI 
import javax.swing.JFrame;
import javax.swing.JLabel;// to display some content in frame 
import java.awt.*;

public class FirstSwing {
    public static void main(String[] args) {
        ABC b=new ABC();
        // b.setVisible(true);// by default it is invisible
        // b.setSize(400,400);
    }
    
}

class ABC extends JFrame{
    public ABC(){
        
        JLabel l=new JLabel("Hello Dear"); // create label 
        JLabel l1=new JLabel("Sapna Jee where Is Deepak ");
        add(l);// add label in frame 
        add(l1); // by default JFrame follows cardLayout thats why it doesnot show first label(overrides contents)

        setLayout(new FlowLayout());// to set the layout
        setVisible(true);// by deault jfame is invisible mode 
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// this is used to work exit button 
    }

}
