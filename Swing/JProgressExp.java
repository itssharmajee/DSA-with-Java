package Swing;

import javax.swing.*;

public class JProgressExp extends JFrame {

    // implementing JProgressBar with percentage progress

    /*
     * JProgressBar jb;
     * int i=0, num=0;
     * JProgressExp(){
     * jb=new JProgressBar(SwingConstants.HORIZONTAL);
     * jb.setBounds(40,40,160,30);
     * jb.setStringPainted(true);// it is used to see progress status of the
     * progressbar
     * jb.setValue(0);
     * add(jb);
     * setSize(250,300);
     * setLayout(null);
     * setVisible(true);
     * setDefaultCloseOperation(3);
     * }
     * public void iterate(){// this function will handle the progress speed
     * while(i<=100){
     * jb.setValue(i);
     * i+=1;
     * try{
     * Thread.sleep(500);
     * }
     * catch(Exception e){
     * 
     * }
     * }
     * }
     * public static void main(String[] args) {
     * JProgressExp js=new JProgressExp();
     * js.iterate();
     * }
     */

    // Implementing of JProgressbar with String progress
    static JFrame jf;
    static JProgressBar jb;
    static void fill(){
            int i=0;
            try{
                while(i<=100){
                    if(i<30 && i<70){
                        jb.setString("wait for sometime");
                    }else if(i>70){
                        jb.setString("almost finished");
                    }else{
                        jb.setString("loading started");
                    }
                    jb.setValue(i+=10);
                    Thread.sleep(200);
                }
            }catch(Exception e){}

        }

    public static void main(String[] args) {

        jf=new JFrame("example");
        JPanel jp=new JPanel();
        jb=new JProgressBar();
        jb.setValue(0);
        jb.setStringPainted(true);
        jp.add(jb);
        jf.add(jp);
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fill();

        
    }
}
