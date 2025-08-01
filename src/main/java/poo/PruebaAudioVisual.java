package poo;

import java.util.ArrayList;
import java.util.List;
import uni1a.*;
import util.ArchivoUtil;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        // --- Crear listas auxiliares para las relaciones ---
        
        // Actores para la película "Avatar"
        Actor actor1 = new Actor("Sam", "Worthington", "02/08/1976");
        Actor actor2 = new Actor("Zoe", "Saldana", "19/06/1978");
        List<Actor> repartoAvatar = new ArrayList<>();
        repartoAvatar.add(actor1);
        repartoAvatar.add(actor2);

        // Temporadas para "Game of Thrones"
        Temporada temp1GoT = new Temporada(1, 10);
        Temporada temp2GoT = new Temporada(2, 10);
        List<Temporada> temporadasGoT = new ArrayList<>();
        temporadasGoT.add(temp1GoT);
        temporadasGoT.add(temp2GoT);
        
        // Investigadores para "Cosmos"
        Investigador inv1Cosmos = new Investigador("Neil deGrasse", "Museo Americano de Historia Natural", "Astrofísica");
        Investigador inv2Cosmos = new Investigador("Carl", "Sagan", "Astronomía");
        List<Investigador> investigadoresCosmos = new ArrayList<>();
        investigadoresCosmos.add(inv1Cosmos);
        investigadoresCosmos.add(inv2Cosmos);

        // --- Crear lista de contenidos ---
        List<ContenidoAudiovisual> contenidos = new ArrayList<>();

        contenidos.add(new Pelicula("Avatar", 162, "Ciencia Ficción", "20th Century Studios", repartoAvatar));
        contenidos.add(new SerieDeTV("Game of Thrones", 60, "Fantasía", temporadasGoT.size(), temporadasGoT));
        contenidos.add(new Documental("Cosmos", 45, "Ciencia", "Astronomía y Física", investigadoresCosmos));
        contenidos.add(new VideoMusical("Bohemian Rhapsody", 6, "Rock", "Queen", "A Night at the Opera"));
        contenidos.add(new Podcast("La Vida Moderna", 40, "Comedia", "David Broncano", "Cadena SER / Spotify"));

        // --- Guardar todos juntos ---
        ArchivoUtil.guardarContenidosCSV("contenidos.csv", contenidos);

        // --- Cargar todos ---
        List<ContenidoAudiovisual> cargados = ArchivoUtil.cargarContenidosCSV("contenidos.csv");

        // --- Mostrar detalles ---
        for (ContenidoAudiovisual c : cargados) {
            System.out.println(c.detallesComoTexto());
            System.out.println("-------------------------------------------------");
        }
    }
}
