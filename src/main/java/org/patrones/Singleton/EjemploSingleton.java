package org.patrones.Singleton;

import org.patrones.Singleton.ConexionBDSingleton;

public class EjemploSingleton {
    public static void main(String[] args) {
        ConexionBDSingleton con = null;
        for(int i = 0; i<10; i++){
            con = ConexionBDSingleton.getInstancia();
            System.out.println("con = " + con);
        }
        ConexionBDSingleton con2 =  ConexionBDSingleton.getInstancia();
        ConexionBDSingleton con3 =  ConexionBDSingleton.getInstancia();
        boolean v1 = (con == con2 && (con2 == con3) && (con == con3));
        System.out.println("v1 = " + v1);

    }
}