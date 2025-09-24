package com.library.main;

import javax.swing.*;
import java.awt.event.*;

public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginFrame() {
        setTitle("Library Login");
        setSize(350, 200);
        setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 30, 80, 25);
        add(userLabel);

        usernameField = new JTextField();
        usernameField.setBounds(150, 30, 120, 25);
        add(usernameField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 70, 80, 25);
        add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 70, 120, 25);
        add(passwordField);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(120, 110, 100, 30);
        add(loginBtn);

        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = usernameField.getText();
                String pass = new String(passwordField.getPassword());
                
                if (user.equals("admin") && pass.equals("admin")) {
                    JOptionPane.showMessageDialog(null, "Login Successful!");
                    new DashboardFrame();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Credentials!");
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
