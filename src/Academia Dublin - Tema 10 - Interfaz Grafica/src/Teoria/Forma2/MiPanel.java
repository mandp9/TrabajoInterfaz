package Teoria.Forma2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiPanel extends JPanel implements ActionListener {
    //1.
    private JButton b;

    //2.
    public MiPanel(){
        setLayout(new GridLayout());
        b = new JButton("B1");
        add(b);
    }
    //3.
    public void actionPerformed (ActionEvent e){
        JOptionPane.showMessageDialog(null, "HOLA");
    }

    //3.
}
