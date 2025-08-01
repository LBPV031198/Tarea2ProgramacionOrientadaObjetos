package uni1a;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VideoMusicalTest {

    @Test
    public void testConstructorYGetters() {
        VideoMusical vm = new VideoMusical("Thriller", 14, "Pop", "Michael Jackson", "Thriller");
        assertEquals("Thriller", vm.getTitulo());
        assertEquals(14, vm.getDuracionEnMinutos());
        assertEquals("Pop", vm.getGenero());
        assertEquals("Michael Jackson", vm.getArtista());
        assertEquals("Thriller", vm.getAlbum());
    }

    @Test
    public void testSetters() {
        VideoMusical vm = new VideoMusical("Shape of You", 4, "Pop", "Ed Sheeran", "Divide");
        vm.setTitulo("Perfect");
        vm.setDuracionEnMinutos(5);
        vm.setGenero("Ballad");
        vm.setArtista("Ed Sheeran");
        vm.setAlbum("Divide Deluxe");

        assertEquals("Perfect", vm.getTitulo());
        assertEquals(5, vm.getDuracionEnMinutos());
        assertEquals("Ballad", vm.getGenero());
        assertEquals("Ed Sheeran", vm.getArtista());
        assertEquals("Divide Deluxe", vm.getAlbum());
    }

    @Test
    public void testDetallesComoTexto() {
        VideoMusical vm = new VideoMusical("Bohemian Rhapsody", 6, "Rock", "Queen", "A Night at the Opera");
        String esperado = "Video Musical: Bohemian Rhapsody | Género: Rock | Duración: 6 min | Artista: Queen | Álbum: A Night at the Opera";
        assertEquals(esperado, vm.detallesComoTexto());
    }

    @Test
    public void testToCSV() {
        VideoMusical vm = new VideoMusical("Imagine", 3, "Pop", "John Lennon", "Imagine");
        String esperado = "Imagine,3,Pop,John Lennon,Imagine";
        assertEquals(esperado, vm.toCSV());
    }
}
