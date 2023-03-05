package FES.ICO.POO2258;

import java.util.Scanner;

public class Mandarina {

    private boolean Madurez;
    private String Temporada;
    private String Sabor;
    private byte Tamano;
    private String Vitamina;


    public Mandarina(boolean madurez, String temporada, String sabor, byte tamano, String vitamina) {
        Madurez = madurez;
        Temporada = temporada;
        Sabor = sabor;
        Tamano = tamano;
        Vitamina = vitamina;

    }

    public boolean isMadurez() {
        return Madurez;
    }

    public void setMadurez(boolean madurez) {
        Madurez = madurez;
    }

    public String getTemporada() {
        return Temporada;
    }

    public void setTemporada(String temporada) {
        Temporada = temporada;
    }

    public String getSabor() {
        return Sabor;
    }

    public void setSabor(String sabor) {
        Sabor = sabor;
    }

    public byte getTamano() {

        return Tamano;
    }

    public void setTamano(byte tamano) {
        if(tamano < 3 && tamano > 0){
        Tamano = tamano;
        }else{
            System.out.println("Tamaño no valido");
        }

    }

    public String getVitamina() {
        return Vitamina;
    }

    public void setVitamina(String vitamina) {
        Vitamina = vitamina;
    }

    @Override
    public String toString() {
        return
                "Madurez=" + Madurez +
                ", Temporada='" + Temporada + '\'' +
                ", Sabor='" + Sabor + '\'' +
                ", Tamaño=" + Tamano +
                ", Vitamina='" + Vitamina + '\'';
    }

    public int ComprarMan(){
        Scanner lector = new Scanner(System.in);
        int compra = lector.nextInt();
        if (compra > 1){
            System.out.println("Muy bien ahora tienes: "+compra+" mandarinas");
        }


        return compra;
    }

    public boolean RevisarMan(){

        System.out.println("Revisa si tu mandarina tiene insectos");
        Boolean Gusanitos = Math.random() < .5;
        if (Gusanitos){
            System.out.printf("Parece que tu mandarina tiene algunos insectos: ");
        }else {
            System.out.printf("Tu mandarina parece limpia:");
        }
        return Gusanitos;
    }

    public int Comer(){

        System.out.println("Cuantos gajos quieres comer?:");
        Scanner lector = new Scanner(System.in);
        int gajos = lector.nextInt();
            int gajosRestantes=6;
            int gajosComidos = gajos;
    if (gajosComidos < 7){
            gajosRestantes -= gajosComidos;
        if(gajosComidos == 0){
            System.out.println("Deberias probar un gajo o tiene algun insecto?");
        }else{
        System.out.println("Te comiste "+ gajosComidos +" gajos y te sobraron " + gajosRestantes);
        }
    }else{
        System.out.println("Tu mandarina no tiene suficientes gajos");
    }
               return gajos;
        }
    }

