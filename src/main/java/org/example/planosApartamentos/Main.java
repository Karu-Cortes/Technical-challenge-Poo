package org.example.planosApartamentos;
import org.example.planosApartamentos.apartamentos.AptoModelo1;
import org.example.planosApartamentos.apartamentos.AptoModelo2;


public class Main {
    public static void main(String[] args) {
        //AptoModelo2 = clase a instanciar
        //aptoModelo2= el objeto que voy a crear
        //new = estoy indicando que el AptoModelo2 tiene estos atributos.

        AptoModelo1 aptoModelo1 = new AptoModelo1(100.1f, 3, 8, "Bogota");
        AptoModelo2 aptoModelo2 = new AptoModelo2(62.2f, 2,3,true);

        aptoModelo1.ciudadApto();
        aptoModelo1.publicidad();
        System.out.println(aptoModelo1.toString());

        aptoModelo2.esAptoGrande();
        aptoModelo1.esAptoGrande();
        aptoModelo2.publicidad();
        aptoModelo2.isExclusive();
    }
}