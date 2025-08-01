package uni1a;

public class Temporada {
    private int numeroTemporada;
    private int cantidadEpisodios;

    public Temporada(int numeroTemporada, int cantidadEpisodios) {
        this.numeroTemporada = numeroTemporada;
        this.cantidadEpisodios = cantidadEpisodios;
    }

    public Temporada(String csv) {
        String[] partes = csv.split(",");
        this.numeroTemporada = Integer.parseInt(partes[0]);
        this.cantidadEpisodios = Integer.parseInt(partes[1]);
    }

    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public int getCantidadEpisodios() {
        return cantidadEpisodios;
    }

    public void setCantidadEpisodios(int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
    }

    public String detallesComoTexto() {
        return "Temporada " + numeroTemporada + ": " + cantidadEpisodios + " episodios";
    }

    public String toCSV() {
        return numeroTemporada + "," + cantidadEpisodios;
    }
}
