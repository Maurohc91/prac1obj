package org.example;

import java.util.ArrayList;

public class Programa {

    private String nombre;
    private Cadena cadena;
    private int temporadas = 0;
    private ArrayList<Invitado> listaInvitados;
    private ArrayList<Empleado> listaEmpleados;
    private Empleado director;

    // Constructor que asigna nombre, cadena y director, y agrega el programa a la cadena
    public Programa(String nombre, Cadena cadena, String director){

        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0; // Inicializa el número de temporadas en 0
        listaEmpleados = new ArrayList<>();
        listaInvitados = new ArrayList<>();
        this.director = new Empleado(director); // Crea un director para el programa
        cadena.anyadirPrograma(this); // Agrega el programa a la lista de programas de la cadena
        this.listaEmpleados.add(this.director); // Añade el director a la lista de empleados

    }

    // Metodo para añadir un empleado al programa, si no existe ya
    public void anyadirEmpleado(String nombre, String cargo, Empleado director){

        for (Empleado emp : listaEmpleados) {
            if (emp.getNombre().equals(nombre)) {
                System.out.println("el empleado " + nombre + " ya existe.");
                return; // Si el empleado ya está en la lista, no lo añade
            }
        }
        Empleado empleado = new Empleado(nombre, cargo, director); // Crea un nuevo empleado
    }

    // Metodo para eliminar un empleado del programa
    public void eliminarEmpleado(String nombre) {
        for (Empleado emp : listaEmpleados) {
            if (emp.getNombre().equals(nombre)) {
                listaEmpleados.remove(emp); // Elimina al empleado de la lista
                break; // Sale del bucle una vez que encuentra y elimina el empleado
            }
        }
    }

    // Metodo para mostrar los empleados del programa
    public void mostrarEmpleados() {

        for(Empleado emp : listaEmpleados) {
            System.out.println("- "+emp.getNombre()+" ("+emp.getCargo()+")"); // Imprime el nombre y cargo de cada empleado
        }
    }

    // Metodo para añadir un invitado al programa
    public void anyadirInvitado(String nombre, String profesion, int temporada) {
        Invitado invitado = new Invitado(nombre, profesion, temporada); // Crea un nuevo invitado
        listaInvitados.add(invitado); // Añade el invitado a la lista
    }

    // Metodo para eliminar un invitado del programa
    public void eliminarInvitado(String nombre) {
        for (Invitado inv : listaInvitados) {
            if (inv.getNombre().equals(nombre)) {
                listaInvitados.remove(inv); // Elimina al invitado de la lista
                break; // Sale del bucle una vez que encuentra y elimina el invitado
            }
        }
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    // Sobrescribe el metodo toString para devolver una representación del programa en formato texto
    @Override
    public String toString() {
        return "Programa{nombre='" + nombre + "', cadena=" + cadena.getNombre() +
                ", temporadas=" + temporadas + ", listaEmpleados=" + listaEmpleados +
                ", listaInvitados=" + listaInvitados + "}"; // Devuelve toda la información del programa
    }

}
