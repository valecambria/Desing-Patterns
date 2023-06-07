package org.patrones.factory;

import org.patrones.factory.producto.PizzaCaliforniaPepperoni;
import org.patrones.factory.producto.PizzaCaliforniaQueso;
import org.patrones.factory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "vegetariana" -> new PizzaCaliforniaVegetariana();
            case "pepperoni" -> new PizzaCaliforniaPepperoni();
            case "queso" -> new PizzaCaliforniaQueso();
            default -> null;
        };
    }
}
