package Ejemplos.pLista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiPanel extends JFrame {
    //MAIN
    public static void main(String[] args) {
        new MiPanel();
    }
    //ATRIBUTOS
    private JTextField t;
    private JButton b;
    private JLabel etq;
    private DefaultListModel d;
    private JList l;
    private JScrollPane s;

    //INICIALIZACIÓN
    public MiPanel() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 400);
        setLayout(null);
        //RESTO DE COMPONENTES
        t = new JTextField();
        b = new JButton("Borrar");
        etq = new JLabel("Total: 0");
        t.setBounds(20,60,100,30);
        b.setBounds(20,100,100,30);
        etq.setBounds(150,230,150,30);
        add(t);
        add(b);
        add(etq);
        t.addActionListener(new Listener());
        b.addActionListener(new Listener());

        //NUEVO
        d = new DefaultListModel();
        l = new JList(d);
        s = new JScrollPane(l);
        l.setEnabled(true);
        s.setBounds(150,60,150,150);
        add(s);

        setVisible(true);
    }

    //EVENTOS
    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == t){
                d.addElement(t.getText());
                t.setText("");
                etq.setText("Total: " + d.size());
            }
            if(e.getSource() == b){
                d.removeAllElements();
            }
        }
    }
}