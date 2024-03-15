package Ejercicio1;

public class Individual extends Mesa{
    private double precio = 2.5;

    public Individual(int numero){
        super(numero, 1, 2.5);
    }

    public double getPrecio(){
        return this.precio;
    }

    public double setPrecio(double precio){
        return this.precio = precio;
    }

    //Override

    public void enseñar(){
        System.out.println("Mesa individual con número " + this.getNumero() + " y capacidad para " + this.getCapacidad() + " persona.");
    }


}
