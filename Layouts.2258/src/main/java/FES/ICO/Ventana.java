package FES.ICO;

import java.awt.*;

public class Ventana extends Frame {

    private Label lbl1;
    private Label lbl2;

    private TextField txt0;
    private TextField txt1;
    private Button btn1;
    private FlowLayout layout;

    public Ventana(String title) throws HeadlessException {
        super(title);
        layout = new FlowLayout(FlowLayout.LEFT);
        this.setLayout(layout);
        lbl1 = new Label("Etiqueta 1:");
        this.add(lbl1);
        txt0 = new TextField(60);
        this.add(txt0);

        lbl2 = new Label("Etiqueta 2:");
        this.add(lbl2);

        txt1 = new TextField(60);
        this.add(txt1);
    this.setSize(800,600);
        this.setVisible(true);
    }
}
