package uni1a;

import java.util.List; // Importa la clase List para manejar colecciones de actores
import java.util.ArrayList; // Importa ArrayList para inicializar la lista

/**
 * Subclase Pelicula que extiende de ContenidoAudiovisual.
 * Representa una película con su estudio y una lista de actores.
 * Relación de Agregación con Actor.
 */
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private List<Actor> reparto; // Lista de actores que participan en la película

    /**
     * Constructor para la clase Pelicula.
     * @param titulo El título de la película.
     * @param duracionEnMinutos La duración en minutos de la película.
     * @param genero El género de la película.
     * @param estudio El estudio que produjo la película.
     * @param reparto Una lista de objetos Actor que forman parte del reparto.
     */
    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio, List<Actor> reparto) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.reparto = reparto;
        // Si el reparto es nulo, inicializa una lista vacía para evitar NullPointerException
        if (this.reparto == null) {
            this.reparto = new ArrayList<>();
        }
    }

    // --- Getters y Setters ---

    /**
     * Obtiene el estudio de la película.
     * @return El estudio.
     */
    public String getEstudio() {
        return estudio;
    }

    /**
     * Establece el estudio de la película.
     * @param estudio El nuevo estudio.
     */
    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    /**
     * Obtiene la lista de actores del reparto.
     * @return La lista de actores.
     */
    public List<Actor> getReparto() {
        return reparto;
    }

    /**
     * Establece la lista de actores del reparto.
     * @param reparto La nueva lista de actores.
     */
    public void setReparto(List<Actor> reparto) {
        this.reparto = reparto;
    }

    /**
     * Agrega un actor al reparto de la película.
     * @param actor El actor a añadir.
     */
    public void agregarActor(Actor actor) {
        if (this.reparto == null) {
            this.reparto = new ArrayList<>();
        }
        this.reparto.add(actor);
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        System.out.println("Reparto:");
        if (reparto != null && !reparto.isEmpty()) {
            for (Actor actor : reparto) {
                actor.mostrarDetalles(); // Llama al método mostrarDetalles del objeto Actor
            }
        } else {
            System.out.println("    - No hay actores registrados para esta película.");
        }
        System.out.println();
    }
}
