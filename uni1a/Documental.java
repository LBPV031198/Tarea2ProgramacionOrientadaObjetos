package uni1a;

import java.util.ArrayList; // Importa la clase List
import java.util.List; // Importa ArrayList

/**
 * Subclase Documental que extiende de ContenidoAudiovisual.
 * Representa un documental con su tema y una lista de investigadores.
 * Relación de Agregación con Investigador.
 */
public class Documental extends ContenidoAudiovisual {
    private String tema;
    private List<Investigador> investigadores; // Lista de investigadores que participaron en el documental

    /**
     * Constructor para la clase Documental.
     * @param titulo El título del documental.
     * @param duracionEnMinutos La duración en minutos del documental.
     * @param genero El género del documental.
     * @param tema El tema principal del documental.
     * @param investigadores Una lista de objetos Investigador que participaron en el documental.
     */
    public Documental(String titulo, int duracionEnMinutos, String genero, String tema, List<Investigador> investigadores) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigadores = investigadores;
        // Si la lista de investigadores es nula, inicializa una lista vacía
        if (this.investigadores == null) {
            this.investigadores = new ArrayList<>();
        }
    }

    // --- Getters y Setters ---

    /**
     * Obtiene el tema del documental.
     * @return El tema.
     */
    public String getTema() {
        return tema;
    }

    /**
     * Establece el tema del documental.
     * @param tema El nuevo tema.
     */
    public void setTema(String tema) {
        this.tema = tema;
    }

    /**
     * Obtiene la lista de investigadores del documental.
     * @return La lista de investigadores.
     */
    public List<Investigador> getInvestigadores() {
        return investigadores;
    }

    /**
     * Establece la lista de investigadores del documental.
     * @param investigadores La nueva lista de investigadores.
     */
    public void setInvestigadores(List<Investigador> investigadores) {
        this.investigadores = investigadores;
    }

    /**
     * Agrega un investigador al documental.
     * @param investigador El investigador a añadir.
     */
    public void agregarInvestigador(Investigador investigador) {
        if (this.investigadores == null) {
            this.investigadores = new ArrayList<>();
        }
        this.investigadores.add(investigador);
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        System.out.println("Investigadores:");
        if (investigadores != null && !investigadores.isEmpty()) {
            for (Investigador inv : investigadores) {
                inv.mostrarDetalles(); // Llama al método mostrarDetalles del objeto Investigador
            }
        } else {
            System.out.println("    - No hay investigadores registrados para este documental.");
        }
        System.out.println();
    }
}
