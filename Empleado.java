package org.example;

public class Empleado {

    public static int cantidadProgramas = 0;
    public static final String ID_EMPLEADO = "EP";


    private String nombre;
    private String cargo;
    private Empleado director;
    private String id;

    // Constructor que asigna el nombre y establece el cargo como "director" por defecto
    public Empleado(String nombre){
        this(nombre, "director", null); // Llama al otro constructor con "director" y sin director
    }

    // Constructor que recibe nombre, cargo y director
    public Empleado(String nombre, String cargo, Empleado director){
        this.nombre = nombre;
        setCargo(cargo); // Establece el cargo
        setDirector(director); // Establece el director del empleado
        this.id = calcularID(); // Calcula y asigna un ID único para el empleado
    }

    // Metodo para generar un ID único para cada empleado
    private String calcularID(){
        return ID_EMPLEADO + String.format("%03d", ++cantidadProgramas); // Genera el ID con un contador
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    public String getCargo() {
        return cargo;
    }
    // Metodo para establecer el cargo del empleado
    public void setCargo(String cargo) {
        if (cargo.equals("director") || cargo.equals("técnico") || cargo.equals("presentador") || cargo.equals("colaborador")) {
            this.cargo = cargo; // Si es válido, lo asigna
        } else {
            this.cargo = "pte"; // Si no es válido, asigna "pte" por defecto
        }
    }

    // Metodo toString para devolver una representación del empleado en formato texto
    @Override
    public String toString() {
        String directorNombre = "--"; // Si no tiene director, mostramos "--"

        // Si tiene director, obtenemos su nombre
        if (director != null) {
            directorNombre = director.getNombre();
        }

        // Devuelve una cadena con la información del empleado
        return "Empleado{id='" + id +
                "', nombre='" + nombre +
                "', cargo='" + cargo +
                "', director=" + directorNombre + "}";
    }
}
