package ICO_FES_2258.herecniamultiple;

public class AlumnoDeportistaArtista extends alumno implements Deportista,Artista{

    private int idActividadesExtra;
    private String deporte;
    private String arte;

    public AlumnoDeportistaArtista(String nombre, int edad, int numeroCuenta, String carrera, double promedio) {
        super(nombre, edad, numeroCuenta, carrera, promedio);
    }

    public AlumnoDeportistaArtista(String nombre, int edad, int numeroCuenta, String carrera, double promedio, int idActividadesExtra, String deporte, String arte) {
        super(nombre, edad, numeroCuenta, carrera, promedio);
        this.idActividadesExtra = idActividadesExtra;
        this.deporte = deporte;
        this.arte = arte;
    }

    public AlumnoDeportistaArtista() {

    }

    public int getIdActividadesExtra() {
        return idActividadesExtra;
    }

    public void setIdActividadesExtra(int idActividadesExtra) {
        this.idActividadesExtra = idActividadesExtra;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getArte() {
        return arte;
    }

    public void setArte(String arte) {
        this.arte = arte;
    }

    @Override
    public String toString() {
        return super.toString() + "AlumnoDeportistaArtista{" +
                "idActividadesExtra=" + idActividadesExtra +
                ", deporte='" + deporte + '\'' +
                ", arte='" + arte + '\'' +
                '}';
    }

    @Override
    public int ensayar(String disciplina) {
        System.out.println("El alumno esta ensayando "+ this.arte);
        return 2;
    }

    @Override
    public boolean presentarObras() {
        System.out.println(getNombre()+" esta presentando su obra");
        return true;
    }

    @Override
    public int entrenar() {
        System.out.println(getNombre() + " Esta entrenando el deporte "+ getDeporte());
        return 2;
    }

    @Override
    public boolean presentarCompetencia(String ubicacion) {
        System.out.println(getNombre() + " Esta en competencia del deporte "+ getDeporte());
        return true;
    }
}
