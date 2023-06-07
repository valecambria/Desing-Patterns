package org.patrones.factory.producto;

import org.patrones.factory.PizzaProducto;

public class PizzaNewYorkPepperoni extends PizzaProducto {
    public PizzaNewYorkPepperoni() {
        super();
        nombre = "Pizza Pepperoni New York";
        masa = "Masa delgada a la Piedra";
        salsa = "Salsa de Tomate";
        ingredientes.add("Queso Muzzarella");
        ingredientes.add("Extra Pepperoni");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 40 min a 90°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos");
    }
}
