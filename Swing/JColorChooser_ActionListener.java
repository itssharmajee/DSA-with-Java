/*package Swing;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class JColorChooser_ActionListener extends JFrame implements ActionListener {

    JFrame jf;
    JButton jb;
    JTextArea jta;
    JColorChooser_ActionListener(){
        jf=new JFrame("color chooser example with actionListener");
        jb=new JButton("color pane");
        jb.setBounds(200,250,100,30);
        jta=new JTextArea();
        jta.setBounds(10,10,300,200);
        jb.addActionListener(this);
        jf.add(jb);
        jf.add(jta);
        jf.setLayout(null);
        jf.setSize(400,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(3);

    }

    public void actionPerformed(ActionEvent e){
        Color c=JColorChooser.showDialog(this, "select", Color.ORANGE);
        jta.setBackground(c);

    }
    public static void main(String[] args) {
        new JColorChooser_ActionListener();
    }
}
*/

// implementation for changing background color
package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JColorChooser_ActionListener implements ActionListener {
    JButton jb;

    JColorChooser_ActionListener() {
        jb = new JButton("Click me");
    }

    void launchFrame() {
        JFrame jf = new JFrame("Change Background Color");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jb.addActionListener(this);

        jf.add(jb, BorderLayout.CENTER);
        jf.setSize(300, 200);
        jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Color initialColor = jb.getBackground();
        Color bg = JColorChooser.showDialog(null, "Select Color", initialColor);

        if (bg != null) {
            jb.setBackground(bg);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JColorChooser_ActionListener obj = new JColorChooser_ActionListener();
            obj.launchFrame();
        });
    }
}

