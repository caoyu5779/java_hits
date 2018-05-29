package Draw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui3C implements ActionListener {
    JFrame frame;


    public void go(){
        frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton colorButton = new JButton();
        JButton labelButton = new JButton();

        colorButton.addActionListener(this);
        labelButton.addActionListener(this);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.NORTH, labelButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public static void main(String [] args){
        SimpleGui3C gui = new SimpleGui3C();
        gui.go();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            frame.repaint();

    }

}
