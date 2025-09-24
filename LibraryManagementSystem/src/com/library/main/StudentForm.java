package com.library.main;

import javax.swing.*;
import com.library.dao.StudentDAO;
import com.library.model.Student;
import java.awt.event.*;

public class StudentForm extends JFrame {
    private JTextField nameField, courseField;

    public StudentForm() {
        setTitle("Add Student");
        setSize(400, 250);
        setLayout(null);

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(50, 50, 100, 25);
        add(l1);

        nameField = new JTextField();
        nameField.setBounds(150, 50, 150, 25);
        add(nameField);

        JLabel l2 = new JLabel("Course:");
        l2.setBounds(50, 100, 100, 25);
        add(l2);

        courseField = new JTextField();
        courseField.setBounds(150, 100, 150, 25);
        add(courseField);

        JButton addBtn = new JButton("Add Student");
        addBtn.setBounds(150, 150, 120, 30);
        add(addBtn);

        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Student s = new Student();
                s.setName(nameField.getText());
                s.setCourse(courseField.getText());

                int status = StudentDAO.addStudent(s);
                if (status > 0) {
                    JOptionPane.showMessageDialog(null, "Student Added!");
                } else {
                    JOptionPane.showMessageDialog(null, "Error!");
                }
            }
        });

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
