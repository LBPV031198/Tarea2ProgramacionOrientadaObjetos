package uni1a;

/**
 * Clase Actor, representa a un actor que participa en una película.
 * Relación de Agregación con Pelicula.
 */
public class Actor {
    private String nombre;
    private String apellido;
    private String fechaNacimiento; // Formato de fecha simple, por ejemplo "DD/MM/AAAA"

    /**
     * Constructor para la clase Actor.
     * @param nombre El nombre del actor.
     * @param apellido El apellido del actor.
     * @param fechaNacimiento La fecha de nacimiento del actor.
     */
    public Actor(String nombre, String apellido, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    // --- Getters y Setters ---

    /**
     * Obtiene el nombre del actor.
     * @return El nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del actor.
     * @param nombre El nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del actor.
     * @return El apellido.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del actor.
     * @param apellido El nuevo apellido.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene la fecha de nacimiento del actor.
     * @return La fecha de nacimiento.
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Establece la fecha de nacimiento del actor.
     * @param fechaNacimiento La nueva fecha de nacimiento.
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Muestra los detalles del actor.
     */
    public void mostrarDetalles() {
        System.out.println("    - Actor: " + nombre + " " + apellido + " (Nacimiento: " + fechaNacimiento + ")");
    }
}
