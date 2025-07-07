package uni1a;

/**
 * Clase Temporada, representa una temporada de una serie de TV.
 * Relación de Composición con SerieDeTV (una temporada no existe sin una serie).
 */
public class Temporada {
    private int numeroTemporada;
    private int cantidadEpisodios;

    /**
     * Constructor para la clase Temporada.
     * @param numeroTemporada El número de la temporada.
     * @param cantidadEpisodios La cantidad de episodios en esta temporada.
     */
    public Temporada(int numeroTemporada, int cantidadEpisodios) {
        this.numeroTemporada = numeroTemporada;
        this.cantidadEpisodios = cantidadEpisodios;
    }

    // --- Getters y Setters ---

    /**
     * Obtiene el número de la temporada.
     * @return El número de temporada.
     */
    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    /**
     * Establece el número de la temporada.
     * @param numeroTemporada El nuevo número de temporada.
     */
    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    /**
     * Obtiene la cantidad de episodios de la temporada.
     * @return La cantidad de episodios.
     */
    public int getCantidadEpisodios() {
        return cantidadEpisodios;
    }

    /**
     * Establece la cantidad de episodios de la temporada.
     * @param cantidadEpisodios La nueva cantidad de episodios.
     */
    public void setCantidadEpisodios(int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
    }

    /**
     * Muestra los detalles de la temporada.
     */
    public void mostrarDetalles() {
        System.out.println("    - Temporada " + numeroTemporada + ": " + cantidadEpisodios + " episodios");
    }
}
