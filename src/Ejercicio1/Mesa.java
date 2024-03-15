package Ejercicio1;

public abstract class Mesa {
    //De esta clase heredan las clases Doble, Triple e Individual
    private int numero;
    private int capacidad;

    //Precio
    private double precio;


    public Mesa(int numero, int capacidad, double precio){
        this.numero = numero;
        this.capacidad = capacidad;
        this.precio = precio;

    }

    public int getNumero(){
        return this.numero;
    }

    public int getCapacidad(){
        return this.capacidad;
    }



    public abstract void enseñar();


}
