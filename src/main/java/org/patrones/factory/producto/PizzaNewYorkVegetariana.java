package org.patrones.factory.producto;

import org.patrones.factory.PizzaProducto;

public class PizzaNewYorkVegetariana extends PizzaProducto {

    public PizzaNewYorkVegetariana() {
        super();
        nombre = "Pizza Vegetariana New York";
        masa = "Masa Integral Vegana";
        salsa = "Salsa de Tomate";
        ingredientes.add("Queso vegano");
        ingredientes.add("Tomate");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Berenjenas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 min a 150°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas");
    }
}
