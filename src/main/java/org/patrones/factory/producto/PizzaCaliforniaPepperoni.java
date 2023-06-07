package org.patrones.factory.producto;

import org.patrones.factory.PizzaProducto;

public class PizzaCaliforniaPepperoni extends PizzaProducto {
    public PizzaCaliforniaPepperoni() {
        super();
        nombre = "Pizza California Pepperoni";
        masa = "Masa A la Piedra Gruesa";
        ingredientes.add("Pepperoni");
        ingredientes.add("Extra Queso Muzzarella");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 50 min a 55°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños rectangulos");
    }
}
