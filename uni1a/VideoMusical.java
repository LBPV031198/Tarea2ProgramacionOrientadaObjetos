package uni1a;

/**
 * Subclase VideoMusical que extiende de ContenidoAudiovisual.
 * Representa un video musical, con atributos adicionales como el artista y el álbum.
 */
public class VideoMusical extends ContenidoAudiovisual {
    private String artista; // Nombre del artista o banda
    private String album;   // Nombre del álbum al que pertenece el video

    /**
     * Constructor para la clase VideoMusical.
     * @param titulo El título del video musical.
     * @param duracionEnMinutos La duración en minutos del video musical.
     * @param genero El género musical del video.
     * @param artista El nombre del artista o banda.
     * @param album El nombre del álbum al que pertenece el video.
     */
    public VideoMusical(String titulo, int duracionEnMinutos, String genero, String artista, String album) {
        super(titulo, duracionEnMinutos, genero);
        this.artista = artista;
        this.album = album;
    }

    // --- Getters y Setters ---

    /**
     * Obtiene el nombre del artista o banda.
     * @return El nombre del artista.
     */
    public String getArtista() {
        return artista;
    }

    /**
     * Establece el nombre del artista o banda.
     * @param artista El nuevo nombre del artista.
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     * Obtiene el nombre del álbum.
     * @return El nombre del álbum.
     */
    public String getAlbum() {
        return album;
    }

    /**
     * Establece el nombre del álbum.
     * @param album El nuevo nombre del álbum.
     */
    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Video Musical:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Artista: " + artista);
        System.out.println("Álbum: " + album);
        System.out.println();
    }
}