package Ejercicio1;
import java.util.Scanner;
import java.util.ArrayList;
public class Reserva {
    //Lista para añadir todas las reservas de la mesa
    ArrayList<Mesa> mesas = new ArrayList<Mesa>();


    Mesa individual = new Mesa(5, 1, 2.5) {
        @Override
        public void enseñar() {
            System.out.println("Mesa individual con número " + this.getNumero() + " y capacidad para " + this.getCapacidad() + " persona.");
        }
    };
    Mesa doble = new Mesa (3, 2, 5.0) {
        @Override
        public void enseñar() {
            System.out.println("Mesa doble con número " + this.getNumero() + " y capacidad para " + this.getCapacidad() + " personas.");
        }
    };
    Mesa grupo = new Mesa (2, 6, 7.9) {
        @Override
        public void enseñar() {
            System.out.println("Mesa triple con número " + this.getNumero() + " y capacidad para " + this.getCapacidad() + " personas.");
        }
    };




    public void ReservarMesa(){
    individual.enseñar();
    doble.enseñar();
    grupo.enseñar();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reserva r = new Reserva();
        System.out.println("Bienvenido al restaurante");
        System.out.println("Por favor, indique el número de personas que serán atendidas:");
        int numeroPersonas = sc.nextInt();
        if (numeroPersonas == 1){
            System.out.println("La mesa individual tiene un precio de 2.5 euros");
        } else if (numeroPersonas == 2){
            System.out.println("La mesa doble tiene un precio de 5.0 euros");
        } else if (numeroPersonas > 2 && numeroPersonas < 7){
            System.out.println("La mesa grupal tiene un precio de 7.9 euros");
        }
        else if(numeroPersonas > 6){
            System.out.println("Por favor, reserve dos mesas grupales");
        }
        else{
            System.out.println("Por favor, introduzca un número válido");
        }
        //Mostramos la lista de precios
        System.out.println("Estos son los precios de las mesas:");
        sc.nextLine();
        System.out.println("Mesa individual: 2.5 euros");
        System.out.println("Mesa doble: 4.50 euros");
        System.out.println("Mesa grupal: 7.9 euros");
        //Eleccion de mesa
        System.out.println("Por favor, escriba la mesa que quiere reservar");
        System.out.println("Las opciones son: individual, doble, grupal");
        System.out.println("Escribelo con minusculas");
        String mesa = sc.next();
        int confirmacion;
        if (mesa.equals("individual")){
            System.out.println("Ha elegido la mesa individual. Pulse 1 para confirmar");
            confirmacion = sc.nextInt();
            System.out.println("La mesa individual ha sido reservada");
        } else if (mesa.equals("doble")){
            System.out.println("Ha elegido la mesa doble. Pulse 1 para confirmar");
            confirmacion = sc.nextInt();
            System.out.println("La mesa doble ha sido reservada");
        } else if (mesa.equals("grupal")){
            System.out.println("Ha elegido la mesa grupal. Pulse 1 para confirmar");
            confirmacion = sc.nextInt();
            System.out.println("La mesa grupal ha sido reservada");
        }
        else{
            System.out.println("Por favor, introduzca una mesa válida");
        }
        // Reservamos la mesa
        Reserva reserva = new Reserva();
        reserva.ReservarMesa();
        //Añadimos la reserva al arraylist
        reserva.mesas.add(reserva.individual);
        reserva.mesas.add(reserva.doble);
        reserva.mesas.add(reserva.grupo);







    }
}