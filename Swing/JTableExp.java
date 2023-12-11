//without selectionListener 

/*package Swing;
import javax.swing.*;
import java.awt.event.*;    
import java.awt.*;
public class JTableExp {
    JFrame f;
    JTableExp(){
        f=new JFrame();
        String tab[][]={
            {"1","Shyam","8"},
            {"2","Deepak","5"},
            {"3","Ramesh","12"}
        };
        String roll[]={"Roll","Name","CGPA"};
        JTable jt=new JTable(tab,roll);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);//if you dont add JScrollPane column bar will not visible 

        f.add(sp);
        f.setSize(400,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
    }
    public static void main(String[] args) {
        new JTableExp();
    }
}
*/

// with selectionListener
package Swing;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.*;
import java.awt.*;

public class JTableExp {
    JFrame f;
    JTableExp(){
        f=new JFrame();
        String tab[][]={
            {"1","Shyam","8"},
            {"2","Deepak","5"},
            {"3","Ramesh","12"}
        };
        String roll[]={"Roll","Name","CGPA"};
        JTable jt=new JTable(tab,roll);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);

        // Add a ListSelectionListener to the JTable
        ListSelectionModel selectionModel = jt.getSelectionModel();
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                // Check if the selection is not adjusting (to avoid redundant events)
                if (!e.getValueIsAdjusting()) {
                    // Get the selected row and column
                    int selectedRow = jt.getSelectedRow();
                    int selectedColumn = jt.getSelectedColumn();

                    // Display the selected cell data
                    System.out.println("Selected: " + jt.getValueAt(selectedRow, selectedColumn));
                }
            }
        });

        f.add(sp);
        f.setSize(400,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JTableExp();
    }
}

