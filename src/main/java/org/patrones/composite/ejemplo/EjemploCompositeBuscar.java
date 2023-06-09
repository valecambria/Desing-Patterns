package org.patrones.composite.ejemplo;

import org.patrones.composite.Archivo;
import org.patrones.composite.Directorio;

public class EjemploCompositeBuscar {
    public static void main(String[] args) {
        Directorio doc = new Directorio("Documentos");
        Directorio java = new Directorio("Java");

        java.addComponente(new Archivo("patron-composite.docx"));
        Directorio stream = new Directorio("Api Stream");
        stream.addComponente(new Archivo("stream-map.docx"));

        java.addComponente(stream);

        doc.addComponente(java);
        doc.addComponente(new Archivo("cv.docx"));
        doc.addComponente(new Archivo("logo.jpg"));

        boolean encontrado = doc.buscar("cv.docx");
        System.out.println(encontrado);

        encontrado = doc.buscar("Api Stream");
        System.out.println(encontrado);
    }
}
