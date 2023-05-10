package Ejemplos.pRadioButton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiPanel extends JFrame{
    //MAIN
    public static void main(String[] args) {
        new MiPanel();
    }
    //ATRIBUTOS
    private JButton b;
    private JRadioButton r1, r2;
    private ButtonGroup g;

    //INICIALIZACIÓN
    public MiPanel(){
        //VENTANA
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,500,400);
        setLayout(null);
        //RESTO
        b = new JButton("MOSTRAR");
        r1 = new JRadioButton("A");
        r2 = new JRadioButton("B");

        b.setBounds(20,30,100,30);
        r1.setBounds(20,60,100,30);
        r2.setBounds(20,90,100,30);

        add(b);
        add(r1);
        add(r2);

        b.addActionListener(new Listener());

        g = new ButtonGroup();
        g.add(r1);
        g.add(r2);

        setVisible(true);
    }
    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = new String ();
            if(r1.isSelected()) s+=r1.getText();
            if(r2.isSelected()) s+=r2.getText();

            JOptionPane.showMessageDialog(null,s);
        }
    }
}
