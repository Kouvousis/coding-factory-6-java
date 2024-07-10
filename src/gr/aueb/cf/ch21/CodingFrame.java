package gr.aueb.cf.ch21;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class CodingFrame extends JFrame {

    public CodingFrame() {
        this.setSize(500, 250);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hello Coding Factory");

        JPanel contentPane = new JPanel();
        this.setContentPane(contentPane);

        JButton messageBtn = new JButton("Message Button");
        messageBtn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "This is a message", "Title of message",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        JButton confirmBtn = new JButton("Confirm button");
        confirmBtn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int answer = JOptionPane.showConfirmDialog(null, "Confirm message",
                        "Confirm title", JOptionPane.YES_NO_OPTION);
                if (answer == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Yes message",
                            "Yes title", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Error message", "Error title",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        contentPane.add(messageBtn);
        contentPane.add(confirmBtn);
    }
}
