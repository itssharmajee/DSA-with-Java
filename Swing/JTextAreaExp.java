package Swing;

import javax.swing.*;

class TextAreaExp extends JFrame {
    public TextAreaExp() {
        JTextArea area = new JTextArea();
        area.setText("This is a string \nmethod where \nwe implements");

        area.setBounds(10, 30, 20, 20);
        area.append("new added things ");// adding some text in an existing text
        add(area);// adding this text area to the frame
        setSize(300, 300);// mentioning the size of the frame
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(3);
        String str = area.getText();
        Integer n = area.getLineCount();
        System.out.println("no of lines " + n);
        System.out.println(str);

    }
}

public class JTextAreaExp {
    public static void main(String[] args) {
        new TextAreaExp();// creating an object of the class TextAreaExp
    }
}
