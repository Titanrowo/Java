package Calc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel panel1;
    private JTextField number1;
    private JTextField number2;
    private JLabel addizione;
    private JButton risultato1;
    private JTextField number3;
    private JLabel sottrazione;
    private JTextField number4;
    private JButton risultato2;
    private JTextField number5;
    private JLabel moltiplicazione;
    private JTextField number6;
    private JButton risultato3;
    private JTextField number7;
    private JLabel divisione;
    private JTextField number8;
    private JButton risultato4;

    public App() {
        risultato1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int addition1= Integer.parseInt(number1.getText());
                int addition2= Integer.parseInt(number2.getText());
                int additionRes= addition1 + addition2;
                JOptionPane.showMessageDialog(null,additionRes);
            }
        });
        risultato2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int subrtaction1= Integer.parseInt(number3.getText());
                int subtriction2= Integer.parseInt(number4.getText());
                int subtrictionRes= subrtaction1 - subtriction2;
                JOptionPane.showMessageDialog(null,subtrictionRes);
            }
        });
        risultato3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int moltiplication1= Integer.parseInt(number5.getText());
                int moltiplication2= Integer.parseInt(number6.getText());
                int moltiplicationRes= moltiplication1 * moltiplication2;
                JOptionPane.showMessageDialog(null,moltiplicationRes);
            }
        });
        risultato4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double division1= Double.parseDouble(number7.getText());
                double division2= Double.parseDouble(number8.getText());
                double divisionRes= division1 / division2;
                JOptionPane.showMessageDialog(null,divisionRes);
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


