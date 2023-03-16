package g5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiInterfaz extends JFrame {
    private JPanel MiInterfaz;
    private JTextField idtxt;
    private JTextField pesotxt;
    private JTextField paistxt;
    private JTextField prioridadtxt;
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
    private JLabel postitlbl;
    private JLabel idlblint;
    private JLabel titulo;
    private JLabel insplbl;
    private JLabel prioridadlbl;
    private JLabel contlbl;
    private JLabel titulo2;
    private JButton atrasbtn;
    private JTextField arraybuscadotxt;
    private JButton visOtroContbtn;
    private Hub h = new Hub();
    private Contenedor [][] cc = new Contenedor[10][12];
    private Contenedor c;

    public MiInterfaz() {
        h.setArrayCont(cc);
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
        apilarboton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idtxt.getText());
                int peso = Integer.parseInt(pesotxt.getText());
                String pais = paistxt.getText();
                boolean inspeccionado = false;
                if(inspcheck.isSelected()) {
                    inspeccionado = true;
                }
                int prioridad = Integer.parseInt(prioridadtxt.getText());
                String contenido = contenidotxt.getText();
                String remitente = remittxt.getText();
                String destinatario = desttxt.getText();
                c = new Contenedor(id, peso, pais, inspeccionado, prioridad, contenido, remitente, destinatario);
                /* para probar apilar con importancia 3 y columna 3 llena
                for(int i = 0; i<cc.length; i++){
                    cc[i][2] = c;
                }
                h.setArrayCont(cc);
                 */
                h.apilar(c);
                contenedortxt.setText("Contenedor existosamente apilado: " + c.toString());
                contenedortxt.setVisible(true);
                mostrarboton.setVisible(true);
                apilarboton.setEnabled(false);
                mostrarboton.setEnabled(true);
            }
        });

        mostrarboton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtmostrado.setText(h.toString());
                txtmostrado.setVisible(true);
                crearOtroContenedorButton.setVisible(true);
                visualizarbtn.setVisible(true);
                mostrarboton.setEnabled(false);
            }
        });
        crearOtroContenedorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                idtxt.setText("");
                pesotxt.setText("");
                paistxt.setText("");
                prioridadtxt.setText("");
                contenidotxt.setText("");
                remittxt.setText("");
                desttxt.setText("");
                contenedortxt.setText("");
                txtmostrado.setVisible(false);
                contenedortxt.setVisible(false);
                mostrarboton.setVisible(false);
                crearOtroContenedorButton.setVisible(false);
                apilarboton.setVisible(true);
                visualizarbtn.setVisible(false);
                apilarboton.setEnabled(true);
            }
        });
        visualizarbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                paistxt.setVisible(false);
                paislbl.setVisible(false);
                inspcheck.setVisible(false);
                inspcheck.setVisible(false);
                prioridadtxt.setVisible(false);
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
            }
        });
        visboton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arraybuscadotxt.setVisible(true);
                visboton.setVisible(false);
                int id = Integer.parseInt(idinttxt.getText());
                arraybuscadotxt.setText(h.datosContenedor(id).toString());
                atrasbtn.setVisible(true);
                visOtroContbtn.setVisible(true);
            }
        });
        atrasbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                idtxt.setText("");
                pesotxt.setText("");
                paistxt.setText("");
                prioridadtxt.setText("");
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
                paistxt.setVisible(true);
                paislbl.setVisible(true);
                inspcheck.setVisible(true);
                inspcheck.setVisible(true);
                prioridadtxt.setVisible(true);
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
            }
        });

        visOtroContbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arraybuscadotxt.setVisible(false);
                idinttxt.setText("");
                visboton.setVisible(true);
                arraybuscadotxt.setText("");
                visOtroContbtn.setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        new MiInterfaz();
    }
}
