package poo;

import java.util.ArrayList;
import java.util.List;
import uni1a.*;
import util.ArchivoUtil;

public class ControladorContenido {

    private List<Pelicula> peliculas;
    private List<SerieDeTV> series;
    private List<Documental> documentales;
    private List<Podcast> podcasts;
    private List<VideoMusical> videosMusicales;

    public ControladorContenido() {
        peliculas = new ArrayList<>();
        series = new ArrayList<>();
        documentales = new ArrayList<>();
        podcasts = new ArrayList<>();
        videosMusicales = new ArrayList<>();
    }

    // --- Métodos para agregar contenido ---

    public void agregarPelicula(Pelicula p) {
        peliculas.add(p);
    }

    public void agregarSerie(SerieDeTV s) {
        series.add(s);
    }

    public void agregarDocumental(Documental d) {
        documentales.add(d);
    }

    public void agregarPodcast(Podcast p) {
        podcasts.add(p);
    }

    public void agregarVideoMusical(VideoMusical v) {
        videosMusicales.add(v);
    }

    // --- Listar todos los contenidos ---

    public void listarPeliculas() {
        System.out.println("Películas:");
        for (Pelicula p : peliculas) {
            System.out.println(p.detallesComoTexto());
        }
    }

    public void listarSeries() {
        System.out.println("Series de TV:");
        for (SerieDeTV s : series) {
            System.out.println(s.detallesComoTexto());
        }
    }

    public void listarDocumentales() {
        System.out.println("Documentales:");
        for (Documental d : documentales) {
            System.out.println(d.detallesComoTexto());
        }
    }

    public void listarPodcasts() {
        System.out.println("Podcasts:");
        for (Podcast p : podcasts) {
            System.out.println(p.detallesComoTexto());
        }
    }

    public void listarVideosMusicales() {
        System.out.println("Videos Musicales:");
        for (VideoMusical v : videosMusicales) {
            System.out.println(v.detallesComoTexto());
        }
    }

    // --- Guardar todo el contenido junto en un solo CSV ---

    public void guardarContenidosCSV(String ruta) {
        List<ContenidoAudiovisual> todos = new ArrayList<>();
        todos.addAll(peliculas);
        todos.addAll(series);
        todos.addAll(documentales);
        todos.addAll(podcasts);
        todos.addAll(videosMusicales);
        ArchivoUtil.guardarContenidosCSV(ruta, todos);
    }

    // --- Cargar todo el contenido junto desde un solo CSV ---

    public void cargarContenidosCSV(String ruta) {
        List<ContenidoAudiovisual> cargados = ArchivoUtil.cargarContenidosCSV(ruta);

        // Opcional: limpiar listas para no duplicar
        peliculas.clear();
        series.clear();
        documentales.clear();
        podcasts.clear();
        videosMusicales.clear();

        for (ContenidoAudiovisual c : cargados) {
            if (c instanceof Pelicula) {
                peliculas.add((Pelicula) c);
            } else if (c instanceof SerieDeTV) {
                series.add((SerieDeTV) c);
            } else if (c instanceof Documental) {
                documentales.add((Documental) c);
            } else if (c instanceof Podcast) {
                podcasts.add((Podcast) c);
            } else if (c instanceof VideoMusical) {
                videosMusicales.add((VideoMusical) c);
            }
        }
    }

    // --- Búsqueda simple por título en todas las listas ---

    public void buscarPorTitulo(String titulo) {
        System.out.println("Buscando por título: " + titulo);

        for (Pelicula p : peliculas) {
            if (p.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Película encontrada:\n" + p.detallesComoTexto());
            }
        }

        for (SerieDeTV s : series) {
            if (s.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Serie encontrada:\n" + s.detallesComoTexto());
            }
        }

        for (Documental d : documentales) {
            if (d.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Documental encontrado:\n" + d.detallesComoTexto());
            }
        }

        for (Podcast p : podcasts) {
            if (p.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Podcast encontrado:\n" + p.detallesComoTexto());
            }
        }

        for (VideoMusical v : videosMusicales) {
            if (v.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Video Musical encontrado:\n" + v.detallesComoTexto());
            }
        }
    }
}
