package Ejemplos.pVectorBotones;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiPanel extends JFrame implements ActionListener {
    //MAIN
    public static void main(String[] args) {
        new MiPanel();
    }

    //ATRIBUTOS
    private JTextField t;
    private JButton[] v;

    //INICIALIZACIÓN
    public MiPanel() {
        //VENTANA
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 400);
        setLayout(null);
        //RESTO DE COMPONENTES
        t = new JTextField();
        t.setBounds(30, 40, 280, 30);
        add(t);

        v = new JButton[16];
        int i = 0;
        for (int x = 40; x <= 250; x += 70) {
            for (int y = 100; y <= 310; y += 70) {
                v[i] = new JButton("" + i);
                v[i].setBounds(x, y, 50, 40);
                add(v[i]);
                v[i].addActionListener(this);
                i++;
            }
        }
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < v.length; i++) {
            if(i<10 && e.getSource()==v[i]){
                t.setText(t.getText() + v[i].getText());
            }
        }
    }
}
