package FES.ICO2258.Modelo;

public class Libro {
    private int id;
    private String titulo;
    private  String atutor;

    public Libro() {
    }

    public Libro(int id, String titulo, String atutor) {
        this.id = id;
        this.titulo = titulo;
        this.atutor = atutor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAtutor() {
        return atutor;
    }

    public void setAtutor(String atutor) {
        this.atutor = atutor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", atutor='" + atutor + '\'' +
                '}';
    }
}
