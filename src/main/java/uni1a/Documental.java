package uni1a;

import java.util.ArrayList;
import java.util.List;

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private List<Investigador> investigadores;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema, List<Investigador> investigadores) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigadores = (investigadores != null) ? investigadores : new ArrayList<>();
    }

    public Documental(int id, String titulo, int duracion, String genero, String tema, String investigadoresCSV) {
        super(id, titulo, duracion, genero);
        this.tema = tema;
        this.investigadores = new ArrayList<>();
        if (!investigadoresCSV.isEmpty()) {
            String[] nombres = investigadoresCSV.split(";");
            for (String nombre : nombres) {
                this.investigadores.add(new Investigador(nombre.trim()));
            }
        }
    }

    public String toCSV() {
        StringBuilder sb = new StringBuilder();
        for (Investigador inv : investigadores) {
            sb.append(inv.getNombre()).append(";");
        }
        if (!investigadores.isEmpty()) sb.setLength(sb.length() - 1);
        return getId() + "," + getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + tema + "," + sb.toString();
    }

    public String getTema() { return tema; }
    public void setTema(String tema) { this.tema = tema; }

    public List<Investigador> getInvestigadores() { return investigadores; }
    public void setInvestigadores(List<Investigador> investigadores) { this.investigadores = investigadores; }

    public void agregarInvestigador(Investigador investigador) {
        if (this.investigadores == null) {
            this.investigadores = new ArrayList<>();
        }
        this.investigadores.add(investigador);
    }

    @Override
    public String detallesComoTexto() {
        StringBuilder sb = new StringBuilder();
        sb.append("Documental: ").append(getTitulo())
          .append(" [").append(getGenero()).append("] - Duración: ")
          .append(getDuracionEnMinutos()).append(" min\n")
          .append("Tema: ").append(tema).append("\nInvestigadores:\n");
        for (Investigador inv : investigadores) {
            sb.append("  - ").append(inv.toString()).append("\n");
        }
        return sb.toString();
    }
}
