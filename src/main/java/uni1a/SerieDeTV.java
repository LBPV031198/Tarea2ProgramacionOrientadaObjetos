package uni1a;

import java.util.ArrayList;
import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;
    private List<Temporada> listaTemporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas, List<Temporada> listaTemporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
        this.listaTemporadas = (listaTemporadas != null) ? listaTemporadas : new ArrayList<>();
    }

    public SerieDeTV(int id, String titulo, int duracion, String genero, String temporadasCSV) {
    super(id, titulo, duracion, genero);
    this.listaTemporadas = new ArrayList<>();
    if (temporadasCSV != null && !temporadasCSV.isEmpty()) {
        String[] temporadasArr = temporadasCSV.split("\\|");
        for (String t : temporadasArr) {
            String[] partes = t.split("-");
            if (partes.length == 2) {
                int numeroTemporada = Integer.parseInt(partes[0]);
                int cantidadEpisodios = Integer.parseInt(partes[1]);
                this.listaTemporadas.add(new Temporada(numeroTemporada, cantidadEpisodios));
            }
        }
    }
    this.temporadas = listaTemporadas.size();
}


    public String toCSV() {
        StringBuilder sb = new StringBuilder();
        for (Temporada temp : listaTemporadas) {
            sb.append(temp.toCSV()).append("|");
        }
        if (!listaTemporadas.isEmpty()) sb.setLength(sb.length() - 1);
        return getId() + "," + getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + sb.toString();
    }

    public int getTemporadas() { return temporadas; }
    public void setTemporadas(int temporadas) { this.temporadas = temporadas; }

    public List<Temporada> getListaTemporadas() { return listaTemporadas; }
    public void setListaTemporadas(List<Temporada> listaTemporadas) { this.listaTemporadas = listaTemporadas; }

    public void agregarTemporada(Temporada temporada) {
        if (this.listaTemporadas == null) {
            this.listaTemporadas = new ArrayList<>();
        }
        this.listaTemporadas.add(temporada);
        this.temporadas = this.listaTemporadas.size();
    }

    @Override
    public String detallesComoTexto() {
        StringBuilder sb = new StringBuilder();
        sb.append("Serie de TV: ").append(getTitulo())
          .append(" [").append(getGenero()).append("] - Duración promedio: ")
          .append(getDuracionEnMinutos()).append(" min\n")
          .append("Temporadas: ").append(listaTemporadas.size()).append("\n");

        for (Temporada t : listaTemporadas) {
            sb.append("  ").append(t.detallesComoTexto()).append("\n");
        }

        return sb.toString();
    }
}
