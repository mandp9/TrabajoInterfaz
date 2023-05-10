package Teoria.Forma1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class MiPanel extends JPanel {
    //1. atributos
    private JLabel etq;
    private JTextField t;
    private JButton b1,b2;
    private int c;
    private Timer tim;

    //2. inicialización
    public MiPanel (){
        setLayout(null);
        //setLayout(new GridLayout());
        etq = new JLabel("ETQ: ");
        etq.setBounds(20,20,100,30);
        add(etq);
        //----
        t = new JTextField("");
        t.setBounds(20,50,100,30);
        add(t);
        b1 = new JButton("B1");
        b1.setBounds(20,80,100,30);
        add(b1);

        b2 = new JButton("B2");
        b2.setBounds(20,110,100,30);
        add(b2);

        tim = new Timer(1000, new Listener()); //1000 -> milisegundos
        tim.setInitialDelay(0);
        tim.start();

        //LISTENERS
        b1.addActionListener(new Listener());
        b2.addActionListener(new Listener());
        t.addActionListener(new Listener());
        b1.addMouseListener(new Listener());


    }//fin de constructor
    //3. eventos
    //Clase interna: necesito conocer quién ha lanzado el evento
    private class Listener implements ActionListener, MouseListener{
        public void actionPerformed (ActionEvent e){
            if(e.getSource() == b1){
                c++;
                t.setText("Contador: " + c);
            }
            if(e.getSource() == b2){
                b1.setEnabled(!b1.isEnabled());
            }
            if(e.getSource() == tim){
                //System.out.println("HOLA");
                c++;
                t.setText("Contador: " + c);
                if(c == 5){
                    tim.stop();
                    JOptionPane.showMessageDialog(null, "BOOM!!!");
                }
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            Random r = new Random ();
            int x,y;
            x = r.nextInt(getWidth() - b1.getWidth());
            y = r.nextInt(getHeight() - b1.getHeight());
            b1.setLocation(x,y);
        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

}
