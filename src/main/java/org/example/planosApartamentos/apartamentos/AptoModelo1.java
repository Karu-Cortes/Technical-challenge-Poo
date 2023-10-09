package org.example.planosApartamentos.apartamentos;
import org.example.planosApartamentos.plano.PlanoAda;

public class AptoModelo1 extends PlanoAda {

    //atributo
    private String ubicacionApto;
    // constructor de la clase AptoModelo1
    public AptoModelo1(float area, int numeroBanos, int numeroHabitaciones, String ubicacionApto){

        //hace referencia a los atributos de la clase padre
        super(area, numeroBanos, numeroHabitaciones);
        this.ubicacionApto = ubicacionApto;
    }
    //metodos de mi clase Apto model, en el get y set se dejan modificar
    public String getUbicacionApto() {
        return ubicacionApto;
    }
    public void setUbicacionApto(String ubicacionApto) {
        this.ubicacionApto = ubicacionApto;
    }

    @Override
    public void publicidad() {
        System.out.println("Lindo apartamento de " + getArea() + " m2" );
    }

    public void ciudadApto(){
        System.out.println("El apartamento esta ubicado " + ubicacionApto);
    }

    @Override
    public String toString() {
        //trayendo la informacion del toString de la clase padre PlanoAda
        return super.toString()+
                "AptoModelo1{" +
                "ubicacionApto='" + ubicacionApto + '\'' +
                '}';
    }
}
