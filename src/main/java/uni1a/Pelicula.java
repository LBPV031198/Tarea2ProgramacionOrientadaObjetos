package uni1a;

import java.util.ArrayList;
import java.util.List;

public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private List<Actor> reparto;

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio, List<Actor> reparto) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.reparto = (reparto != null) ? reparto : new ArrayList<>();
    }

    public Pelicula(int id, String titulo, int duracion, String genero, String estudio, String actoresCSV) {
        super(id, titulo, duracion, genero);
        this.estudio = estudio;
        this.reparto = new ArrayList<>();
        if (!actoresCSV.isEmpty()) {
            String[] nombres = actoresCSV.split(";");
            for (String nombre : nombres) {
                this.reparto.add(new Actor(nombre.trim(), "", ""));
            }
        }
    }

    public String toCSV() {
        StringBuilder sb = new StringBuilder();
        for (Actor actor : reparto) {
            sb.append(actor.getNombre()).append(";");
        }
        if (!reparto.isEmpty()) sb.setLength(sb.length() - 1);
        return getId() + "," + getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + estudio + "," + sb.toString();
    }

    public String getEstudio() { return estudio; }
    public void setEstudio(String estudio) { this.estudio = estudio; }

    public List<Actor> getReparto() { return reparto; }
    public void setReparto(List<Actor> reparto) { this.reparto = reparto; }

    public void agregarActor(Actor actor) {
        if (this.reparto == null) {
            this.reparto = new ArrayList<>();
        }
        this.reparto.add(actor);
    }

    @Override
    public String detallesComoTexto() {
        StringBuilder sb = new StringBuilder();
        sb.append("Película: ").append(getTitulo())
          .append(" [").append(getGenero()).append("] - Duración: ").append(getDuracionEnMinutos()).append(" min\n")
          .append("Estudio: ").append(estudio).append("\nReparto:\n");
        for (Actor actor : reparto) {
            sb.append("  - ").append(actor.toString()).append("\n");
        }
        return sb.toString();
    }
}
