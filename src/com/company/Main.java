package com.company;


import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	JFrame frame = new JFrame("Hello World");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel = new JPanel();
//    frame.setLayout(new FlowLayout());
        frame.add(panel);
    JLabel label = new JLabel("Hello World - with component");
    JLabel label2 = new JLabel("Me too");
    panel.add(label, BorderLayout.CENTER);
    panel.add(label2, BorderLayout.CENTER);
    frame.setSize(1000,600);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    }
}
