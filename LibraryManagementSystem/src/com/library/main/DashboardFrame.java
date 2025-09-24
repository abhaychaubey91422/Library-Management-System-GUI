package com.library.main;

import javax.swing.*;
import java.awt.event.*;

public class DashboardFrame extends JFrame {
    public DashboardFrame() {
        setTitle("Library Dashboard");
        setSize(400, 300);
        setLayout(null);

        JButton bookBtn = new JButton("Manage Books");
        bookBtn.setBounds(100, 50, 200, 40);
        add(bookBtn);

        JButton studentBtn = new JButton("Manage Students");
        studentBtn.setBounds(100, 120, 200, 40);
        add(studentBtn);

        bookBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new BookForm();
            }
        });

        studentBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new StudentForm();
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
