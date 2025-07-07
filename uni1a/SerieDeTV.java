package uni1a;

import java.util.ArrayList; // Importa la clase List
import java.util.List; // Importa ArrayList

/**
 * Subclase SerieDeTV que extiende de ContenidoAudiovisual.
 * Representa una serie de televisión con el número de temporadas y una lista de objetos Temporada.
 * Relación de Composición con Temporada.
 */
public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas; // Este atributo podría ser redundante si se usa la lista de temporadas
    private List<Temporada> listaTemporadas; // Lista de objetos Temporada

    /**
     * Constructor para la clase SerieDeTV.
     * @param titulo El título de la serie.
     * @param duracionEnMinutos La duración promedio de un episodio en minutos.
     * @param genero El género de la serie.
     * @param temporadas El número total de temporadas de la serie.
     * @param listaTemporadas Una lista de objetos Temporada que componen la serie.
     */
    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas, List<Temporada> listaTemporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
        this.listaTemporadas = listaTemporadas;
        // Si la lista de temporadas es nula, inicializa una lista vacía
        if (this.listaTemporadas == null) {
            this.listaTemporadas = new ArrayList<>();
        }
    }

    // --- Getters y Setters ---

    /**
     * Obtiene el número total de temporadas.
     * @return El número de temporadas.
     */
    public int getTemporadas() {
        return temporadas;
    }

    /**
     * Establece el número total de temporadas.
     * @param temporadas El nuevo número de temporadas.
     */
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    /**
     * Obtiene la lista de objetos Temporada.
     * @return La lista de temporadas.
     */
    public List<Temporada> getListaTemporadas() {
        return listaTemporadas;
    }

    /**
     * Establece la lista de objetos Temporada.
     * @param listaTemporadas La nueva lista de temporadas.
     */
    public void setListaTemporadas(List<Temporada> listaTemporadas) {
        this.listaTemporadas = listaTemporadas;
    }

    /**
     * Agrega una temporada a la serie.
     * @param temporada La temporada a añadir.
     */
    public void agregarTemporada(Temporada temporada) {
        if (this.listaTemporadas == null) {
            this.listaTemporadas = new ArrayList<>();
        }
        this.listaTemporadas.add(temporada);
        this.temporadas = this.listaTemporadas.size(); // Actualiza el contador de temporadas
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración promedio por episodio en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Número total de temporadas: " + this.temporadas);
        System.out.println("Detalles de las temporadas:");
        if (listaTemporadas != null && !listaTemporadas.isEmpty()) {
            for (Temporada temp : listaTemporadas) {
                temp.mostrarDetalles(); // Llama al método mostrarDetalles del objeto Temporada
            }
        } else {
            System.out.println("    - No hay temporadas registradas para esta serie.");
        }
        System.out.println();
    }
}
