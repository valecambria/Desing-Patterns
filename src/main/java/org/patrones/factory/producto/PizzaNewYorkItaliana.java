package org.patrones.factory.producto;

import org.patrones.factory.PizzaProducto;

public class PizzaNewYorkItaliana extends PizzaProducto {
    public PizzaNewYorkItaliana() {
        super();
        nombre = "Pizza Italiana New York";
        masa = "Masa gruesa";
        salsa = "Salsa de tomate italiana con carne";
        ingredientes.add("Queso Muzzarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Jamón");
        ingredientes.add("Champiñones");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30 min a 120°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos grandes");
    }
}
