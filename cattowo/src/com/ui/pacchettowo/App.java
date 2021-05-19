package com.ui.pacchettowo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton wButton;
    private JPanel panel1;
    private JLabel label1;

    public App() {
        wButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "nome:Edoardo, cognome:Nofroni età:17 data nascita: 1 dicembre 2003 residenza:Magliano in toscana. Quello che si vede è il mio gatto");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        label1 = new JLabel(new ImageIcon("uwu.jpeg"));
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("buon salve");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
