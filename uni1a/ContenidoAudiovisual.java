package uni1a;

/**
 * Clase abstracta base para todo contenido audiovisual.
 * Define atributos comunes y un método abstracto para mostrar detalles.
 */
public abstract class ContenidoAudiovisual {
    // Contador estático para asignar IDs únicos a cada instancia de ContenidoAudiovisual
    private static int contar = 0;
    private String titulo;
    private int duracionEnMinutos;
    private String genero;
    private int id;

    /**
     * Constructor para la clase ContenidoAudiovisual.
     * @param titulo El título del contenido.
     * @param duracionEnMinutos La duración en minutos del contenido.
     * @param genero El género del contenido.
     */
    public ContenidoAudiovisual(String titulo, int duracionEnMinutos, String genero) {
        this.id = contar++; // Asigna un ID único y lo incrementa
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.genero = genero;
    }

    // --- Getters y Setters ---

    /**
     * Obtiene el título del contenido.
     * @return El título.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título del contenido.
     * @param titulo El nuevo título.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene la duración en minutos del contenido.
     * @return La duración.
     */
    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    /**
     * Establece la duración en minutos del contenido.
     * @param duracionEnMinutos La nueva duración.
     */
    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    /**
     * Obtiene el género del contenido.
     * @return El género.
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece el género del contenido.
     * @param genero El nuevo género.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Obtiene el ID único del contenido.
     * @return El ID.
     */
    public int getId() {
        return id;
    }
    
    /**
     * Método abstracto para mostrar los detalles específicos de cada tipo de contenido audiovisual.
     * Debe ser implementado por las subclases.
     */
    public abstract void mostrarDetalles();
}
