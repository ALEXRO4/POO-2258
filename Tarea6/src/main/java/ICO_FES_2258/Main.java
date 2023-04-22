package ICO_FES_2258;

import ICO_FES_2258.herecniamultiple.AlumnoDeportistaArtista;

public class Main {
    public static void main(String[] args) {
     Cuadrado cuadrado = new Cuadrado();

     cuadrado.setLado(5);
        System.out.println("area= "+cuadrado.calcularArea());
        Circulo circulo = new Circulo();
        circulo.setRadio(2.4);
        System.out.println("Area del circulo = "+circulo.calcularArea());

        AlumnoDeportistaArtista ada = new AlumnoDeportistaArtista();
        System.out.println(ada);
        ada.setNombre("Juan");
        ada.setArte("pintura");
        ada.setDeporte("basket ball");
        ada.ensayar("oleo");
        ada.entrenar();
        ada.presentarCompetencia("naucalli");

    }
}