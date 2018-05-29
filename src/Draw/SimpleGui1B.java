package Draw;

import javax.swing.*;
import java.awt.event.*;

//继承 必须实现类中所有的方法
public class SimpleGui1B implements ActionListener {
    JButton button;

    public static void main(String[] args){
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(100,100);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        button.setText("I've been clicked");
    }
}
