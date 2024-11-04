package View;

import javax.swing.*;

public class Fenetre {
    private JPanel panel;
    private JButton button1;

    public Fenetre() {
        JFrame frame = new JFrame("Fenetre");
        frame.setContentPane(new Fenetre().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
