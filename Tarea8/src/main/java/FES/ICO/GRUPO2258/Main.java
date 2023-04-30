package FES.ICO.GRUPO2258;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

            Caja<String> miCaja= new Caja<>(new String[10]);

            miCaja.add(0, " hola");
            miCaja.add(1, " adios");
            miCaja.add(2, " hi");
        System.out.println(miCaja);


        System.out.println("aaaaaaaaa");

        CajaSinGenericos cajaSi = new CajaSinGenericos(new Object[10]);
      cajaSi.add(0,"hola");
      cajaSi.add(1, "adios");
      cajaSi.add(2,"hi");
        System.out.println(cajaSi);


        String temp= miCaja.get(0);
        String temp2=(String) cajaSi.get(0);


        System.out.println("aaaaaaaaaa");
        Caja<Comida> cajaComida = new Caja<>(new Comida[10]);
        cajaComida.add(0, new Comida("Yogurth", true));
        System.out.println(cajaComida.get(0));
        System.out.println("aaaaaaa");

        ArrayList<Comida> comidas = new ArrayList<>();

        comidas.add(0, new Comida("Zanahoria", false));
        comidas.add(1, new Comida("Zanahoria", false));
        comidas.add(2, new Comida("Zanahoria", false));
        comidas.add(3, new Comida("Zanahoria", false));
        comidas.add(4, new Comida("Zanahoria", false));
        comidas.add(5, new Comida("manzana", false));
        System.out.println(comidas.size());
        System.out.println(comidas.get(5));

        ArrayList<Comida>comidas2 = new ArrayList<>();
        comidas2.add(new Comida("Zanahoria",false));
        comidas2.add(new Comida("Yogurth",true));
        comidas2.add(new Comida("Danonino",true));
        comidas2.add(new Comida("Manzana",false));
        comidas2.add(new Comida("Bistec",false));

        System.out.println(comidas2.get(3));
        comidas2.set(3, new Comida("fresa",false));
        comidas2.add(3, new Comida("naraja",false));

        for (Comida comida:comidas2) {
            System.out.println(comida);
        }



    }


}
