package Es01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JTextField TextField1;
    private JTextField TextField2;
    private JButton button1;
    private JPanel panel1;

    public App() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int insGiorni; int insCosto;
                        insGiorni = Integer.parseInt(TextField1.getText());
                        insCosto = Integer.parseInt(TextField2.getText());

                        int calc;
                        calc = insCosto * insGiorni;

                        JOptionPane.showMessageDialog(null, "da pagare " + calc);

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
