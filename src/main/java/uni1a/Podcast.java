package uni1a;

public class Podcast extends ContenidoAudiovisual {
    private String anfitrion;
    private String plataformaDistribucion;

    public Podcast(String titulo, int duracionEnMinutos, String genero, String anfitrion, String plataformaDistribucion) {
        super(titulo, duracionEnMinutos, genero);
        this.anfitrion = anfitrion;
        this.plataformaDistribucion = plataformaDistribucion;
    }

    public Podcast(int id, String titulo, int duracion, String genero, String anfitrion, String plataformaDistribucion) {
        super(id, titulo, duracion, genero);
        this.anfitrion = anfitrion;
        this.plataformaDistribucion = plataformaDistribucion;
    }

    public String toCSV() {
        return getId() + "," + getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + anfitrion + "," + plataformaDistribucion;
    }

    public String getAnfitrion() { return anfitrion; }
    public void setAnfitrion(String anfitrion) { this.anfitrion = anfitrion; }

    public String getPlataformaDistribucion() { return plataformaDistribucion; }
    public void setPlataformaDistribucion(String plataformaDistribucion) { this.plataformaDistribucion = plataformaDistribucion; }

    @Override
    public String detallesComoTexto() {
        return "Podcast: " + getTitulo() +
               " [" + getGenero() + "] - Duración: " + getDuracionEnMinutos() + " min\n" +
               "Anfitrión: " + anfitrion + "\n" +
               "Plataforma: " + plataformaDistribucion + "\n";
    }
}
