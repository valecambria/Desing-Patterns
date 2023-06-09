package org.patrones.decorator;

import org.patrones.decorator.decorador.MayusculaDecorador;
import org.patrones.decorator.decorador.ReemplazarEspacioDecorador;
import org.patrones.decorator.decorador.ReversaDecorador;
import org.patrones.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal Lara");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(reversa);
        ReemplazarEspacioDecorador reemplazar = new ReemplazarEspacioDecorador(subrayar);

        System.out.println(reemplazar.darFormato());
    }
}
