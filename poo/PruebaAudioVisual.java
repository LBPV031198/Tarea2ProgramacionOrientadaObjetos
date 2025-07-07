package poo;

import java.util.ArrayList; // Importa todas las clases del paquete uni1a
import java.util.List; // Necesario para crear listas
import uni1a.*;     // Necesario para usar la interfaz List

/**
 * Clase principal para probar el sistema de Contenidos Audiovisuales.
 * Demuestra la creación de instancias de todas las subclases
 * y sus relaciones con Actor, Temporada e Investigador.
 */
public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("¡Hola desde Eclipse y el sistema de Contenidos Audiovisuales completo!");
        System.out.println("-------------------------------------------------------------------\n");

        // --- Creación de instancias de las clases de relación (Actor, Temporada, Investigador) ---

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
        temporadasGoT.add(temp2GoT); // Añadimos solo las primeras dos para el ejemplo

        // Investigadores para "Cosmos"
        Investigador inv1Cosmos = new Investigador("Neil deGrasse", "Museo Americano de Historia Natural", "Astrofísica");
        Investigador inv2Cosmos = new Investigador("Carl", "Sagan", "Astronomía"); // Un guiño al original
        List<Investigador> investigadoresCosmos = new ArrayList<>();
        investigadoresCosmos.add(inv1Cosmos);
        investigadoresCosmos.add(inv2Cosmos);

        // --- Crear instancias de las subclases de ContenidoAudiovisual con sus relaciones ---

        // Array para almacenar todos los contenidos audiovisuales
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];

        // Película con reparto
        contenidos[0] = new Pelicula("Avatar", 162, "Ciencia Ficción", "20th Century Studios", repartoAvatar);
        
        // Serie de TV con temporadas
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasía", 8, temporadasGoT);
        // Podemos añadir más temporadas después de la creación
        ((SerieDeTV) contenidos[1]).agregarTemporada(new Temporada(3, 10));

        // Documental con investigadores
        contenidos[2] = new Documental("Cosmos: Una Odisea Espacio-Tiempo", 45, "Ciencia", "Astronomía y Física", investigadoresCosmos);

        // Video Musical
        contenidos[3] = new VideoMusical("Bohemian Rhapsody", 6, "Rock", "Queen", "A Night at the Opera");

        // Podcast
        contenidos[4] = new Podcast("La Vida Moderna", 40, "Comedia", "David Broncano", "Cadena SER / Spotify");

        // --- Mostrar los detalles de cada contenido audiovisual ---
        System.out.println("Mostrando detalles de todos los contenidos audiovisuales:\n");
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }

        System.out.println("-------------------------------------------------------------------");
        System.out.println("¡El sistema de Contenidos Audiovisuales completo está funcionando!");
    }
}