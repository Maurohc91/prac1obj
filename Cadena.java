package org.example;

import java.util.ArrayList;

public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaProgramas;

    // Constructor de la clase Cadena
    public Cadena(String nombre){
        this.nombre = nombre;
        this.listaProgramas = new ArrayList<>();
    }

    // Metodo para añadir un programa a la lista de programas
    public void anyadirPrograma(Programa programa) {
        // Solo añade el programa si no está ya en la lista
        if (!listaProgramas.contains(programa)) {
            listaProgramas.add(programa); // Añade el programa a la lista
        }
    }

    // Metodo para eliminar un programa de la lista
    public void eliminarPrograma(Programa programa) {
        this.listaProgramas.remove(programa); // Elimina el programa de la lista
    }

    // Metodo para mostrar los programas y sus directores
    public void mostrarPrograma() {
        for (Programa pro : listaProgramas) {
            // Imprime el nombre del programa
            System.out.print("- " + pro.getNombre() + " (Director: ");

            // Si el programa tiene un director, lo imprime
            if (pro.getDirector() != null) {
                System.out.println(pro.getDirector().getNombre() + ")");
            } else {
                // Si no tiene director, imprime "--"
                System.out.println("--");
            }
        }
    }

    // Setters y getters
    public String getNombre() {
        return nombre; 
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }

    // Sobrescribe el metodo toString para devolver una representación en texto de la cadena
    @Override
    public String toString() {
        return "Cadena{nombre='" + nombre + "', programas=" + listaProgramas + "}";
        // Devuelve el nombre de la cadena y la lista de programas que tiene
    }
}
