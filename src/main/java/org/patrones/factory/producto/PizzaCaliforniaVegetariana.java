package org.patrones.factory.producto;

import org.patrones.factory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {
    public PizzaCaliforniaVegetariana() {
        super();
        nombre = "Pizza Vegetariana California";
        masa = "Masa Delgada Light";
        salsa = "Salsa BBQ Light";
        ingredientes.add("Queso Muzzarella");
        ingredientes.add("Cebolla");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Berenjenas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 20 min a 180°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas rectangulares");
    }
}
