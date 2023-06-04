package FES.ICO2258.Interfaz;

import jdk.jfr.Enabled;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincesas extends JFrame {
    private GridLayout layoutGeneral;

    //Objetos de panel 1
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblCuento;
    private JLabel lblColorVestido;
    private JLabel lblImagen;
    private JLabel lblAntagonista;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtCuento;
    private JTextField txtColorVestido;
    private JTextField txtImagenUrl;
    private JTextField txtAntagonista;
    private JButton btnAgregar;
    private JPanel panel1;
    //Objetos Panel 2

    private JTable tblPrincesas;

    private JPanel panel2;
    private JButton btnCargar;
    private JScrollPane scroll;
    //Objetos Panel 3

    private JPanel panel3;
    private JLabel lblfila;
    private JLabel lblImg;
    //Objetos Panel 4
    private JPanel panel4;
    private JButton btnBorrar;
    private JButton btnActualizar;


    //getter y setters

    public GridLayout getLayoutGeneral() {
        return layoutGeneral;
    }

    public void setLayoutGeneral(GridLayout layoutGeneral) {
        this.layoutGeneral = layoutGeneral;
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblCuento() {
        return lblCuento;
    }

    public void setLblCuento(JLabel lblCuento) {
        this.lblCuento = lblCuento;
    }

    public JLabel getLblColorVestido() {
        return lblColorVestido;
    }

    public void setLblColorVestido(JLabel lblColorVestido) {
        this.lblColorVestido = lblColorVestido;
    }

    public JLabel getLblImagen() {
        return lblImagen;
    }

    public void setLblImagen(JLabel lblImagen) {
        this.lblImagen = lblImagen;
    }

    public JLabel getLblAntagonista() {
        return lblAntagonista;
    }

    public void setLblAntagonista(JLabel lblAntagonista) {
        this.lblAntagonista = lblAntagonista;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtCuento() {
        return txtCuento;
    }

    public void setTxtCuento(JTextField txtCuento) {
        this.txtCuento = txtCuento;
    }

    public JTextField getTxtColorVestido() {
        return txtColorVestido;
    }

    public void setTxtColorVestido(JTextField txtColorVestido) {
        this.txtColorVestido = txtColorVestido;
    }

    public JTextField getTxtImagenUrl() {
        return txtImagenUrl;
    }

    public void setTxtImagenUrl(JTextField txtImagenUrl) {
        this.txtImagenUrl = txtImagenUrl;
    }

    public JTextField getTxtAntagonista() {
        return txtAntagonista;
    }

    public void setTxtAntagonista(JTextField txtAntagonista) {
        this.txtAntagonista = txtAntagonista;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JTable getTblPrincesas() {
        return tblPrincesas;
    }

    public void setTblPrincesas(JTable tblPrincesas) {
        this.tblPrincesas = tblPrincesas;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JLabel getLblfila() {
        return lblfila;
    }

    public void setLblfila(JLabel lblfila) {
        this.lblfila = lblfila;
    }

    public JLabel getLblImg() {
        return lblImg;
    }

    public void setLblImg(JLabel lblImg) {
        this.lblImg = lblImg;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JButton getBtnBorrar() {
        return btnBorrar;
    }

    public void setBtnBorrar(JButton btnBorrar) {
        this.btnBorrar = btnBorrar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }


    //fin de g y s



    public VentanaPrincesas(String title) throws HeadlessException {
        super(title);

        //General
        layoutGeneral = new GridLayout(2, 2);
        this.setLayout(layoutGeneral);

        //panel 1
        panel1 = new JPanel();
        panel1.setBackground(new Color(118, 178, 204, 255));

        lblId = new JLabel("Id");
        txtId = new JTextField(4);
        txtId.setText("0");
        txtId.setEnabled(false);
        panel1.add(lblId);
        panel1.add(txtId);

        lblNombre = new JLabel("Nombre");
        txtNombre = new JTextField(29);
        panel1.add(lblNombre);
        panel1.add(txtNombre);

        lblCuento = new JLabel("Cuento: ");
        txtCuento = new JTextField(35);
        panel1.add(lblCuento);
        panel1.add(txtCuento);

        lblColorVestido = new JLabel("Color del vestido: ");
        txtColorVestido = new JTextField(30);
        panel1.add(lblColorVestido);
        panel1.add(txtColorVestido);

        lblImagen = new JLabel("Imagen: ");
        txtImagenUrl = new JTextField(35);
        panel1.add(lblImagen);
        panel1.add(txtImagenUrl);

        lblAntagonista = new JLabel("Antagonista:  ");
        txtAntagonista = new JTextField(24);
        panel1.add(lblAntagonista);
        panel1.add(txtAntagonista);

        btnAgregar = new JButton("Agregar");
        panel1.add(btnAgregar);


        //panel 2
        panel2 = new JPanel();
        panel2.setBackground(new Color(234, 108, 108));
        panel2.setLayout(new FlowLayout());
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        tblPrincesas = new JTable();
        scroll = new JScrollPane(tblPrincesas);
        panel2.add(scroll);


        //panel 3
        panel3 = new JPanel();
        panel3.setBackground(new Color(142, 204, 105, 255));
        panel3.setLayout(new FlowLayout());
        lblfila = new JLabel("Foto:");
        panel3.add(lblfila);
        lblImg = new JLabel("...");
        panel3.add(lblImg);

        //panel 4
        panel4 = new JPanel();
        panel4.setBackground(new Color(137, 211, 168, 255));
        panel4.setLayout(new FlowLayout());
        btnActualizar = new JButton("Actualizar");
        btnBorrar = new JButton("Borrar");
        panel4.add(btnActualizar);
        panel4.add(btnBorrar);



        //Parte final

        this.getContentPane().add(panel1, 0);
        this.getContentPane().add(panel2, 1);
        this.getContentPane().add(panel3, 2);
        this.getContentPane().add(panel4, 3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000, 900);
        this.setVisible(true);
    }
    public void limpiar(){
        txtNombre.setText("");
        txtCuento.setText("");
        txtColorVestido.setText("");
        txtImagenUrl.setText("");
        txtAntagonista.setText("");
    }

}
