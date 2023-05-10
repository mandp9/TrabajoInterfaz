package Teoria.Forma2;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) { //en vez de usar una clase privada, la propia clase hace de listener
        JFrame marco = new JFrame();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setBounds(50,50,300,400);
        marco.add(new MiPanel());
        marco.setVisible(true);
    }
}
