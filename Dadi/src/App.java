import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class App {
    private JPanel panel1;
    private JTextField textField1;
    private JLabel dado1;
    private JLabel dado2;
    private JLabel dado3;
    private JLabel vincita;
    private JButton cominciaButton;

    public App() {
        cominciaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();

                int puntata = Integer.parseInt(textField1.getText());

                //int genDado1 = random.nextInt(6);
                //int genDado2 = random.nextInt(6);
                //int genDado3 = random.nextInt(6);

                int genDado1 = 5;
                int genDado2 = 3;
                int genDado3 = 5;


                dado1.setText(String.valueOf(genDado1));
                dado2.setText(String.valueOf(genDado2));
                dado3.setText(String.valueOf(genDado3));
                int calcVincita = 0;

                if (genDado1 == genDado2) {
                    if (genDado2 == genDado3) {
                        calcVincita = puntata * 4;
                        if (genDado1 == genDado2) { // Check if 2 numbers are equal
                            if (genDado2 == genDado3) {
                                calcVincita = puntata * 4;
                            } else {
                                calcVincita = puntata * 2;
                            }
                        }
                        if (genDado1 == genDado3) {
                            if (genDado2 == genDado3) {
                                calcVincita = puntata * 4;
                            }
                            else {
                                calcVincita = puntata * 2;
                            }
                            calcVincita = puntata * 2;
                        }
                        if (genDado2 == genDado3) {
                            if (genDado1 == genDado3) {
                                calcVincita = puntata * 4;
                            } else {
                                calcVincita = puntata * 2;
                            }
                        }
                        
                    }
                }
                vincita.setText(String.valueOf(calcVincita));
                System.out.println(calcVincita);
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
