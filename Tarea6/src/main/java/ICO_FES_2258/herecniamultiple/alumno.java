package ICO_FES_2258.herecniamultiple;

public class alumno extends Persona{
    private int numeroCuenta;
    private String carrera;
    private double promedio;

    public alumno() {
    }

    public alumno(String nombre, int edad, int numeroCuenta, String carrera, double promedio) {
        super(nombre, edad);
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "alumno{" +
                "numeroCuenta=" + numeroCuenta +
                ", carrera='" + carrera + '\'' +
                ", promedio=" + promedio +
                '}';
    }


}
