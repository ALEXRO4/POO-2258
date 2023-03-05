package FES.ICO.POO2258;

import java.util.Scanner;

public class Gato {
    private String raza;
    private String genero;
    private byte edad;
    private String comida;
    private Boolean esterilizado;

    public Gato(String raza, String genero, byte edad, String comida, Boolean esterilizado) {
        this.raza = raza;
        this.genero = genero;
        this.edad = edad;
        this.comida = comida;
        this.esterilizado = esterilizado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
            this.raza = raza;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
         if (raza == "M" | raza == "F"){
             this.genero = genero;
        }else{
            System.out.println("Ingrese si el gato es Masculo con M o Femenino con una F");
        }
    }

    public byte getEdad() {
      return edad;
    }

    public void setEdad(byte edad) {
        if(edad < 15 && edad > 0){
            this.edad = edad;
        }else{
            System.out.println("Esa edad es incorrecta, intente de nuevo");
        }

    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public Boolean getEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(Boolean esterilizado) {
        this.esterilizado = esterilizado;
    }

    @Override
    public String toString() {
        return
                "raza='" + raza + '\'' +
                ", genero=" + genero +
                ", edad=" + edad +
                ", comida='" + comida + '\'' +
                ", esterilizado=" + esterilizado ;
    }
    Scanner lector = new Scanner(System.in);
    public String Nombrar(){

        String nombre = lector.nextLine();

        return nombre;
    }
    public boolean Dormir(){

        boolean Resul = Math.random() > 0.5;
        if (Resul){
            System.out.printf("El gato esta dormido, no hagas ruido:");
        }else{
            System.out.printf("El gato esta despierto: ");
        }
        return Resul;
    }

    public int Alimentar(){
        System.out.println("Tu gato tiene hambre,cuantas latas de atun le daras?:");
            int latasAtun = lector.nextInt();

            if (latasAtun > 1 | latasAtun < 0){
                System.out.println("Para!!! va a engordar, lo recomendado es una sola lata");
            }else{
                System.out.println("Quedo satisfecho, bien hecho!!");
            }
        return latasAtun;
    }


}
