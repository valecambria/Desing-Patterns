package org.patrones.factory.ejemplo;

import org.patrones.factory.PizzaProducto;
import org.patrones.factory.PizzeriaCaliforniaFactory;
import org.patrones.factory.PizzeriaNewYorkFactory;
import org.patrones.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory cal = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = cal.ordenarPizza("queso");
        System.out.println("Se ha ordenado la pizza: " + pizza.getNombre());

        pizza = ny.ordenarPizza("pepperoni");
        System.out.println("Se ha ordenado la pizza: " + pizza.getNombre());
    }
}
