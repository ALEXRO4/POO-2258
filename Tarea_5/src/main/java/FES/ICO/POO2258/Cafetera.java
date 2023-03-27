package FES.ICO.POO2258;

public class Cafetera {
    private int agua_ml;
    private int cafe_gr;
    private int crema_ml;
    private int vasos;

    public Cafetera() {
    }

    public Cafetera(int agua_ml, int cafe_gr, int crema_ml, int vasos) {
        this.agua_ml = agua_ml;
        this.cafe_gr = cafe_gr;
        this.crema_ml = crema_ml;
        this.vasos = vasos;
    }

    public int getAgua_ml() {
        return agua_ml;
    }

    public void setAgua_ml(int agua_ml) {
        if (agua_ml > 0 && agua_ml < 5001) {
            this.agua_ml = agua_ml;
        }else{
            System.out.println("Cantidad no valida");
        }
    }

    public int getCafe_gr() {
        return cafe_gr;
    }

    public void setCafe_gr(int cafe_gr) {
        if (cafe_gr > 0 && cafe_gr < 1001) {
            this.cafe_gr = cafe_gr;
        }else{
            System.out.println("Cantidad no valida");
        }
    }

    public int getCrema_ml() {
        return crema_ml;
    }

    public void setCrema_ml(int crema_ml) {
        if(crema_ml > 0 && crema_ml < 1501) {
            this.crema_ml = crema_ml;
        }
        else {
            System.out.println("Cantidad no valida ");
        }
    }


    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        if(vasos > 0 && vasos > 51) {
            this.vasos = vasos;
        }else{
            System.out.println("Cantidad no valida");
        }
    }

    @Override
    public String toString() {




        return "Cafetera{" +
                "agua_ml=" + agua_ml +
                ", cafe_gr=" + cafe_gr +
                ", crema_ml=" + crema_ml +
                ", vasos=" + vasos +
                '}';
    }

    //Funciones generales

    public void Americano(){
        System.out.println("Preparando americano...");

        System.out.println("Su café esta listo");
        if (agua_ml >  100 && cafe_gr > 20 && crema_ml > 70 && vasos > 0){
            cafe_gr-=15;
            agua_ml-=180;
            vasos-= 1;
            System.out.println("Aun se puede hacer cafe");
        }else {
            System.out.println("Se necesita rellenar los recursos de la cafetera");
        }
    }

    public void Expreso(){
        System.out.println("Preparando Expreso");

        System.out.println("Su café esta listo");
        if (agua_ml >  100 && cafe_gr > 20 && crema_ml > 70 && vasos > 0){
            cafe_gr-=20;
            agua_ml-=120;
            vasos-=1;
            System.out.println("Aun se puede hacer cafe");
        }else {
            System.out.println("Se necesita rellenar los recursos de la cafetera");
        }
    }

    public void Capuchino(){
        System.out.println("Preparando su Capuchino");

        System.out.println("Su café esta listo");
        if (agua_ml >  100 && cafe_gr > 20 && crema_ml > 70 && vasos > 0){
            cafe_gr-=14;
            crema_ml-=70;
            agua_ml-=100;
            System.out.println("Aun se puede hacer cafe");
        }else {
            System.out.println("Se necesita rellenar los recursos de la cafetera");
        }
    }
    public  String Depositos(){
        return "Depositos de la cafetera{" +
                "agua en ml=" + agua_ml +
                ", cafe en gr=" + cafe_gr +
                ", crema en ml=" + crema_ml +
                ", vasos=" + vasos +
                '}';
    }


}
