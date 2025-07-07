package uni1a;

/**
 * Subclase Podcast que extiende de ContenidoAudiovisual.
 * Representa un podcast, con atributos adicionales como el anfitrión y la plataforma de distribución.
 */
public class Podcast extends ContenidoAudiovisual {
    private String anfitrion; // Nombre del anfitrión o presentador del podcast
    private String plataformaDistribucion; // Plataforma donde se distribuye el podcast (ej. Spotify, Apple Podcasts)

    /**
     * Constructor para la clase Podcast.
     * @param titulo El título del podcast.
     * @param duracionEnMinutos La duración promedio de un episodio en minutos.
     * @param genero El género del podcast (ej. Comedia, Noticias, Educación).
     * @param anfitrion El nombre del anfitrión del podcast.
     * @param plataformaDistribucion La plataforma de distribución del podcast.
     */
    public Podcast(String titulo, int duracionEnMinutos, String genero, String anfitrion, String plataformaDistribucion) {
        super(titulo, duracionEnMinutos, genero);
        this.anfitrion = anfitrion;
        this.plataformaDistribucion = plataformaDistribucion;
    }

    // --- Getters y Setters ---

    /**
     * Obtiene el nombre del anfitrión del podcast.
     * @return El nombre del anfitrión.
     */
    public String getAnfitrion() {
        return anfitrion;
    }

    /**
     * Establece el nombre del anfitrión del podcast.
     * @param anfitrion El nuevo nombre del anfitrión.
     */
    public void setAnfitrion(String anfitrion) { // <-- CORREGIDO AQUÍ
        this.anfitrion = anfitrion;
    }

    /**
     * Obtiene la plataforma de distribución del podcast.
     * @return La plataforma de distribución.
     */
    public String getPlataformaDistribucion() {
        return plataformaDistribucion;
    }

    /**
     * Establece la plataforma de distribución del podcast.
     * @param plataformaDistribucion La nueva plataforma de distribución.
     */
    public void setPlataformaDistribucion(String plataformaDistribucion) { // <-- CORREGIDO AQUÍ
        this.plataformaDistribucion = plataformaDistribucion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Podcast:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Anfitrión: " + anfitrion);
        System.out.println("Plataforma de Distribución: " + plataformaDistribucion);
        System.out.println();
    }
}