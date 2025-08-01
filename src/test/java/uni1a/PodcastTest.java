package uni1a;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PodcastTest {

    @Test
    public void testConstructorYGetters() {
        Podcast podcast = new Podcast("La Vida Moderna", 40, "Comedia", "David Broncano", "Cadena SER / Spotify");
        
        assertEquals("La Vida Moderna", podcast.getTitulo());
        assertEquals(40, podcast.getDuracionEnMinutos());
        assertEquals("Comedia", podcast.getGenero());
        assertEquals("David Broncano", podcast.getAnfitrion());
        assertEquals("Cadena SER / Spotify", podcast.getPlataformaDistribucion());
    }

    @Test
    public void testSetters() {
        Podcast podcast = new Podcast("Titulo", 30, "Genero", "Anfitrion", "Plataforma");
        
        podcast.setTitulo("Nuevo Titulo");
        podcast.setDuracionEnMinutos(50);
        podcast.setGenero("Drama");
        podcast.setAnfitrion("Nuevo Anfitrion");
        podcast.setPlataformaDistribucion("Nueva Plataforma");
        
        assertEquals("Nuevo Titulo", podcast.getTitulo());
        assertEquals(50, podcast.getDuracionEnMinutos());
        assertEquals("Drama", podcast.getGenero());
        assertEquals("Nuevo Anfitrion", podcast.getAnfitrion());
        assertEquals("Nueva Plataforma", podcast.getPlataformaDistribucion());
    }

    @Test
    public void testToCSV() {
        Podcast podcast = new Podcast(1, "La Vida Moderna", 40, "Comedia", "David Broncano", "Cadena SER / Spotify");
        String csv = podcast.toCSV();
        assertTrue(csv.startsWith("1,La Vida Moderna,40,Comedia"));
        assertTrue(csv.contains("David Broncano"));
        assertTrue(csv.contains("Cadena SER / Spotify"));
    }

    @Test
    public void testDetallesComoTexto() {
        Podcast podcast = new Podcast("La Vida Moderna", 40, "Comedia", "David Broncano", "Cadena SER / Spotify");
        String detalles = podcast.detallesComoTexto();
        assertTrue(detalles.contains("Podcast: La Vida Moderna"));
        assertTrue(detalles.contains("[Comedia]"));
        assertTrue(detalles.contains("Duración: 40 min"));
        assertTrue(detalles.contains("Anfitrión: David Broncano"));
        assertTrue(detalles.contains("Plataforma: Cadena SER / Spotify"));
    }
}
