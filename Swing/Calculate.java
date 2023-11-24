package Swing;

import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculate {
    public static void main(String[] args) {
        AddSub s=new AddSub();
    }
    
}

class AddSub extends JFrame{
    JButton b1,b2;
    JTextField t1,t2;
    JLabel l,l2;


    public AddSub(){
        t1=new JTextField(12);// 12 indicates size of the column
        t2=new JTextField(12);

        b1=new JButton("Add");
        b2=new JButton("Sub");

        l= new JLabel("Result = ");
        l2= new JLabel();

        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(l);
        add(l2);

        
        // ActionListener a1= new ActionListener(){
        // public void actionPerformed(ActionEvent ae){ 

        // int num1=Integer.parseInt(t1.getText());
        // int num2=Integer.parseInt(t2.getText());

        // int val=num1+num2;
        // l.setText(""+val);
        //     }
        // };

        // ActionListener a2= new ActionListener(){
        // public void actionPerformed(ActionEvent ae){ 

        // int num1=Integer.parseInt(t1.getText());
        // int num2=Integer.parseInt(t2.getText());

        // int val=num1-num2;
        // l.setText(""+val);
        //     }
        // };
            
        // Insted of writing indivisualyy you can use if else condition

        ActionListener a1= new ActionListener(){
        public void actionPerformed(ActionEvent ae)
        { 

            int num1=Integer.parseInt(t1.getText());
            int num2=Integer.parseInt(t2.getText());
            int val=0;
            if(ae.getSource()==b1){// getSource() will check who is calling 
                val=num1+num2;
                l2.setText(""+val);
            }
            else if(ae.getSource()==b2)
                val=num1-num2;
                l2.setText(""+val);
        }
        };

        b1.addActionListener(a1);
        b2.addActionListener(a1);
        
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(3);

    }
}
