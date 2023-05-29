package FES.ICO2258;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JButton btnMensaje;
    private JButton btnEntrada;
    private JButton btnOpcion;
    private JLabel lblResultado;

    public Ventana(String title) throws HeadlessException {
        super(title);

        this.getContentPane().setLayout(new FlowLayout());
        btnMensaje = new JButton("mensaje");
        btnEntrada =new JButton("entrada");
        btnOpcion = new JButton("opcion");
        lblResultado = new JLabel("Resultado");

        this.getContentPane().add(btnMensaje);
        this.getContentPane().add(btnEntrada);
        this.getContentPane().add(btnOpcion);
        this.getContentPane().add(lblResultado);

        this.setSize(450,450);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JButton getBtnMensaje() {
        return btnMensaje;
    }

    public void setBtnMensaje(JButton btnMensaje) {
        this.btnMensaje = btnMensaje;
    }

    public JButton getBtnEntrada() {
        return btnEntrada;
    }

    public void setBtnEntrada(JButton btnEntrada) {
        this.btnEntrada = btnEntrada;
    }

    public JButton getBtnOpcion() {
        return btnOpcion;
    }

    public void setBtnOpcion(JButton btnOpcion) {
        this.btnOpcion = btnOpcion;
    }

    public JLabel getLblResultado() {
        return lblResultado;
    }

    public void setLblResultado(JLabel lblResultado) {
        this.lblResultado = lblResultado;
    }
}