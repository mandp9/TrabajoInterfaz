import Puerto.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MiInterfaz extends JFrame {
    private JPanel MiInterfaz;
    private JTextField idtxt;
    private JTextField pesotxt;
    private JLabel idlbl;
    private JLabel pesolbl;
    private JLabel paislbl;
    private JCheckBox inspcheck;
    private JTextField contenidotxt;
    private JTextField remittxt;
    private JLabel remitlbl;
    private JTextField desttxt;
    private JLabel destlbl;
    private JButton apilarboton;
    private JButton mostrarboton;
    private JTextArea txtmostrado;
    private JTextField contenedortxt;
    private JButton crearOtroContenedorButton;
    private JButton visualizarbtn;
    private JTextField idinttxt;
    private JButton visboton;
    private JLabel idlblint;
    private JLabel titulo;
    private JLabel insplbl;
    private JLabel prioridadlbl;
    private JLabel contlbl;
    private JLabel titulo2;
    private JButton atrasbtn;
    private JTextField arraybuscadotxt;
    private JButton visOtroContbtn;
    private JRadioButton a1;
    private JRadioButton a2;
    private JRadioButton a3;
    private JComboBox comboBox1;
    private JButton verCantidadDeContenedoresButton;
    private JTextPane textcontpais;
    private Puerto puerto;
    private ButtonGroup group = new ButtonGroup();
    ArrayList<String> listaPaisesSelect = new ArrayList<String>();
    public MiInterfaz() {
        setTitle("Creación contenedor");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        txtmostrado.setVisible(false);
        contenedortxt.setVisible(false);
        mostrarboton.setVisible(false);
        crearOtroContenedorButton.setVisible(false);
        visualizarbtn.setVisible(false);
        idinttxt.setVisible(false);
        idlblint.setVisible(false);
        visboton.setVisible(false);
        titulo2.setVisible(false);
        atrasbtn.setVisible(false);
        arraybuscadotxt.setVisible(false);
        setContentPane(MiInterfaz);
        idinttxt.setVisible(false);
        visOtroContbtn.setVisible(false);
        verCantidadDeContenedoresButton.setVisible(false);
        group.add(a1);
        group.add(a2);
        group.add(a3);
        comboBox1.setSelectedIndex(-1);
        puerto = new Puerto();
        textcontpais.setVisible(false);

        apilarboton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idtxt.getText());
                int peso = Integer.parseInt(pesotxt.getText());
                String pais = (String) comboBox1.getSelectedItem();
                boolean inspeccionado = false;
                if (inspcheck.isSelected()) {
                    inspeccionado = true;
                }
                int prioridad = 0;
                if (a1.isSelected()) {
                    prioridad = 1;
                }
                if (a2.isSelected()) {
                    prioridad = 2;
                }
                if (a3.isSelected()) {
                    prioridad = 3;
                }
                String contenido = contenidotxt.getText();
                String remitente = remittxt.getText();
                String destinatario = desttxt.getText();
                Contenedor cont = new Contenedor(id, peso, pais, inspeccionado, prioridad, contenido, remitente, destinatario);
                /* para probar apilar con importancia 3 y columna 3 llena
                for(int i = 0; i<cc.length; i++){
                    cc[i][2] = c;
                }
                h.setArrayCont(cc);
                 */
                boolean exitoApilar = puerto.ApilarContenedor(cont);

                if (exitoApilar)
                {
                    contenedortxt.setText("Contenedor existosamente apilado: " + cont.toString());
                    contenedortxt.setVisible(true);
                    mostrarboton.setVisible(true);
                    apilarboton.setEnabled(false);
                    mostrarboton.setEnabled(true);
                    //AÑADIR PAIS A ARRAYLIST
                    if (!listaPaisesSelect.contains(pais)) {
                        listaPaisesSelect.add(pais);
                    }
                }
                else {
                    contenedortxt.setText("El Contenedor no se ha podido apilar");
                }

            }
        });

        mostrarboton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtmostrado.setText(puerto.toString());
                txtmostrado.setVisible(true);
                crearOtroContenedorButton.setVisible(true);
                visualizarbtn.setVisible(true);
                mostrarboton.setEnabled(false);
                verCantidadDeContenedoresButton.setVisible(true);
            }
        });
        crearOtroContenedorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                idtxt.setText("");
                pesotxt.setText("");
                comboBox1.setSelectedIndex(-1);
                contenidotxt.setText("");
                remittxt.setText("");
                desttxt.setText("");
                contenedortxt.setText("");
                txtmostrado.setVisible(false);
                contenedortxt.setVisible(false);
                mostrarboton.setVisible(false);
                verCantidadDeContenedoresButton.setVisible(false);
                crearOtroContenedorButton.setVisible(false);
                apilarboton.setVisible(true);
                visualizarbtn.setVisible(false);
                apilarboton.setEnabled(true);
                textcontpais.setVisible(false);
            }
        });
        visualizarbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textcontpais.setVisible(false);
                idinttxt.setVisible(true);
                idlblint.setVisible(true);
                titulo2.setVisible(true);
                visboton.setVisible(true);
                visboton.setEnabled(true);
                idtxt.setVisible(false);
                idlbl.setVisible(false);
                titulo.setVisible(false);
                pesotxt.setVisible(false);
                pesolbl.setVisible(false);
                pesotxt.setVisible(false);
                comboBox1.setVisible(false);
                paislbl.setVisible(false);
                inspcheck.setVisible(false);
                inspcheck.setVisible(false);
                a1.setVisible(false);
                a2.setVisible(false);
                a3.setVisible(false);
                prioridadlbl.setVisible(false);
                contlbl.setVisible(false);
                contenidotxt.setVisible(false);
                remittxt.setVisible(false);
                remitlbl.setVisible(false);
                desttxt.setVisible(false);
                destlbl.setVisible(false);
                apilarboton.setVisible(false);
                mostrarboton.setVisible(false);
                contenedortxt.setVisible(false);
                crearOtroContenedorButton.setVisible(false);
                visualizarbtn.setVisible(false);
                insplbl.setVisible(false);
                atrasbtn.setVisible(true);
                verCantidadDeContenedoresButton.setVisible(false);
            }
        });
        visboton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arraybuscadotxt.setVisible(true);
                try {
                    int id = Integer.parseInt(idinttxt.getText());
                    Contenedor cont = puerto.BuscarContenedor(id);
                    if(cont == null){
                        String message = "<html><font color='red'>ID ERRÓNEO</font></html>";
                        JOptionPane.showMessageDialog(null, message);
                        arraybuscadotxt.setVisible(false);
                        visboton.setVisible(false);
                        atrasbtn.setVisible(true);
                        visOtroContbtn.setVisible(true);
                        idinttxt.enable(false);
                    }else{
                        visboton.setVisible(false);
                        arraybuscadotxt.setText(cont.toString());
                        atrasbtn.setVisible(true);
                        visOtroContbtn.setVisible(true);
                        idinttxt.enable(false);
                    }
                }catch (NumberFormatException ex) {
                    String message = "<html><font color='red'>INDIQUE ID</font></html>";
                    JOptionPane.showMessageDialog(null, message);
                    visOtroContbtn.setVisible(false);
                    arraybuscadotxt.setVisible(false);
                }
            }
        });
        atrasbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                idtxt.setText("");
                pesotxt.setText("");
                comboBox1.setSelectedIndex(-1);
                contenidotxt.setText("");
                remittxt.setText("");
                desttxt.setText("");
                contenedortxt.setText("");
                idtxt.setVisible(true);
                apilarboton.setVisible(true);
                apilarboton.setEnabled(true);
                atrasbtn.setVisible(false);
                titulo2.setVisible(false);
                visboton.setVisible(false);
                idlblint.setVisible(false);
                idinttxt.setVisible(false);
                idtxt.setVisible(true);
                idlbl.setVisible(true);
                titulo.setVisible(true);
                pesotxt.setVisible(true);
                pesolbl.setVisible(true);
                pesotxt.setVisible(true);
                comboBox1.setVisible(true);
                paislbl.setVisible(true);
                inspcheck.setVisible(true);
                inspcheck.setVisible(true);
                a1.setVisible(true);
                a2.setVisible(true);
                a3.setVisible(true);
                prioridadlbl.setVisible(true);
                contlbl.setVisible(true);
                contenidotxt.setVisible(true);
                remittxt.setVisible(true);
                remitlbl.setVisible(true);
                desttxt.setVisible(true);
                destlbl.setVisible(true);
                insplbl.setVisible(true);
                txtmostrado.setVisible(false);
                arraybuscadotxt.setVisible(false);
                verCantidadDeContenedoresButton.setVisible(false);
                visOtroContbtn.setVisible(false);
                group.clearSelection();
                inspcheck.setSelected(false);
                visualizarbtn.setVisible(true);
            }
        });
        visOtroContbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                idinttxt.enable(true);
                arraybuscadotxt.setVisible(false);
                idinttxt.setText("");
                visboton.setVisible(true);
                arraybuscadotxt.setText("");
                visOtroContbtn.setVisible(false);
                verCantidadDeContenedoresButton.setVisible(false);
                idinttxt.setForeground(Color.BLACK);
            }
        });

        verCantidadDeContenedoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textcontpais.setVisible(true);
                int numContenedorPais = puerto.BuscarContenedoresPorPais(comboBox1.getSelectedItem().toString());
                textcontpais.setText(""+numContenedorPais);
            }
        });
    }

    public static void main(String[] args) {
        new MiInterfaz();
    }
}
