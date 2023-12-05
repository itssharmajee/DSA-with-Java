// Implementing the code java swing which makes text as bold, italic,Plain and gives number of lines 

package Swing;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class JavaFontChange extends JFrame implements ActionListener{
    static JFrame f;
    static JButton b,b1,b2,b3;
    static JLabel l,l1;
    static JTextArea jt;

    public static void main(String[] args) {
        f=new JFrame("text field");
        l=new JLabel("write something");
        l1=new JLabel("0 lines");

        b=new JButton("Submit");
        b1=new JButton("Plain");
        b2=new JButton("Italic");
        b3=new JButton("Bold");

        JavaFontChange jf=new JavaFontChange();

        b.addActionListener(jf);
        b1.addActionListener(jf);
        b2.addActionListener(jf);
        b3.addActionListener(jf);

        jt=new JTextArea("please write something",10,10);
        JPanel p=new JPanel();
        p.add(jt);
        p.add(b);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(l);
        p.add(l1);

        f.add(p);
        f.setSize(300,300);
        // f.show();
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
    }

    public void actionPerformed(ActionEvent e)
    {
        String str=e.getActionCommand();
        if(str.equals("Submit")){
            l.setText(jt.getText()+", ");
            l1.setText(jt.getLineCount()+" lines");
        }
        else if(str.equals("Bold")){
            Font f=new Font("serif", Font.BOLD,20);
            jt.setFont(f);
        }
        else if(str.equals("Italic")){
            Font f=new Font("Serif",Font.ITALIC,10);
            jt.setFont(f);
        }
        else if(str.equals("Plain")){
            Font f=new Font("Serif",Font.PLAIN,30);
            jt.setFont(f);
        }
    }
}