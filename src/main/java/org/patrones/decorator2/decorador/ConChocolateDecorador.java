package org.patrones.decorator2.decorador;

import org.patrones.decorator2.Configurable;

public class ConChocolateDecorador extends CafeDecorador{

    public ConChocolateDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase();
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", Chocolate";
    }
}
