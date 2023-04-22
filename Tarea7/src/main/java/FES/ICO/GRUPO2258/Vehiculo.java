package FES.ICO.GRUPO2258;

public interface Vehiculo {
    //asi se declara de manera constante
    public static final int VELOCIDAD_MAXIMA= 160;
    public static final String CLASIFICACION_EFICIENCIA = "A";

    public boolean encender();
    public boolean apagar();
    public void avanzar();
    public void frenar();

}
