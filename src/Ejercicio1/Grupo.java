package Ejercicio1;

public class Grupo extends Mesa{

    public double precio = 7.9;

    public Grupo(int numero){
        super(numero, 6, 7.9);
    }

    public double getPrecio(){
        return this.precio;
    }

    public double setPrecio(double precio){
        return this.precio = precio;
    }

    //Override
    public void enseñar(){
        System.out.println("Mesa triple con número " + this.getNumero() + " y capacidad para " + this.getCapacidad() + " personas.");
    }

}
