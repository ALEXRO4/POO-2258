package FES.ICO2258;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana extends JFrame {
     private JLabel lbl1;
     private JTextField txtGradC;
     private JButton btnAceptar;
     private JLabel lblResultado;
     private FlowLayout layout;

    public Ventana(String title) throws HeadlessException {
        super(title);
        layout = new FlowLayout();
        this.getContentPane().setLayout(layout);

        lbl1 = new JLabel("Grados C:");
        this.getContentPane().add(lbl1);

        txtGradC = new JTextField(30);
        this.getContentPane().add(txtGradC);

        btnAceptar = new JButton("Convertir");
        btnAceptar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

               double gradCenti = Double.parseDouble(txtGradC.getText());
               double result = (gradCenti * (1.8))+32.0;

              lblResultado.setText("Farenheit: "+ result+" F");

            }
        });

        this.getContentPane().add(btnAceptar);


        lblResultado = new JLabel("0.0 F");
        this.getContentPane().add(lblResultado);


        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null,"Adios");
                System.exit(0);
            }
        });
        this.setSize(800,600);
        this.setVisible(true);
    }
}
