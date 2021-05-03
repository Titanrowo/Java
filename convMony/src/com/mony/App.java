package com.mony;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel panel1;
    private JComboBox cumbOwOx1;
    private JButton button1;
    private JTextField textField1;
    private JLabel resUwUlt;

    public App() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int inputTextField = Integer.parseInt(textField1.getText());
                String inputComboBox = (String) cumbOwOx1.getSelectedItem();

                int calcbitcoin;
                double calcbgp;

                if (inputComboBox == "Bitcoin") {
                    calcbitcoin = inputTextField / 2;
                    resUwUlt.setText(String.valueOf(calcbitcoin));
                }

                if (inputComboBox == "GBP") {
                    calcbgp = inputTextField / 0.86;
                    resUwUlt.setText(String.valueOf(calcbgp));
                }



            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
