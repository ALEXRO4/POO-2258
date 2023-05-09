package FES.ICO2258;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana extends JFrame {
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JButton boton;
    private JComboBox combo;
    private NombreModeloCombo modelo;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setLayout(new FlowLayout());
        lblNombre = new JLabel("Ingresa el nombre");
        this.getContentPane().add(lblNombre);

        txtNombre = new JTextField(30);
        this.getContentPane().add(txtNombre);

        boton = new JButton("agregar");
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String nuevo = txtNombre.getText();
                modelo.agregarNombre(nuevo);
                txtNombre.setText(" ");
            }
        });

        this.getContentPane().add(boton);

        //se configura y agrega el modelo
        modelo = new NombreModeloCombo();
        modelo.agregarNombre("Diana");
        modelo.agregarNombre("Diego");
        modelo.agregarNombre("Susana");
    combo= new JComboBox(modelo);

        this.getContentPane().add(combo);

        combo.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(combo.getSelectedIndex());
                System.out.println(combo.getSelectedItem());
                JOptionPane.showMessageDialog(null,"hola " + combo.getSelectedItem());
            }
        });

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,400);
        this.setVisible(true);
    }
}
