package org.patrones.decorator2;

import org.patrones.decorator2.decorador.ConChocolateDecorador;
import org.patrones.decorator2.decorador.ConCremaDecorador;
import org.patrones.decorator2.decorador.ConLecheDecorador;

public class EjemploDecoradorCafe {
    public static void main(String[] args) {

        Configurable cafe = new Cafe(7, "Cafe moccha");
        ConCremaDecorador crema = new ConCremaDecorador(cafe);
        ConLecheDecorador leche = new ConLecheDecorador(crema);
        ConChocolateDecorador chocolate = new ConChocolateDecorador(leche);

        System.out.println("El precio del cafe moccha es: $" + chocolate.getPrecioBase());
        System.out.println("Los ingredientes: " + chocolate.getIngredientes());

        Configurable cafeCapucchino = new Cafe(4, "Cafe Capucchino");
        crema = new ConCremaDecorador(cafeCapucchino);
        leche = new ConLecheDecorador(crema);

        System.out.println("El precio del cafe capucchino es: $" + leche.getPrecioBase());
        System.out.println("Los ingredientes: " + leche.getIngredientes());

        Configurable cafeExpresso = new Cafe(3, "Cafe Expresso");
        System.out.println("El precio del cafe expresso es: $" + cafeExpresso.getPrecioBase());
        System.out.println("Los ingredientes: " + cafeExpresso.getIngredientes());
    }
}
