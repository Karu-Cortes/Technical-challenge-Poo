package org.example.planosApartamentos.apartamentos;
import org.example.planosApartamentos.plano.PlanoAda;

public class AptoModelo2 extends PlanoAda {

    private boolean zonaExclusiva;

    public AptoModelo2(float area, int numeroBanos, int numeroHabitaciones, boolean zonaExclusiva){
        super(area, numeroBanos, numeroHabitaciones);
        this.zonaExclusiva = zonaExclusiva;
    }

    public boolean isZonaExclusiva() {
        return zonaExclusiva;
    }

    public void setZonaExclusiva(boolean zonaExclusiva) {
        this.zonaExclusiva = zonaExclusiva;
    }

    @Override
    public void publicidad() {
        System.out.println("Apartamento nuevo con terminaciones");
    }
    public void isExclusive(){
        if(zonaExclusiva)
            System.out.println("El apartamento esta en una zona Exclusiva ");
        else
            System.out.println("El apartamento no esta en una zona Exclusiva ");
    }
    // se usa el obverrida para sobre escribir el metodo del padre esAptoGrande()
    @Override
    public void esAptoGrande() {
       if(getArea() > 100)
           System.out.println("El apartamento es grande: "+ getArea());
       else
           System.out.println("El apartamento es pequeno: " + getArea());

    }

    @Override
    public String toString() {
        //se puede modifica como quieras
        return super.toString() +
                "AptoModelo2{" +
                "zonaExclusiva=" + zonaExclusiva +
                '}';
    }
}
