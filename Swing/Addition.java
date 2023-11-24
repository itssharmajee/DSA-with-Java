package Swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addition {
    public static void main(String[] args) {
        AddGui j=new AddGui();
    }
}

class AddGui extends JFrame implements ActionListener{
    JTextField t1;
    JTextField t2;
    JButton b;
    JLabel l;

    public AddGui(){
        t1= new JTextField(20);
        t2= new JTextField(20);

        b=new JButton("Click to get Res");
        l=new JLabel("Result");
        add(t1);
        add(t2);
        add(b);
        add(l);

        // so if you click on button there should be listener that is ActionLister 
        b.addActionListener(this);//ActionListener is an iterface 

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public void actionPerformed(ActionEvent ae){ // it is called using addActionListener 

        int num1=Integer.parseInt(t1.getText());// getText() is used to get the value from the text box since getText() return string value but we need integer so we use Integer.parse() that convert string into Integer.
        int num2=Integer.parseInt(t2.getText());

        int val=num1+num2;
        l.setText(""+val);// setText takes string value but we have integer so we write string + integer gives string value 
    }
}

// there is another method as well to implement ActionListener 
// simplely write without using ActionListener interface

/*ActionListener a1= new ActionListener(){
    public void actionPerformed(ActionEvent ae){ 

        int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());

        int val=num1+num2;
        l.setText(""+val);
    }
}; // then 

// b.addActionListener(al);
*/