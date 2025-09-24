package com.library.main;

import javax.swing.*;
import com.library.dao.BookDAO;
import com.library.model.Book;
import java.awt.event.*;

public class BookForm extends JFrame {
    private JTextField titleField, authorField, publisherField;

    public BookForm() {
        setTitle("Add Book");
        setSize(400, 300);
        setLayout(null);

        JLabel l1 = new JLabel("Title:");
        l1.setBounds(50, 50, 100, 25);
        add(l1);

        titleField = new JTextField();
        titleField.setBounds(150, 50, 150, 25);
        add(titleField);

        JLabel l2 = new JLabel("Author:");
        l2.setBounds(50, 100, 100, 25);
        add(l2);

        authorField = new JTextField();
        authorField.setBounds(150, 100, 150, 25);
        add(authorField);

        JLabel l3 = new JLabel("Publisher:");
        l3.setBounds(50, 150, 100, 25);
        add(l3);

        publisherField = new JTextField();
        publisherField.setBounds(150, 150, 150, 25);
        add(publisherField);

        JButton addBtn = new JButton("Add Book");
        addBtn.setBounds(150, 200, 120, 30);
        add(addBtn);

        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Book b = new Book();
                b.setTitle(titleField.getText());
                b.setAuthor(authorField.getText());
                b.setPublisher(publisherField.getText());
                b.setAvailable(true);

                int status = BookDAO.addBook(b);
                if (status > 0) {
                    JOptionPane.showMessageDialog(null, "Book Added!");
                } else {
                    JOptionPane.showMessageDialog(null, "Error!");
                }
            }
        });

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
