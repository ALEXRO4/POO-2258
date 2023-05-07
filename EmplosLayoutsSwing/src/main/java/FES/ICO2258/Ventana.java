package FES.ICO2258;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

public class Ventana extends JFrame {

    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private Button btn1;
    private JLabel lbl1;
    private JLabel lblImagen;

    private JComboBox<String> comboBox1;

    private GridLayout layout;

    public Ventana(String title) throws HeadlessException {
        super(title);

        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);
        //panel1

        panel1 = new JPanel();
        panel1.setBackground(new Color(209, 118, 98));
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        btn1 = new Button("presioname");
        btn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               lbl1.setText("Presionaste el boton");

            }
        });


        panel1.add(btn1);
        lbl1 = new JLabel("....");
        panel1.add(lbl1);
        this.getContentPane().add(panel1,0);


        //panel2
        String urlimagen = "https://m.media-amazon.com/images/I/51p+zNrBkvL._AC_SX425_.jpg";


        panel2 = new JPanel();
        panel2.setBackground(new Color(109, 214, 117));

        try {

            URL url = new URL(urlimagen);
            Image imagenDef = ImageIO.read(url);
            ImageIcon imageNIcon = new ImageIcon(imagenDef);
            lblImagen = new JLabel(imageNIcon);
            panel2.add(lblImagen);

            this.getContentPane().add(panel2,1);

        }catch (MalformedURLException e){
            System.out.println("URL No valida");
        }catch (Exception a){
            System.out.println("Error al cargar imagen");
        }



        //panel3
        panel3 = new JPanel();
        panel3.setBackground(new Color(145, 77, 227));
        panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        String[] elementos = {"opcion 1","opcione 2", "opcion 3", "opcion4"};
        comboBox1 = new JComboBox<>(elementos);
        comboBox1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getSource().toString());
                System.out.println(comboBox1.getSelectedIndex());

            }
        });
        panel3.add(comboBox1);

        this.getContentPane().add(panel3,2);


        //panel4
        panel4 = new JPanel();
        panel4.setBackground(Color.gray);
        this.getContentPane().add(panel4,3);



        this.setSize(800,600);
        this.setVisible(true);
    }
}
