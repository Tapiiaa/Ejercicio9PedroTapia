package Ejercicio1;

public class Doble extends Mesa{
private double precio = 5.0;

    public Doble(int numero){
        super(numero, 2, 5.0);
    }

    public double getPrecio(){
        return this.precio;
    }

    public double setPrecio(double precio){
        return this.precio = precio;
    }

    //Override
    public void enseñar(){
        System.out.println("Mesa doble con número " + this.getNumero() + " y capacidad para " + this.getCapacidad() + " personas.");
    }

}
