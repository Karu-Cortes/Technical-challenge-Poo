package org.example.planosApartamentos.plano;

//el abstract es para indicar que no voy a instanciar la clase, voy a tener clases hijas
public abstract class PlanoAda {
    //1. Defino los Atributos
    private float area;
    private int numeroBanos;
    private int numeroHabitaciones;

    //2. este es le constructor que crear el objeto con la informacion que se solicita del objeto al crearlo o instanciarlo
    public PlanoAda(float area, int numeroBanos, int numeroHabitaciones){

        this.area = area;
        this.numeroBanos= numeroBanos;
        this.numeroHabitaciones= numeroHabitaciones;

    }

    //3. get y set, son metodos
    public float getArea() {
        return area;
    }
    public void setArea(float area) {
        this.area = area;
    }

    public int getNumeroBanos(){
        return numeroBanos;
    }

    public void setNumeroBanos(int numeroBanos){
        this.numeroBanos = numeroBanos;
    }

    public int getNumeroHabitaciones(){
        return numeroHabitaciones;
    }
    public void setNumeroHabitaciones(int numeroHabitaciones){
         this.numeroHabitaciones= numeroHabitaciones;
    }

    //metodos, las clases hijas heredan este metodo y le dan uso
    public abstract void publicidad();

    public void esAptoGrande(){
        if(area > 60 )
            System.out.println("El apartamento es grande: "+ area);
        else
            System.out.println("El apartamento es pequeno: " + area);
    }


    @Override
    public String toString() {
        return "PlanoAda{" +
                "area=" + area +
                ", numeroBanos=" + numeroBanos +
                ", numeroHabitaciones=" + numeroHabitaciones +
                '}';
    }
}
