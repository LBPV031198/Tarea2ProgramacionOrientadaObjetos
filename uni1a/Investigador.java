package uni1a;

/**
 * Clase Investigador, representa a un investigador que participa en un documental.
 * Relación de Agregación con Documental.
 */
public class Investigador {
    private String nombre;
    private String institucion;
    private String areaEspecializacion;

    /**
     * Constructor para la clase Investigador.
     * @param nombre El nombre del investigador.
     * @param institucion La institución a la que pertenece el investigador.
     * @param areaEspecializacion El área de especialización del investigador.
     */
    public Investigador(String nombre, String institucion, String areaEspecializacion) {
        this.nombre = nombre;
        this.institucion = institucion;
        this.areaEspecializacion = areaEspecializacion;
    }

    // --- Getters y Setters ---

    /**
     * Obtiene el nombre del investigador.
     * @return El nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del investigador.
     * @param nombre El nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la institución del investigador.
     * @return La institución.
     */
    public String getInstitucion() {
        return institucion;
    }

    /**
     * Establece la institución del investigador.
     * @param institucion La nueva institución.
     */
    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    /**
     * Obtiene el área de especialización del investigador.
     * @return El área de especialización.
     */
    public String getAreaEspecializacion() {
        return areaEspecializacion;
    }

    /**
     * Establece el área de especialización del investigador.
     * @param areaEspecializacion La nueva área de especialización.
     */
    public void setAreaEspecializacion(String areaEspecializacion) {
        this.areaEspecializacion = areaEspecializacion;
    }

    /**
     * Muestra los detalles del investigador.
     */
    public void mostrarDetalles() {
        System.out.println("    - Investigador: " + nombre + " (Institución: " + institucion + ", Área: " + areaEspecializacion + ")");
    }
}
