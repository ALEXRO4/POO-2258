package FES.ICO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaGrid extends Frame {
    private Label lbl1;
    private Label lbl2;

    private TextField txt0;
    private TextField txt1;
    private Button btn1;

    private GridLayout layout2;

    public VentanaGrid(String title) throws HeadlessException {
        super(title);
        layout2 = new GridLayout(3,2);
        this.setLayout(layout2);

        lbl1 = new Label("etiqueta 1:");
        this.add(lbl1, 0);
        txt0 = new TextField(30);
        this.add(txt0,1);

        lbl2 = new Label("Etiqueta 2:");
        this.add(lbl2, 2);
        txt1 = new TextField(30);
        this.add(txt1,3);

        btn1 = new Button("Presioname");
        this.add(btn1,4);

        btn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
          String texto = (String)txt0.getText() + " " + txt1.getText();
                JOptionPane.showMessageDialog(null,texto);
            }
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        this.setSize(800,600);
        this.setVisible(true);
    }
}
