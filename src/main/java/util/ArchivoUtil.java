package util;

import java.io.*;
import java.util.*;
import uni1a.*;

public class ArchivoUtil {

    // Guardar todos los contenidos audiovisuales en un solo archivo CSV
    public static void guardarContenidosCSV(String ruta, List<ContenidoAudiovisual> contenidos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta))) {
            for (ContenidoAudiovisual contenido : contenidos) {
                StringBuilder sb = new StringBuilder();
                if (contenido instanceof Pelicula) {
                    Pelicula p = (Pelicula) contenido;
                    sb.append("Pelicula").append(",");
                    sb.append(p.getId()).append(",");
                    sb.append(p.getTitulo()).append(",");
                    sb.append(p.getDuracionEnMinutos()).append(",");
                    sb.append(p.getGenero()).append(",");
                    sb.append(p.getEstudio()).append(",");

                    // Actores como "nombre-apellido|nombre-apellido"
                    List<Actor> reparto = p.getReparto();
                    for (int i = 0; i < reparto.size(); i++) {
                        Actor a = reparto.get(i);
                        sb.append(a.getNombre()).append("-").append(a.getApellido());
                        if (i < reparto.size() - 1) sb.append("|");
                    }

                } else if (contenido instanceof SerieDeTV) {
                    SerieDeTV s = (SerieDeTV) contenido;
                    sb.append("Serie").append(",");
                    sb.append(s.getId()).append(",");
                    sb.append(s.getTitulo()).append(",");
                    sb.append(s.getDuracionEnMinutos()).append(",");
                    sb.append(s.getGenero()).append(",");
                    sb.append(s.getTemporadas()).append(",");

                    List<Temporada> temporadas = s.getListaTemporadas();
                    for (int i = 0; i < temporadas.size(); i++) {
                        Temporada t = temporadas.get(i);
                        sb.append(t.getNumeroTemporada()).append("-").append(t.getCantidadEpisodios());
                        if (i < temporadas.size() - 1) sb.append("|");
                    }

                } else if (contenido instanceof Documental) {
                    Documental d = (Documental) contenido;
                    sb.append("Documental").append(",");
                    sb.append(d.getId()).append(",");
                    sb.append(d.getTitulo()).append(",");
                    sb.append(d.getDuracionEnMinutos()).append(",");
                    sb.append(d.getGenero()).append(",");
                    sb.append(d.getTema()).append(",");

                    List<Investigador> investigadores = d.getInvestigadores();
                    for (int i = 0; i < investigadores.size(); i++) {
                        Investigador inv = investigadores.get(i);
                        sb.append(inv.getNombre()).append("-").append(inv.getInstitucion()).append("-").append(inv.getAreaEspecializacion());
                        if (i < investigadores.size() - 1) sb.append("|");
                    }

                } else if (contenido instanceof VideoMusical) {
                    VideoMusical vm = (VideoMusical) contenido;
                    sb.append("VideoMusical").append(",");
                    sb.append(vm.getId()).append(",");
                    sb.append(vm.getTitulo()).append(",");
                    sb.append(vm.getDuracionEnMinutos()).append(",");
                    sb.append(vm.getGenero()).append(",");
                    sb.append(vm.getArtista()).append(",");
                    sb.append(vm.getAlbum());

                } else if (contenido instanceof Podcast) {
                    Podcast pc = (Podcast) contenido;
                    sb.append("Podcast").append(",");
                    sb.append(pc.getId()).append(",");
                    sb.append(pc.getTitulo()).append(",");
                    sb.append(pc.getDuracionEnMinutos()).append(",");
                    sb.append(pc.getGenero()).append(",");
                    sb.append(pc.getAnfitrion()).append(",");
                    sb.append(pc.getPlataformaDistribucion());

                } else {
                    // Otros tipos si hay
                    continue;
                }

                writer.write(sb.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar contenidos: " + e.getMessage());
        }
    }

    // Cargar todos los contenidos audiovisuales desde un archivo CSV
    public static List<ContenidoAudiovisual> cargarContenidosCSV(String ruta) {
        List<ContenidoAudiovisual> contenidos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",", -1);
                if (partes.length < 2) continue;

                String tipo = partes[0];

                switch (tipo) {
                    case "Pelicula": {
                        if (partes.length < 7) continue;
                        int id = Integer.parseInt(partes[1]);
                        String titulo = partes[2];
                        int duracion = Integer.parseInt(partes[3]);
                        String genero = partes[4];
                        String estudio = partes[5];
                        String actoresStr = partes[6];

                        Pelicula p = new Pelicula(id, titulo, duracion, genero, estudio, actoresStr);
                        contenidos.add(p);
                        break;
                    }
                    case "Serie": {
                        if (partes.length < 7) continue;
                        int id = Integer.parseInt(partes[1]);
                        String titulo = partes[2];
                        int duracion = Integer.parseInt(partes[3]);
                        String genero = partes[4];
                        int temporadasCount = Integer.parseInt(partes[5]);
                        String temporadasStr = partes[6];

                        List<Temporada> listaTemporadas = new ArrayList<>();
                        if (!temporadasStr.isEmpty()) {
                            String[] temporadasSplit = temporadasStr.split("\\|");
                            for (String tempStr : temporadasSplit) {
                                String[] numEpis = tempStr.split("-");
                                if (numEpis.length == 2) {
                                    int numero = Integer.parseInt(numEpis[0]);
                                    int episodios = Integer.parseInt(numEpis[1]);
                                    listaTemporadas.add(new Temporada(numero, episodios));
                                }
                            }
                        }

                        SerieDeTV s = new SerieDeTV(titulo, duracion, genero, temporadasCount, listaTemporadas);
                        contenidos.add(s);
                        break;
                    }
                    case "Documental": {
                        if (partes.length < 7) continue;
                        int id = Integer.parseInt(partes[1]);
                        String titulo = partes[2];
                        int duracion = Integer.parseInt(partes[3]);
                        String genero = partes[4];
                        String tema = partes[5];
                        String investigadoresStr = partes[6];

                        List<Investigador> investigadores = new ArrayList<>();
                        if (!investigadoresStr.isEmpty()) {
                            String[] invSplit = investigadoresStr.split("\\|");
                            for (String invStr : invSplit) {
                                String[] campos = invStr.split("-");
                                if (campos.length == 3) {
                                    investigadores.add(new Investigador(campos[0], campos[1], campos[2]));
                                }
                            }
                        }

                        Documental d = new Documental(titulo, duracion, genero, tema, investigadores);
                        contenidos.add(d);
                        break;
                    }
                    case "VideoMusical": {
                        if (partes.length < 7) continue;
                        int id = Integer.parseInt(partes[1]);
                        String titulo = partes[2];
                        int duracion = Integer.parseInt(partes[3]);
                        String genero = partes[4];
                        String artista = partes[5];
                        String album = partes[6];

                        VideoMusical vm = new VideoMusical(titulo, duracion, genero, artista, album);
                        contenidos.add(vm);
                        break;
                    }
                    case "Podcast": {
                        if (partes.length < 7) continue;
                        int id = Integer.parseInt(partes[1]);
                        String titulo = partes[2];
                        int duracion = Integer.parseInt(partes[3]);
                        String genero = partes[4];
                        String anfitrion = partes[5];
                        String plataforma = partes[6];

                        Podcast pc = new Podcast(titulo, duracion, genero, anfitrion, plataforma);
                        contenidos.add(pc);
                        break;
                    }
                    default:
                        // Otros tipos aquí
                        break;
                }
            }
        } catch (IOException e) {
            System.err.println("Error al cargar contenidos: " + e.getMessage());
        }
        return contenidos;
    }

}
