package FES.ICO2258.Modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class PrincesasDisney {
    private int id;
    private String nombre;
    private String cuento;
    private String colorVestido;
    private String imagenUrl;
    private String antagonista;

    public PrincesasDisney() {
    }

    public PrincesasDisney(String nombre, String cuento, String colorVestido, String imagenUrl, String antagonista) {
        this.nombre = nombre;
        this.cuento = cuento;
        this.colorVestido = colorVestido;
        this.imagenUrl = imagenUrl;
        this.antagonista = antagonista;
    }

    public PrincesasDisney(int id, String nombre, String cuento, String colorVestido, String imagenUrl, String antagonista) {
        this.id = id;
        this.nombre = nombre;
        this.cuento = cuento;
        this.colorVestido = colorVestido;
        this.imagenUrl = imagenUrl;
        this.antagonista = antagonista;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuento() {
        return cuento;
    }

    public void setCuento(String cuento) {
        this.cuento = cuento;
    }

    public String getColorVestido() {
        return colorVestido;
    }

    public void setColorVestido(String colorVestido) {
        this.colorVestido = colorVestido;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public String getAntagonista() {
        return antagonista;
    }

    public void setAntagonista(String antagonista) {
        this.antagonista = antagonista;
    }

    @Override
    public String toString() {
        return "PrincesasDisney{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cuento='" + cuento + '\'' +
                ", colorVestido='" + colorVestido + '\'' +
                ", imagenUrl='" + imagenUrl + '\'' +
                ", antagonista='" + antagonista + '\'' +
                '}';
    }
    public ImageIcon getImagen() throws MalformedURLException {

        URL urlImage = new URL(this.imagenUrl);
        return new ImageIcon(urlImage);

    }


}
