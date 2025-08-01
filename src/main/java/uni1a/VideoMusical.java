package uni1a;

public class VideoMusical extends ContenidoAudiovisual {
    private String artista;
    private String album;

    public VideoMusical(String titulo, int duracionEnMinutos, String genero, String artista, String album) {
        super(titulo, duracionEnMinutos, genero);
        this.artista = artista;
        this.album = album;
    }

    public VideoMusical(String csv) {
        String[] partes = csv.split(",");
        super(partes[0], Integer.parseInt(partes[1]), partes[2]);
        this.artista = partes[3];
        this.album = partes[4];
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String detallesComoTexto() {
        return "Video Musical: " + getTitulo() +
               " | Género: " + getGenero() +
               " | Duración: " + getDuracionEnMinutos() + " min" +
               " | Artista: " + artista +
               " | Álbum: " + album;
    }

    public String toCSV() {
        return getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + artista + "," + album;
    }
}
