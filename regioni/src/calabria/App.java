package calabria;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel panel1;
    private JComboBox comboBox1;
    private JButton infoCibo;
    private JCheckBox bergamotto;
    private JCheckBox soppressata;
    private JCheckBox pecorino;
    private JLabel città;
    private JButton immagineCittà;
    private JLabel immagine;
    private JLabel Taurianova;
    private JLabel ReggioCalabria;
    private JLabel Cosenza;
    private JLabel Crotone;
    private JLabel LameziaTerme;
    private JLabel Catanzaro;
    private JLabel Acri;
    private JLabel deskBergamotto;
    private JLabel desksoppressata;
    private JLabel deskpecorinoCrotonese;

    public App() {
        immagineCittà.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox1.getSelectedItem() == "Reggio Calabria") {
                    ReggioCalabria.setVisible(true);
                }
                if (comboBox1.getSelectedItem() == "Catanzaro") {
                    Catanzaro.setVisible(true);
                }
                if (comboBox1.getSelectedItem() == "Lamezia Terme") {
                    LameziaTerme.setVisible(true);
                }
                if (comboBox1.getSelectedItem() == "Cosenza") {
                    Cosenza.setVisible(true);
                }
                if (comboBox1.getSelectedItem() == "Crotone") {
                    Crotone = new JLabel(new ImageIcon("crotone.png"));
                }
                if (comboBox1.getSelectedItem() == "Acri") {
                    Acri.setVisible(true);
                }
                if (comboBox1.getSelectedItem() == "Taurianova") {
                    Taurianova.setVisible(true);
                }
                if (comboBox1.getSelectedItem() == "Select ...") {
                    JOptionPane.showMessageDialog(null, "Nenno, la ghe' non hai selezionato " +
                            "niente");
                }


            }
        });
        infoCibo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if (bergamotto.isSelected()) {
                   deskBergamotto.setVisible(true);
               }
                if (soppressata.isSelected()) {
                    desksoppressata.setVisible(true);
                }
                if (pecorino.isSelected()) {
                    deskpecorinoCrotonese.setVisible(true);
                }

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        Taurianova = new JLabel(new ImageIcon("taurianova.png"));
        ReggioCalabria = new JLabel(new ImageIcon("reggiocalabria.png"));
        Cosenza = new JLabel(new ImageIcon("cosenza.png"));
        Crotone = new JLabel(new ImageIcon("crotone.png"));
        LameziaTerme = new JLabel(new ImageIcon("lameziaterme.png"));
        Catanzaro = new JLabel(new ImageIcon("catanzaro.png"));
        Acri = new JLabel(new ImageIcon("acri.png"));
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
