package com.company;

import javax.swing.*;

public class MenuBar {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Bar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // menu:

        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JMenu menuEdit = new JMenu("Edit");
        JMenuItem menuItemCopy = new JMenuItem("Copy");
        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuEdit.add(menuItemCopy);
        menuFile.add(menuItemExit);
        menuBar.add(menuFile);
        menuBar.add(menuEdit);
        frame.setJMenuBar(menuBar);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
