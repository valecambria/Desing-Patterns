package org.patrones.factory;

import org.patrones.factory.producto.PizzaNewYorkItaliana;
import org.patrones.factory.producto.PizzaNewYorkPepperoni;
import org.patrones.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "pepperoni" -> new PizzaNewYorkPepperoni();
            case "italiana" -> new PizzaNewYorkItaliana();
            default -> null;
        };
    }
}
