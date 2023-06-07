package org.patrones.factory.producto;

import org.patrones.factory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {

    public PizzaCaliforniaQueso() {
        super();
        nombre = "Pizza California Queso";
        masa = "Masa A la Piedra Delgada";
        salsa = "Salsa de tomate y rucula";
        ingredientes.add("Extra Queso Muzzarella");
        ingredientes.add("Cebolla");
        ingredientes.add("Queso Azul");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 35 min a 100°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños triangulos");
    }
}
